package com.dr.app;

import com.dr.app.service.IndexService;
import com.dr.app.service.impl.IndexServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

/**
 * @ProjectName: spring-framework-master
 * @Package: com.dr.app
 * @Description: java类作用描述
 * @Author: duanrui
 * @CreateDate: 2019/4/8 12:05
 * @Version: 1.0
 * <p>
 * Copyright: Copyright (c) 2019
 */
@ComponentScan("com.dr")
@Configuration
public class AppConfig {

	@Bean
	public IndexService indexService(){
		return  new IndexServiceImpl();
	}
}
