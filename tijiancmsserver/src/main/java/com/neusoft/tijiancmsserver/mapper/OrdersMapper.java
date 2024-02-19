package com.neusoft.tijiancmsserver.mapper;

import com.neusoft.tijiancmsserver.dto.OrdersPageRequestDto;
import com.neusoft.tijiancmsserver.po.Orders;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Update;

import java.util.List;

/*
思路，面对一个空表格的时候，我们第一时间应该是需要去获取到底有多少条数据，比如 getOrdersCount() 方法
当你获取了总条数之后，其实就可以进一步计算出来页数了，比如 100 条数据，每页显示 10 条，那么就是 100 / 10 = 10 页
假设，侧边栏提供的是模糊查询，默认情况下是显示所有「未归档」的信息，那如果我又去指定 手机号、姓名等其他条件的话
那么此时的「业务条件」就会很多了，那怎么将你的请求向服务端发送呢？会发现没有合适的 PO 能够去封装请求数据
解决办法，就是自己提供 DTO 类，来封装请求数据并且发送到服务端（传递数据的功能）

既然要提供 DTO：
1、可以在分页请求的时候，封装你的参数：OrdersPageRequestDto
2、为你的分页查询响应封装数据：OrdersPageResponseDto
 */
@Mapper
public interface OrdersMapper {

    // 根据条件查询预约订单总行数
    public int getOrdersCount(OrdersPageRequestDto request);

    // 根据条件做预约订单的分页查询
    public List<Orders> listOrders(OrdersPageRequestDto request);

    public Orders getOrdersById(Integer orderId);

    /**
     * 归档
     * @param orders
     * @return
     */
    @Update("update orders set state=#{state} where orderId=#{orderId}")
    public int updateOrdersState(Orders orders);
}
