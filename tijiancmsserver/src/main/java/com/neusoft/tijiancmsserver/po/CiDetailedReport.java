package com.neusoft.tijiancmsserver.po;

public class CiDetailedReport {

    private Integer cidrId;              //检查项明细报告主键
    private String name;                 //检查项明细名称
    private String unit;                 //检查项明细单位
    private double minrange;             //检查项细明正常值范围中的最小值
    private double maxrange;             //检查项细明正常值范围中的最大值
    private String normalValue;          //检查项细明正常值（非数字型）
    private String normalValueString;    //检查项验证范围说明文字
    private Integer type;                //检查项明细类型（1：数值围范验证型；2：数值相等验证型；3：无需验证型；4：描述型；5：其它）
    private String value;                //检查项目明细值
    private Integer isError;             //此项是否异常（0：无异常；1：异常）
    private Integer ciId;                //所属检查项报告编号
    private Integer orderId;             //所属预约编号

    // getter & setter

    public Integer getCidrId() {
        return cidrId;
    }

    public void setCidrId(Integer cidrId) {
        this.cidrId = cidrId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public double getMinrange() {
        return minrange;
    }

    public void setMinrange(double minrange) {
        this.minrange = minrange;
    }

    public double getMaxrange() {
        return maxrange;
    }

    public void setMaxrange(double maxrange) {
        this.maxrange = maxrange;
    }

    public String getNormalValue() {
        return normalValue;
    }

    public void setNormalValue(String normalValue) {
        this.normalValue = normalValue;
    }

    public String getNormalValueString() {
        return normalValueString;
    }

    public void setNormalValueString(String normalValueString) {
        this.normalValueString = normalValueString;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Integer getIsError() {
        return isError;
    }

    public void setIsError(Integer isError) {
        this.isError = isError;
    }

    public Integer getCiId() {
        return ciId;
    }

    public void setCiId(Integer ciId) {
        this.ciId = ciId;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }
}
