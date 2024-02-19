package com.neusoft.tijiancmsserver.controller;

import com.neusoft.tijiancmsserver.dto.OrdersPageRequestDto;
import com.neusoft.tijiancmsserver.dto.OrdersPageResponseDto;
import com.neusoft.tijiancmsserver.po.Orders;
import com.neusoft.tijiancmsserver.service.OrdersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/orders")
public class OrdersController {

    @Autowired
    private OrdersService ordersService;

    @RequestMapping("/listOrders")
    public OrdersPageResponseDto listOrders(@RequestBody OrdersPageRequestDto request) {
        return ordersService.listOrders(request);
    }

    @RequestMapping("/getOrdersById")
    public Orders getOrdersById(@RequestBody Orders orders) {
        return ordersService.getOrdersById(orders.getOrderId());
    }

    @RequestMapping("/updateOrdersState")
    public int updateOrdersState(@RequestBody Orders orders) {
        return ordersService.updateOrdersState(orders);
    }
}
