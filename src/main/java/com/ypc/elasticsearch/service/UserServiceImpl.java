package com.ypc.elasticsearch.service;

import com.ypc.elasticsearch.entity.User;
import com.ypc.elasticsearch.repository.UserMapper;
import com.ypc.elasticsearch.repository.UserRepository;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

	@Resource
	private UserRepository userRepository;

	@Resource
	private UserMapper userMapper;

	@Override
	public User queryById(Integer id) {
		System.out.println(">>>> query user from ES <<<<");
		Optional<User> result = userRepository.findById(id);
		if (result.isPresent())
			return result.get();

		return null;
	}

	@Override
	public List<User> queryAll() {
		return null;
	}

	@Override
	public List<User> selectFromDataBase() {
		return userMapper.findAll();
	}
}
