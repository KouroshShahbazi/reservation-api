package com.hotel.repositories;

import com.hotel.entities.Staff;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface StaffRepository extends MongoRepository<Staff, String> {
    Staff findBy_staffId(ObjectId _staffId);
}
