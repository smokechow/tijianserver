package com.neusoft.tijiancmsserver.service.impl;

import com.neusoft.tijiancmsserver.dto.OrdersPageRequestDto;
import com.neusoft.tijiancmsserver.dto.OrdersPageResponseDto;
import com.neusoft.tijiancmsserver.mapper.OrdersMapper;
import com.neusoft.tijiancmsserver.po.Orders;
import com.neusoft.tijiancmsserver.service.OrdersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrdersServiceImpl implements OrdersService {

    @Autowired
    private OrdersMapper ordersMapper;

    @Override
    public OrdersPageResponseDto listOrders(OrdersPageRequestDto request) {
        // 封装返回信息
        OrdersPageResponseDto response = new OrdersPageResponseDto();

        // 1、获取总行数
        int totalRow = ordersMapper.getOrdersCount(request);
        response.setTotalRow(totalRow);

        // 2、如果总行数为 0，那么直接返回
        if(totalRow == 0) {
            return response;
        }

        // 3、计算总页数
        int totalPageNum = 0;
        if(totalRow % request.getMaxPageNum() == 0) {
            totalPageNum = totalRow/request.getMaxPageNum();
        }else {
            totalPageNum = totalRow/request.getMaxPageNum() + 1;
        }
        response.setTotalPageNum(totalPageNum);

        // 4、计算上一页和下一页
        int pageNum = request.getPageNum();
        if(pageNum > 1) {
            response.setPreNum(pageNum - 1);
        }
        if(pageNum < totalPageNum) {
            response.setNextNum(pageNum + 1);
        }

        // 5、计算开始查询记录数
        request.setBeginNum((pageNum - 1) * request.getMaxPageNum());

        // 6、查询业务数据
        List<Orders> list = ordersMapper.listOrders(request);

        // 7、给返回值填充余下的数据
        response.setPageNum(pageNum);
        response.setMaxPageNum(request.getMaxPageNum());
        response.setList(list);

        return response;
    }


    @Override
    public Orders getOrdersById(Integer orderId) {
        return ordersMapper.getOrdersById(orderId);
    }

    @Override
    public int updateOrdersState(Orders orders) {
        return ordersMapper.updateOrdersState(orders);
    }
}
