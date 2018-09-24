package com.ypc.elasticsearch.repository;

import com.ypc.elasticsearch.entity.User;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public interface UserRepository extends ElasticsearchRepository<User,Integer> {

	@Override
	Optional<User> findById(Integer integer);

	@Override
	User save(User user);

}
