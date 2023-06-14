package com.lucasdev.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lucasdev.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
