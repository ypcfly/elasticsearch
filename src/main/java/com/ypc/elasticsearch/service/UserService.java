package com.ypc.elasticsearch.service;

import com.ypc.elasticsearch.entity.User;

import java.util.List;

public interface UserService {

	User queryById(Integer id);

	List<User> queryAll();

	List<User> selectFromDataBase();
}
