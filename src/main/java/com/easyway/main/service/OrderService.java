package com.easyway.main.service;

import com.easyway.main.repository.ItemRepository;
import com.easyway.main.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class OrderService {
    @Autowired
    @Qualifier("itemRepository")
    private ItemRepository itemRepository;
    @Autowired
    @Qualifier("orderRepository")
    private OrderRepository orderRepository;


}
