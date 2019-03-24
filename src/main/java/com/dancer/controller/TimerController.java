package com.dancer.controller;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * 定时任务
 * @author Dancer
 *
 */
@Component
public class TimerController {
	@Scheduled(fixedRate = 2000) //两秒执行一次
	public void showTime(){
		System.out.println("hello");
	}
}
