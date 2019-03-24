package com.dancer.service;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

/**
 * @author Dancer
 * 测试异步调用的方法，需要在app启动类中开启注解支持
 * 使用的时候只需要注入到controller中，调用即可
 *
 */
@Component
public class AsynService {
	@Async
	public void asynOut(){
		System.out.println("异步方法的线程ID："+Thread.currentThread().getId());
	}
}
