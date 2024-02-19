package com.neusoft.tijiancmsserver.mapper;

import com.neusoft.tijiancmsserver.po.Doctor;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface DoctorMapper {

    /**
     * 登录
     * @param doctor
     * @return
     */
    @Select("select * from doctor where docCode=#{docCode} and password=#{password}")
    public Doctor getDoctorByCodeByPass(Doctor doctor);
}
