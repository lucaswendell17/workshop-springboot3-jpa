package com.lucasdev.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lucasdev.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
