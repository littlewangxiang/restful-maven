package com.wangxiang.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wangxiang.model.dao.TUserMapper;
import com.wangxiang.model.entity.TUser;

@Service
public class TUserService {
	@Autowired
	private TUserMapper userDao;
	
	public List<TUser> getAllUser(){
		return userDao.getAll();
	}
}
