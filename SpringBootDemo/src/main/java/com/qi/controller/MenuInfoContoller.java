package com.qi.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
@RequestMapping("/system")
public class MenuInfoContoller {
	
	private static final Logger LOG = LoggerFactory.getLogger(MenuInfoContoller.class);

	@RequestMapping(value = "/menu", method=RequestMethod.GET)
	@ResponseBody
	public String getMenus(){
		LOG.info("查询菜单");
		//TODO 目前没有做登陆，后面做了登陆之后获取菜单将在登陆中做。
		
		
		return "";
	}
	
	 @RequestMapping(value="/getHeader",method=RequestMethod.GET)
	 @ResponseBody
	    public ModelAndView getHeader(
	            @RequestHeader(value = "Host",required=false) String host,
	            @RequestHeader(value = "User-Agent",required=false) String userAgent,
	            @RequestHeader(value = "Accept",required=false) String accept,
	            @RequestHeader(value = "Accept-Language",required=false) String acceptLanguage,
	            @RequestHeader(value = "Accept-Encoding",required=false) String acceptEncoding,
	            @RequestHeader(value = "Cookie",required=false) String cookie,
	            @RequestHeader(value = "Connection",required=false) String conn,
	            @RequestHeader(value = "dataSource",required=false) String dataSource,
	            @CookieValue(value = "JSESSIONID",required=false) String cookie2){
	        //@RequestHeader将http请求头信息赋值给形参
	        //@CookieValue直接将请求头中的cookie的值赋值给形参
	        ModelAndView mav=new ModelAndView();
	        mav.addObject("host", host);
	        mav.addObject("userAgent", userAgent);
	        mav.addObject("accept", accept);
	        mav.addObject("acceptLanguage", acceptLanguage);
	        mav.addObject("acceptEncoding", acceptEncoding);
	        mav.addObject("cookie", cookie);
	        mav.addObject("conn", conn);
	        mav.addObject("cookie2", cookie2);
	        mav.setViewName("result");  //返回值是个字符串，就是视图名
	        
	        LOG.info("数据来源: "+dataSource);
	        
	        return mav;
	    }
	
}
