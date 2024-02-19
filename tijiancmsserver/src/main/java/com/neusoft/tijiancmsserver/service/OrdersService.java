package com.neusoft.tijiancmsserver.service;

import com.neusoft.tijiancmsserver.dto.OrdersPageRequestDto;
import com.neusoft.tijiancmsserver.dto.OrdersPageResponseDto;
import com.neusoft.tijiancmsserver.po.Orders;

public interface OrdersService {
    public OrdersPageResponseDto listOrders(OrdersPageRequestDto request);

    public Orders getOrdersById(Integer orderId);

    public int updateOrdersState(Orders orders);
}
