package com.qi.demo;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.qi.demo.service.DemoService;

@RestController
@RequestMapping("/demo")
public class DemoController {
	
	@Resource
	private DemoService demoService;
	
	@RequestMapping("/getDemo")
	public Demo getDemo(){
		Demo demo = new Demo();
		demo.setId(3);
		demo.setName("老王");
		return demo;
	}
	
	@RequestMapping("/getById")
	public Demo getById(long id){
		return demoService.getById(id);
	}
	
	@RequestMapping("/zeroException")
    public int zeroException(){
       return 100/0;
    }
	
	

}
