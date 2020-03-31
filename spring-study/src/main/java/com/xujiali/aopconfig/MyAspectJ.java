package com.xujiali.aopconfig;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class MyAspectJ {
	@Pointcut("execution(* com.xujiali.service.impl.*.*(..))")
	public void pointCut(){

	}

	@Before("pointCut()")
	public void before(){
		System.out.println("before adivce......");
	}
}
