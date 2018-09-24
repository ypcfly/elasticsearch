package com.ypc.elasticsearch.controller;

import com.ypc.elasticsearch.entity.User;
import com.ypc.elasticsearch.service.UserService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/user")
public class UserTestController {

	@Resource
	private UserService userService;

	@RequestMapping("/test/{id}")
	public User queryById(@PathVariable(name = "id") Integer id){
		return userService.queryById(id);
	}

}
