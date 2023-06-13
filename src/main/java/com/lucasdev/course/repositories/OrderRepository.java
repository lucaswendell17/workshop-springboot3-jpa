package com.lucasdev.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lucasdev.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
