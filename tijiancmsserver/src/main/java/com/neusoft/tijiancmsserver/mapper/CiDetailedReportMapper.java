package com.neusoft.tijiancmsserver.mapper;

import com.neusoft.tijiancmsserver.po.CiDetailedReport;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface CiDetailedReportMapper {

    public int saveCiDetailedReport(List<CiDetailedReport> list);

    @Select("select * from ciDetailedReport where orderId=#{orderId} and ciId=#{ciId} order by cidrId")
    public List<CiDetailedReport> listCiDetailedReportByOrderIdByCiId(CiDetailedReport ciDetailedReport);

    public int updateCiDetailedReport(List<CiDetailedReport> list);

}
