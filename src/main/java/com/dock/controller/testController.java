package com.dock.controller;

import com.dock.model.v_t_xk_by_yjskc;
import com.dock.service.testService.Impl.TestServiceImpl;
import com.dock.service.testService.TestService;
//import com.dock.service.testService1.Impl.TestService1Impl;
//import com.dock.service.testService1.TestService1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Description:
 * @Author: zf
 * @Date: 2019/2/22 15:31
 */

@Controller
@RequestMapping(value = "/test")
public class testController {

    @Autowired
    private TestService testService;

//    @Autowired
//    private TestService1 testService1;




    @ResponseBody
    @RequestMapping("/con")
    public Map<String, Object> testCon(){
//        List<v_t_xk_by_yjskc> list = testService.testCon();
        Map<String,Object> result = new HashMap<>();
        result.put("one", testService.testCon());
//        result.put("two",testService1.testCon1());
        return result;
    }

    /**
     * 测试异步源数据库
     * @return
     */
    @ResponseBody
    @RequestMapping("/te1")
    public Map<String, Object> testCon1(){
        Map<String,Object> result = new HashMap<>();
        result.put("two",testService.testCon());
        return result;
    }

    /**
     * 测试单源数据库
     * @return
     */
    @ResponseBody
    @RequestMapping("/te2")
    public Map<String, Object> testCon2(){
        Map<String,Object> result = new HashMap<>();
        result.put("two",testService.testCon2());
        return result;
    }
}
