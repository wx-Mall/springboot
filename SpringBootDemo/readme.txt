参考：
http://412887952-qq-com.iteye.com/category/356333

1.任务调度
参见： SchedulingConfig

2.druid
—— 在pom.xml配置druid依赖包；
——  配置application.properties加入数据库源类型等参数；
—— 编写druid servlet和filter提供监控页面访问；参见 DruidConfiguration
—— 输入地址进行测试； http://localhost/druid2/index.html

3.SpringContextUtil spring上下文获取工具

4.servlet 参考 MyServlet
1.编写 MyServlet
2.扫描 servlet 配置 @ServletComponentScan
访问可见 http://localhost/myServlet

5.拦截器
1、创建我们自己的拦截器类并实现 HandlerInterceptor 接口。
MyInterceptor1
MyInterceptor2 
2、创建一个Java类继承WebMvcConfigurerAdapter，并重写 addInterceptors 方法。 
MyWebAppConfigurer
3、实例化我们自定义的拦截器，然后将对像手动添加到拦截器链中（在addInterceptors方法中添加）
访问测试 : http://localhost/myServlet

6.Junit 单元测试
1). 加入Maven的依赖；
<dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-test</artifactId>
            <scope>test</scope>
</dependency>
2). 编写测试service;

3). 编写测试类; DemoServiceTest

7.springboot使用自定义properties
	编写test.properties
	定义配置类 TestConfig.java
	配置启动类 App，添加配置 @EnableConfigurationProperties(TestConfig.class)
	测试，访问  http://localhost/test/property

8.改变自动扫描的包位置
在开发中我们知道Spring Boot默认会扫描启动类同包以及子包下的注解，那么如何进行改变这种扫描包的方式呢？
@ComponentScan注解进行指定要扫描的包以及要扫描的类。
	创建多个2个包，我们的启动类App所在包为com.qi,创建
	com.sao 添加类 ComponentScanSaoTest.java 在构造器中添加打印消息
package com.sao;

import org.springframework.context.annotation.Configuration;

@Configuration
public class ComponentScanSaoTest {

	public ComponentScanSaoTest() {
		System.out.println(ComponentScanSaoTest.class.getCanonicalName());
	}

}
	
	com.miao 
package com.miao;

import org.springframework.context.annotation.Configuration;

@Configuration
public class ComponentScanMiaoTest {

	public ComponentScanMiaoTest() {
		System.out.println(ComponentScanMiaoTest.class.getCanonicalName());
	}

	
	
}

	启动类App添加注解 @ComponentScan
	@ComponentScan(basePackages={"com.sao", "com.miao"}) //改变扫描包路径
	启动App.java,会在console看到这2个包下的类以及扫描加载了。
	


9. devtools 实现热部署
http://412887952-qq-com.iteye.com/blog/2300313
	
10. self4j+logback日志处理
	1.配置application.properties 
	logging.config=classpath:logback-spring.xml
	2.编写 logback-spring.xml
	3.打印日志
	4.测试查看 http://localhost/test/property

11. 使用AOP统一处理Web请求日志
	依赖
		<dependency>
	      <groupId>org.springframework.boot</groupId>
	      <artifactId>spring-boot-starter-aop</artifactId>
		</dependency>
	编写 aop WebLogAspect.java
	
12.Spring Boot发送邮件
	0.添加依赖
		<!-- 发送邮件. -->
		<dependency> 
		    <groupId>org.springframework.boot</groupId>
		    <artifactId>spring-boot-starter-mail</artifactId>
		</dependency> 
	1.简单邮件
		配置 application.properties
		测试: AppTest.sendSimpleEmail
	2.发送附件
		测试: AppTest.sendAttachmentsEmail
	3.嵌入静态资源
		测试: AppTest.sendInlineMail
	4.模板邮件
		添加依赖 freemarker
			<!-- 引入模板引擎. -->
			<dependency>
			      <groupId>org.springframework.boot</groupId>
			      <artifactId>spring-boot-starter-freemarker</artifactId>
			</dependency>
		在application.properties中添加 freemarker 配置 
		测试: AppTest.sendTemplateMail
		
13.	多环境配置  在Spring Boot中多环境配置文件名需要满足application-{profile}.properties的格式，其中{profile}对应你的环境标识
至于哪个具体的配置文件会被加载，需要在application.properties文件中通过spring.profiles.active属性来设置，其值对应{profile}值。
如：spring.profiles.active=dev就会加载application-dev.properties配置
	1.配置多个环境的配置 application-${profile}.properties
	2.在application.properties中指定加载那个环境的配置 spring.profiles.active=dev

14.	log4j 多环境不同级别控制
	1.在application.properties中配置日志级别 logging.level.com.qi.controller=INFO
	2.在logback-spring.xml中使用属性来控制级别 ${logging.level.com.qi.controller}
	3.分别指定 dev,sit 2个环境，指定2个不同的端口，不同的日志等级，启动测试
		http://localhost:8080/test/hello
		http://localhost:8081/test/hello
		
15.设置项目上下文根 
	在application.properties中配置 server.context-path=/SpringBootDemo

16.主页设置 在 WelcomeContoller.java
	http://localhost:8081/SpringBootDemo/


16. easyui
	http://localhost:8081/index.html
	

	

	

	
	







