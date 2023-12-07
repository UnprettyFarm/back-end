package com.kosta.farm.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kosta.farm.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
	boolean existsByUserEmail(String userEmail);
	User findByUserEmail(String userEmail);
	User findByUserId(Long userId);
}
