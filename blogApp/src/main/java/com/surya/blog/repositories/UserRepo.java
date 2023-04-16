package com.surya.blog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.surya.blog.entity.User;

public interface UserRepo extends JpaRepository<User, Integer> {
	
}
