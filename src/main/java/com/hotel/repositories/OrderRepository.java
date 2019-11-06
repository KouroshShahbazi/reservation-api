package com.hotel.repositories;

import com.hotel.entities.Order;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface OrderRepository extends MongoRepository<Order, String> {
    Order findBy_orderId(ObjectId _orderId);
}
