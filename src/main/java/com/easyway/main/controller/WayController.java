package com.easyway.main.controller;

import com.easyway.main.domain.Item;
import com.easyway.main.domain.Order;
import com.easyway.main.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController("/")
@CrossOrigin
public class WayController {

    @Autowired
    private OrderService orderService;

    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public void add(@RequestParam String address) {
        orderService.saveOrder(address);
    }

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public void test() {
//        orderService.saveOrder("111");
    }

    @RequestMapping(value = "/getall", method = RequestMethod.GET)
    public List<Order> getall() {
        List<Order> orderList = orderService.findAll();
        return orderList;
    }

    @RequestMapping(value = "/getItemById", method = RequestMethod.GET)
    public Item getItemById(@RequestParam int id) {
        return orderService.getItemById(id);
    }

    @RequestMapping(value = "/getOrderById", method = RequestMethod.GET)
    public Order getItemByOrder(@RequestParam int id) {
        return orderService.getOrderById(id);
    }

    @RequestMapping(value = "/getallitems", method = RequestMethod.GET)
    public List<Item> getallItems() {
        List<Item> itemsList = orderService.findAllItems();
        return itemsList;
    }
}
