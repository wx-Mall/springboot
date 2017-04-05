package com.sao;

import org.springframework.context.annotation.Configuration;

@Configuration
public class ComponentScanSaoTest {

	public ComponentScanSaoTest() {
		System.out.println(ComponentScanSaoTest.class.getCanonicalName());
	}

}
