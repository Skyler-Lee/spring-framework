package com.xujiali.test;

import com.xujiali.app.AppConfig;
import com.xujiali.service.IUserService;
import com.xujiali.service.impl.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppTest {
	public static void main(String[] args) {
//		ClassPathXmlApplicationContext cp = new ClassPathXmlApplicationContext("spring.xml");
		AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);
		/**
		 * 上面这行代码可以拆分为以下这几步：
		 * 1. 初始化上下文环境，准备好初始化spring环境所需要的对象
		 * AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext();
		 * 2. 完成配置类的解析和注册
		 * ac.register(AppConfig.class);
		 * 3. 初始化spring环境，完成类的扫描、解析和实例化
		 * ac.refresh();
		 * */
		IUserService userService = (IUserService) ac.getBean("userService");
		userService.query();

	}
}
