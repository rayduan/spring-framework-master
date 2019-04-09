package com.dr.app.test;

import java.util.*;
import java.util.concurrent.*;

/**
 * @ProjectName: spring
 * @Package: com.dr.app.test
 * @Description: java类作用描述
 * @Author: duanrui
 * @CreateDate: 2019/4/9 15:44
 * @Version: 1.0
 * <p>
 * Copyright: Copyright (c) 2019
 */
public class ThreadPoolTest {
	static ThreadPoolExecutor fixThreadPoll = new ThreadPoolExecutor(6, 10, 10000, TimeUnit.SECONDS, new ArrayBlockingQueue<>(5));
	static  String[] payMethods = {"支付宝", "红包", "花呗", "网商"};


//	private void excuteRemote() {
//
//	}

	public static void main(String[] args) {
		Set<String> payAble = new HashSet<>();
		Map<String,FutureTask> map =  new HashMap<>();
		long a = System.currentTimeMillis();
		for (int i = 0; i < payMethods.length; i++) {
			FutureTask<ConsultResult> futureTask = new FutureTask<>(new InvokeMethodThread(payMethods[i]));
			fixThreadPoll.submit(futureTask);
			map.put(payMethods[i],futureTask);
		}
		for (Map.Entry<String,FutureTask> m:map.entrySet()) {
			ConsultResult consultResult = null;
			try {
				consultResult = (ConsultResult) m.getValue().get();
				if (consultResult.getIsEnable()) {
					payAble.add(m.getKey());
				}
			} catch (InterruptedException e) {
				e.printStackTrace();
			} catch (ExecutionException e) {
				e.printStackTrace();
			}

		}
	
		long b = System.currentTimeMillis();

		System.out.println(payAble.toString());
		System.out.println("耗时"+(b-a));
	}

}
