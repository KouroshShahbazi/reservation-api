package com.hotel.entities;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;

public class Order {

    @Id
    public ObjectId _orderId;

    public String orderName;
    public String orderDescription;

    // constructors
    public Order() {
    }

    public Order(ObjectId _orderId, String orderName, String orderDescription) {
        this._orderId = _orderId;
        this.orderName = orderName;
        this.orderDescription = orderDescription;
    }

    // ObjectId to string
    public String get_orderId() {
        return _orderId.toHexString();
    }

    public void set_orderId(ObjectId _orderId) {
        this._orderId = _orderId;
    }

    public String getOrderName() {
        return orderName;
    }

    public void setOrderName(String orderName) {
        this.orderName = orderName;
    }

    public String getOrderDescription() { return orderDescription; }

    public void setOrderDescription(String orderDescription) {
        this.orderDescription = orderDescription;
    }
}
