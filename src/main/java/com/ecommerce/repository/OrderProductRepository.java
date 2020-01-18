package com.ecommerce.repository;

import org.springframework.data.repository.CrudRepository;

import com.ecommerce.model.OrderProduct;
import com.ecommerce.model.OrderProductPK;

public interface OrderProductRepository extends CrudRepository<OrderProduct, OrderProductPK> {
}
