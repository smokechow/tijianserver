package com.neusoft.tijiancmsserver.mapper;

import com.neusoft.tijiancmsserver.po.CheckItem;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CheckItemMapper {

    public CheckItem getCheckItemById(Integer ciId);
}
