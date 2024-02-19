package com.neusoft.tijiancmsserver.service.impl;

import com.neusoft.tijiancmsserver.mapper.CiDetailedReportMapper;
import com.neusoft.tijiancmsserver.po.CiDetailedReport;
import com.neusoft.tijiancmsserver.service.CiDetailedReportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CiDetailedReportServiceImpl implements CiDetailedReportService {

    @Autowired
    private CiDetailedReportMapper ciDetailedReportMapper;

    @Override
    public int updateCiDetailedReport(List<CiDetailedReport> list) {
        return ciDetailedReportMapper.updateCiDetailedReport(list);
    }
}
