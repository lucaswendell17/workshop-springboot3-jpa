package com.lucasdev.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lucasdev.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
