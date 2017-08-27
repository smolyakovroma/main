package com.easyway.main.repository;

import com.easyway.main.domain.Item;
import com.easyway.main.domain.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("orderRepository")
public interface OrderRepository extends JpaRepository<Order, Integer> {

}