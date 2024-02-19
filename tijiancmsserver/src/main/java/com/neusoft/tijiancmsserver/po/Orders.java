package com.neusoft.tijiancmsserver.po;

public class Orders {

    private Integer orderId;
    private String orderDate;
    private String userId;
    private Integer hpId;
    private Integer smId;
    private Integer state;

    //多对一
    private Setmeal setmeal;
    private Hospital hospital;
    private Users users;

    // getter & setter

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public String getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(String orderDate) {
        this.orderDate = orderDate;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Integer getHpId() {
        return hpId;
    }

    public void setHpId(Integer hpId) {
        this.hpId = hpId;
    }

    public Integer getSmId() {
        return smId;
    }

    public void setSmId(Integer smId) {
        this.smId = smId;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public Setmeal getSetmeal() {
        return setmeal;
    }

    public void setSetmeal(Setmeal setmeal) {
        this.setmeal = setmeal;
    }

    public Hospital getHospital() {
        return hospital;
    }

    public void setHospital(Hospital hospital) {
        this.hospital = hospital;
    }

    public Users getUsers() {
        return users;
    }

    public void setUsers(Users users) {
        this.users = users;
    }
}
