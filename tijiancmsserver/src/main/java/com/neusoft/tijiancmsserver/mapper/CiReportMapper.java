package com.neusoft.tijiancmsserver.mapper;

import com.neusoft.tijiancmsserver.po.CiReport;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface CiReportMapper {

    @Select("select count(*) from ciReport where orderId=#{orderId}")
    public int getCiReportByOrderId(Integer orderId);

    public int saveCiReport(List<CiReport> list);

    @Select("select * from ciReport where orderId=#{orderId}")
    public List<CiReport> listCiReport(Integer orderId);
}
