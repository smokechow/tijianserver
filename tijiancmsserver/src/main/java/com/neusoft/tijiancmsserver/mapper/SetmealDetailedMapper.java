package com.neusoft.tijiancmsserver.mapper;

import com.neusoft.tijiancmsserver.po.SetmealDetailed;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface SetmealDetailedMapper {

    public List<SetmealDetailed> listSetmealDetailedBySmId(Integer smId);
}
