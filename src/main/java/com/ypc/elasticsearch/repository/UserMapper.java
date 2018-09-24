package com.ypc.elasticsearch.repository;

import com.ypc.elasticsearch.entity.User;

import java.util.List;

public interface UserMapper {

	List<User> findAll();
}
