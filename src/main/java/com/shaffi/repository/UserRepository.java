package com.shaffi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.shaffi.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{

	User findByUserName(String tempUser);

	User findByUserNameAndPassword(String tempUserName, String tempPassword);

	

	
}
