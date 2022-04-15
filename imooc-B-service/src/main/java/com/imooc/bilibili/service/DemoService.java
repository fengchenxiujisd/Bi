package com.imooc.bilibili.service;

import com.imooc.bilibili.dao.DemoDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DemoService {
    @Autowired
    private DemoDao demoDao;

    public String query(Long id){
        return demoDao.query(id);
    }
}
