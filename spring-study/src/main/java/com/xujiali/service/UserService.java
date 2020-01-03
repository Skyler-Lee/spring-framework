package com.xujiali.service;

import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

@Service
public class UserService {
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
}
