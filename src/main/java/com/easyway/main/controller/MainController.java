package com.easyway.main.controller;

import com.easyway.main.domain.Order;
import com.easyway.main.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

//@Controller
//@RequestMapping
public class MainController {

    @Autowired
    private OrderService orderService;

    @RequestMapping(value = {"/", "/index"})
    public ModelAndView main() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("index");
        return modelAndView;
    }


    @RequestMapping(value = "/main")
    public ModelAndView main1() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("main");
        return modelAndView;
    }

    @RequestMapping(value = "/buy", method = RequestMethod.POST)
    public ModelAndView buy(@RequestParam String address) {
        ModelAndView modelAndView = new ModelAndView();

        orderService.saveOrder(address);

        modelAndView.setViewName("buy");
        return modelAndView;
    }


    @RequestMapping(value = "/order_list", method = RequestMethod.GET)
    public ModelAndView orderList() {
        ModelAndView modelAndView = new ModelAndView();

        List<Order> orderList = orderService.findAll();
        modelAndView.addObject("orderList", orderList);
        modelAndView.setViewName("order_list");
        return modelAndView;
    }


    @RequestMapping(value = "/delivery_list", method = RequestMethod.GET)
    public ModelAndView deliveryList() {
        ModelAndView modelAndView = new ModelAndView();

        List<Order> orderList = orderService.findAll();
        modelAndView.addObject("orderList", orderList);
        modelAndView.setViewName("delivery_list");
        return modelAndView;
    }

}
