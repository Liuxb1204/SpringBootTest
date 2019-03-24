package com.dancer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author Dancer
 * 项目启动
 * 放在这里的原因是因为可以借助 @SpringBootApplication 扫描到同目录（com.dancer）下的所有包及其类
 */
@SpringBootApplication
public class App {
	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
	}
}
