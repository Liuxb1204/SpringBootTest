package com.dancer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * @author Dancer
 * 项目启动
 * 放在这里的原因是因为可以借助 @SpringBootApplication 扫描到同目录（com.dancer）下的所有包及其类
 */

//定时器任务的注解，暂时取消
//@EnableScheduling
//异步方法注解，暂时取消
//@EnableAsync
@SpringBootApplication
public class App {
	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
	}
}
