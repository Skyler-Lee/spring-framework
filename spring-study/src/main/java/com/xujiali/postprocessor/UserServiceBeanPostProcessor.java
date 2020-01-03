package com.xujiali.postprocessor;

import com.xujiali.service.UserService;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.core.PriorityOrdered;
import org.springframework.stereotype.Component;

//@Component
public class UserServiceBeanPostProcessor implements BeanPostProcessor, PriorityOrdered {
	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		if (beanName.equals("userService")) {
			UserService userService = (UserService) bean;
			userService.setStr("hello init");
			System.out.println("UserServiceBeanPostProcessor before...");
		}
		return bean;
	}

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		if (beanName.equals("userService")) {
			UserService userService = (UserService) bean;
			userService.setStr("hello show");
			System.out.println("UserServiceBeanPostProcessor after...");
		}
		return bean;
	}
	//设置执行顺序
	@Override
	public int getOrder() {
		return 1;
	}
}
