package com.dock.dao.second;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
@Mapper
public interface TestDaoTwo {
    List testDaoTwo();
}


