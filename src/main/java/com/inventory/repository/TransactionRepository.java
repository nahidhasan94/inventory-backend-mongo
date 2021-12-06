package com.inventory.repository;

import com.inventory.model.TransactionLog;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TransactionRepository extends MongoRepository <TransactionLog, String>
{
    public TransactionLog findByCustomerNameAndStatus(String name, String status);
    List<TransactionLog> findAllByStatus(String status);
    public TransactionLog findByIdAndStatus(ObjectId id, String status);

}
