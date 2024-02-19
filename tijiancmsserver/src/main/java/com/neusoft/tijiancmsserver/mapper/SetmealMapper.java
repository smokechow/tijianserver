package com.neusoft.tijiancmsserver.mapper;

import com.neusoft.tijiancmsserver.po.Setmeal;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface SetmealMapper {

    @Select("select * from setmeal order by smId")
    public List<Setmeal> listSetmeal();

    //这是专门为OrdersMapper中的listOrders方法做关联查询用的
    @Select("select * from setmeal where smId=#{smId}")
    public Setmeal getSetmealByIdByMapper(Integer smId);

    public Setmeal getSetmealById(Integer smId);
}
