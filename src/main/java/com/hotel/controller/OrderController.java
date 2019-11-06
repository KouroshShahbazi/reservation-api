package com.hotel.controller;

import com.hotel.entities.Order;
import com.hotel.repositories.OrderRepository;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    private OrderRepository orderRepository;

    // getAllOrder
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public List<Order> getAllOrder() { return orderRepository.findAll();}

    // getOrderById
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Order getOrderById(@PathVariable("id") ObjectId id) { return orderRepository.findBy_orderId(id); }


    //  modifyOrderById
    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public void modifyOrderById(@PathVariable("id") ObjectId id, @Valid @RequestBody Order orderItem) {
        orderItem.set_orderId(id);
        orderRepository.save(orderItem);
    }

    // createOrderItem
    @RequestMapping(value = "/", method = RequestMethod.POST)
    public Order createOrderItem(@Valid @RequestBody Order orderItem) {
        orderItem.set_orderId(ObjectId.get());
        orderRepository.save(orderItem);
        return orderItem;
    }

    // deleteOrderItem
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void deleteOrderItem(@PathVariable ObjectId id) {
        orderRepository.delete(orderRepository.findBy_orderId(id));
    }
}
