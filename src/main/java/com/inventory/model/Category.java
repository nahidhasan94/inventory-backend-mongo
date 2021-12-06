package com.inventory.model;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;

public class Category {
    @Id
    private ObjectId id;
    private String name;
    private String status;

    public Category() {
    }

    public Category(ObjectId id, String name, String status) {
        this.id = id;
        this.name = name;
        this.status = status;
    }

    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
