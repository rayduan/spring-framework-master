package com.dr.app.test;

import java.util.concurrent.Callable;

/**
 * @ProjectName: spring
 * @Package: com.dr.app.test
 * @Description: java类作用描述
 * @Author: duanrui
 * @CreateDate: 2019/4/9 16:21
 * @Version: 1.0
 * <p>
 * Copyright: Copyright (c) 2019
 */
public class InvokeMethodThread implements Callable<ConsultResult> {

	private String payNethod;

	public InvokeMethodThread(String payNethod) {
		this.payNethod = payNethod;
	}

	/**
	 * Computes a result, or throws an exception if unable to do so.
	 *
	 * @return computed result
	 * @throws Exception if unable to compute a result
	 */
	@Override
	public ConsultResult call() throws Exception {
		System.out.println("调用检查方法"+payNethod);
		ConsultResult consultResult = null;
		if(!"支付宝".equals(payNethod)){
			consultResult = new ConsultResult(Boolean.TRUE,"0");
		}else{
			consultResult =  new ConsultResult(Boolean.FALSE,"-1");
		}
		Thread.sleep(1000);
		return consultResult;
	}

}
