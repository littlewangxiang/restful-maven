package com.wangxiang.model.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wangxiang.model.entity.TUser;
import com.wangxiang.model.service.TUserService;

@RestController
public class TUserController {
	@Autowired
	private TUserService userService;
	@RequestMapping("get/allUser")
	public List<TUser> getAllUser(){
		List<TUser> result = userService.getAllUser();
		System.out.println(result);
		return userService.getAllUser();
	}
}
