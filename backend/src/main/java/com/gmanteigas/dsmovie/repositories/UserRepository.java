package com.gmanteigas.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gmanteigas.dsmovie.entities.User;

public interface UserRepository extends JpaRepository<User,Long>{
	
	User findByEmail(String email);
}
