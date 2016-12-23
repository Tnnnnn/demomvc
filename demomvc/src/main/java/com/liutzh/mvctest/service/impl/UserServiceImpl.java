package com.liutzh.mvctest.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.liutzh.mvctest.mapper.UserMapper;
import com.liutzh.mvctest.model.User;
import com.liutzh.mvctest.model.UserExample;
import com.liutzh.mvctest.service.UserService;

@Service(value="userService")
public class UserServiceImpl implements UserService {

	@Autowired
	UserMapper userMaper;

	@Override
	public List<User> listUser() {
		UserExample ue = new UserExample();
		
		return userMaper.selectByExample(ue);
	}
	
}
