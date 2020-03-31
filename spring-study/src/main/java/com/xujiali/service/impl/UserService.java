package com.xujiali.service.impl;

import com.xujiali.dao.IUserDao;
import com.xujiali.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

@Component
public class UserService implements IUserService {
	@Autowired
	private IUserDao userDao;
	private String str = "hello ";

	public UserService() {
		System.out.println("construct...");
	}

	@PostConstruct
	public void init(){
		System.out.println("init()..." + str);
	}

	public void show(){
		System.out.println("show()..." + str);
	}

	public void setStr(String str){
		this.str = str;
	}

	@Override
	public void query() {
		userDao.query();
	}
}
