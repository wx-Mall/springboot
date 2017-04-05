package com.qi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.qi.config.TestConfig;

@RestController  
@SpringBootApplication  
@ServletComponentScan //servlet的使用
@EnableConfigurationProperties({TestConfig.class}) //properties的使用
@ComponentScan(basePackages={"com.sao", "com.miao","com.qi","com.kfit"}) //改变扫描包路径
//@PropertySource(value = "classpath*:mail.properties", ignoreResourceNotFound = true)
public class App {  
    
//  @RequestMapping("/")  
//  public String hello(){  
//    return "Hello world! ";  
//  }  
    
  public static void main(String[] args) {  
    SpringApplication.run(App.class, args);  
  }  
}  