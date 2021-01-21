package com.priyanka.springsecurityjpa;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.priyanka.springsecurityjpa.models.User;

public interface UserRepository extends JpaRepository<User, Integer>{
	Optional<User> findByUserName(String userName);

}
