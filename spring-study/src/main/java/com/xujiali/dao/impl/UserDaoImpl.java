package com.xujiali.dao.impl;

import com.xujiali.dao.IUserDao;
import org.springframework.stereotype.Component;

@Component
public class UserDaoImpl implements IUserDao {
	public void query(){
		System.out.println("select * from user......");
	}
}
