package com.neusoft.tijiancmsserver.service;

import com.neusoft.tijiancmsserver.po.CiReport;
import com.neusoft.tijiancmsserver.po.Orders;

import java.util.List;

public interface CiReportService {

    public int createReportTemplate(Orders orders);

    public List<CiReport> listCiReport(Integer orderId);

}
