package com.dr.app.test;

/**
 * @ProjectName: spring
 * @Package: com.dr.app.test
 * @Description: java类作用描述
 * @Author: duanrui
 * @CreateDate: 2019/4/9 16:03
 * @Version: 1.0
 * <p>
 * Copyright: Copyright (c) 2019
 */
public class ConsultResult {
	public ConsultResult (boolean isEnable,String  errorCode){
		this.isEnable = isEnable;
		this.errorCode= errorCode;
	}

	/** 咨询结果是否可用*/
	private boolean isEnable;

	/** 错误码 */
	private String errorCode;

	public boolean getIsEnable(){
		return isEnable;
	}

	public String getErrorCode(){
		return errorCode;
	}
}
