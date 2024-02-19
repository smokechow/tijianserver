package com.neusoft.tijiancmsserver.controller;

import com.neusoft.tijiancmsserver.po.CiReport;
import com.neusoft.tijiancmsserver.po.Orders;
import com.neusoft.tijiancmsserver.service.CiReportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/ciReport")
public class CiReportController {

    @Autowired
    private CiReportService ciReportService;

    @RequestMapping("/createReportTemplate")
    public int createReportTemplate(@RequestBody Orders orders) {
        return ciReportService.createReportTemplate(orders);
    }

    @RequestMapping("/listCiReport")
    public List<CiReport> listCiReport(@RequestBody CiReport ciReport) {
        return ciReportService.listCiReport(ciReport.getOrderId());
    }
}
