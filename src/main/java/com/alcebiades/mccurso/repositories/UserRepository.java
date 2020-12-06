package com.alcebiades.mccurso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.alcebiades.mccurso.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
	
}
