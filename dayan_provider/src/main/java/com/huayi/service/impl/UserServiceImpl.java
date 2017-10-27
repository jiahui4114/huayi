package com.huayi.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.huayi.dao.UserMapper;
import com.huayi.entity.User;
import com.huayi.service.UserService;

@Service
@Transactional
public class UserServiceImpl implements UserService {
  
	@Autowired(required=true)
	private UserMapper userMapper;
	
	public User getUser() {
		// TODO Auto-generated method stub
		return userMapper.getUser();
	}

}
