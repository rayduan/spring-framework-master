package com.dr.app.test;

import com.dr.app.AppConfig;
import com.dr.app.service.IndexService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @ProjectName: spring
 * @Package: com.dr.app.test
 * @Description: java类作用描述
 * @Author: duanrui
 * @CreateDate: 2019/4/8 12:16
 * @Version: 1.0
 * <p>
 * Copyright: Copyright (c) 2019
 */
public class Test {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		System.out.println(context.getBean(IndexService.class));
		System.out.println(context.getBean(IndexService.class));
		context.close();
	}
}
