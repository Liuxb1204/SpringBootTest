package com.dancer.exception;

import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author Dancer
 * 全局异常类
 */
@ControllerAdvice
public class GloableException {
	
	@ExceptionHandler(RuntimeException.class) //捕获运行时异常
	public @ResponseBody String runTimeExcep(RuntimeException e){
		
		System.out.println(e.getMessage());
		return "出现异常了，全局异常捕获";
	}
}



















