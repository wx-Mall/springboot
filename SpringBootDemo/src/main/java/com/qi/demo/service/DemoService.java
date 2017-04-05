package com.qi.demo.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.qi.demo.Demo;
import com.qi.demo.dao.DemoDao;

@Service
public class DemoService {

	@Resource
    private DemoDao demoDao;
	
	public Demo getById(long id){
        return demoDao.getById(id);
	}
	
}
