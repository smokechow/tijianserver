package com.neusoft.tijiancmsserver.po;

public class SetmealDetailed {

    private Integer sdId;
    private Integer smId;
    private Integer ciId;

    //多对一
    private CheckItem checkItem;

    // getter & setter

    public Integer getSdId() {
        return sdId;
    }

    public void setSdId(Integer sdId) {
        this.sdId = sdId;
    }

    public Integer getSmId() {
        return smId;
    }

    public void setSmId(Integer smId) {
        this.smId = smId;
    }

    public Integer getCiId() {
        return ciId;
    }

    public void setCiId(Integer ciId) {
        this.ciId = ciId;
    }

    public CheckItem getCheckItem() {
        return checkItem;
    }

    public void setCheckItem(CheckItem checkItem) {
        this.checkItem = checkItem;
    }
}
