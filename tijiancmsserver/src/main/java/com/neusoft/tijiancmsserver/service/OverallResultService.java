package com.neusoft.tijiancmsserver.service;

import com.neusoft.tijiancmsserver.po.OverallResult;

import java.util.List;

public interface OverallResultService {

    public List<OverallResult> listOverallResultByOrderId(Integer orderId);

    public int saveOverallResult(OverallResult overallResult);

    public int updateOverallResult(OverallResult overallResult);

    public int removeOverallResult(Integer orId);

}
