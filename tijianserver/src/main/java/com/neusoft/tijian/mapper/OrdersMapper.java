package com.neusoft.tijian.mapper;

import com.neusoft.tijian.dto.CalendarResponseDto;
import com.neusoft.tijian.dto.OrdersMapperDto;
import com.neusoft.tijian.po.Orders;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface OrdersMapper {

    //查询是否预约过（凡是有未归档的预约记录的用户，不能再次预约）
    @Select("select count(*) from orders where state=1 and userId=#{userId}")
    public int getOrdersByUserId(String userId);

    public List<CalendarResponseDto> listOrdersAppointmentNumber(List<OrdersMapperDto> list);

    @Insert("insert into orders values(null,#{orderDate},#{userId},#{hpId},#{smId},1)")
    public int saveOrders(Orders orders);

    public List<Orders> listOrdersByUserId(Orders orders);

    @Delete("delete from orders where orderId=#{orderId}")
    public int removeOrders(Integer orderId);
}
