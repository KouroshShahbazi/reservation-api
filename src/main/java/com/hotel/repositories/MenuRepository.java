package com.hotel.repositories;

import com.hotel.entities.Menu;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface MenuRepository extends MongoRepository<Menu, String> {
    Menu findBy_menuId(ObjectId _menuId);
}
