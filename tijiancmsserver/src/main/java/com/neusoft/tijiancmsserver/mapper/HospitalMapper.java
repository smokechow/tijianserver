package com.neusoft.tijiancmsserver.mapper;

import com.neusoft.tijiancmsserver.po.Hospital;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface HospitalMapper {

    @Select("select * from hospital where hpId=#{hpId}")
    public Hospital getHospitalById(Integer hpId);
}
