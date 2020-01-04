package com.xujiali.service;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

@Component
public class UserService implements com.xujiali.service.Service {
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
		System.out.println("query...");
	}
}
