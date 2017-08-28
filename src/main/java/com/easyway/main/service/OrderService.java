package com.easyway.main.service;

import com.easyway.main.domain.Item;
import com.easyway.main.domain.Order;
import com.easyway.main.repository.ItemRepository;
import com.easyway.main.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {
    @Autowired
    @Qualifier("itemRepository")
    private ItemRepository itemRepository;
    @Autowired
    @Qualifier("orderRepository")
    private OrderRepository orderRepository;

    public List<Order> findAll(){
        return orderRepository.findAll();
    }

    public List<Item> findAllItems(){
        return itemRepository.findAll();
    }


    public Item getItemById(int id){
        return itemRepository.findOne(id);
    }

    public Order getOrderById(int id){
        return orderRepository.findOne(id);
    }

    public Order saveOrder(String address){
        Order order = new Order();
        order.setAddress(address);
        return orderRepository.save(order);
    }

}
