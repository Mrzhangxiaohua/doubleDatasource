package com.dock.service.testService.Impl;

        import com.dock.dao.master.TestDao;
        import com.dock.dao.second.TestDaoTwo;
        import com.dock.model.v_t_xk_by_yjskc;
        import com.dock.service.testService.TestService;
        import org.springframework.beans.factory.annotation.Autowired;
        import org.springframework.stereotype.Service;

        import java.util.ArrayList;
        import java.util.List;

/**
 * @Description:
 * @Author: zf
 * @Date: 2019/2/22 15:39
 */
@Service
public class TestServiceImpl implements TestService {

    @Autowired
    private TestDao testDao;

    @Autowired
    private TestDaoTwo testDaoTwo;

    @Override
    public List testCon() {
        List<v_t_xk_by_yjskc> list = testDao.testCon();
        System.out.println("============第一个数据库");
        System.out.println(list);
        List list1 = testDaoTwo.testDaoTwo();
        System.out.println(list1);

        List listall  = new ArrayList();
        listall.add(list);
        listall.add(list1);
        return listall;
    }

    @Override
    public List testCon2() {
        return testDaoTwo.testDaoTwo();
    }
}
