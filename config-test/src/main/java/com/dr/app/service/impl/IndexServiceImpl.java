package com.dr.app.service.impl;

import com.dr.app.service.IndexService;

/**
 * @ProjectName: spring-framework-master
 * @Package: com.dr.app.service
 * @Description: java类作用描述
 * @Author: duanrui
 * @CreateDate: 2019/4/8 12:08
 * @Version: 1.0
 * <p>
 * Copyright: Copyright (c) 2019
 */
public class IndexServiceImpl implements IndexService   {
	public IndexServiceImpl() {
		System.out.println("init service");
	}

	@Override
	public void query() {
		System.out.println("query index");
	}
}



