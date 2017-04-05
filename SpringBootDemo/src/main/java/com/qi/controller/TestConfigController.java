package com.qi.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.qi.config.TestConfig;

@Controller
@RequestMapping("/test")
public class TestConfigController {
	
	private static final Logger LOG = LoggerFactory.getLogger(TestConfigController.class);

	@Autowired
	private TestConfig testConfig ;
	
	@RequestMapping("/property")
	@ResponseBody
	public TestConfig getTestConfig() {
		
		LOG.info("测试自定义属性文件的加载{}",testConfig.getName());
		return testConfig;
	}
	
	@RequestMapping("/hello")
	@ResponseBody
	public String hello(String name,String state) {
		LOG.debug("debug.....................");
		LOG.info("info.....................");
		LOG.warn("warn.....................");
		return name+":"+state;
	}
}
