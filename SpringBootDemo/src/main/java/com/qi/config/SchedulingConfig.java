package com.qi.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

@Configuration
@EnableScheduling //启用定时任务
public class SchedulingConfig {

	@Scheduled(cron = "0 0/10 * * * ?") //每十分钟执行一次
	public void schedulerDemo() {
		System.out.println("SchedulingConfig....................");
		System.out.println(SpringContextUtil.getBean("demoDao").getClass().getName());
	}
	
}
