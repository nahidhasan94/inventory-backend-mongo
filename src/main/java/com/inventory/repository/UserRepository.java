package com.inventory.repository;

import com.inventory.model.User;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends MongoRepository<User,String> {
    public User findByUsernameAndStatus(String username, String status);
    List<User> findAllByStatus(String status);
    public User findByIdAndStatus(ObjectId id, String status);


}
