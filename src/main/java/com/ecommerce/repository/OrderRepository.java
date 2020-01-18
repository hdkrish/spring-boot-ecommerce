package com.ecommerce.repository;

import org.springframework.data.repository.CrudRepository;

import com.ecommerce.model.Order;

public interface OrderRepository extends CrudRepository<Order, Long> {
}
