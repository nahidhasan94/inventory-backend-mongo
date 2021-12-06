package com.inventory.model;

import com.inventory.enums.Authority;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;

import java.util.List;

public class User {
    @Id
    private ObjectId id;
    private String name;
    private String username;
    private String mobileNumber;
    private String password;
    private String address;
    private String adminPassword;
    private Authority authority;
    private String status;

    public User() {
    }

    public User(ObjectId id, String name, String username, String mobileNumber, String password, String address, String adminPassword, Authority authority, String status) {
        this.id = id;
        this.name = name;
        this.username = username;
        this.mobileNumber = mobileNumber;
        this.password = password;
        this.address = address;
        this.adminPassword = adminPassword;
        this.authority = authority;
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

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAdminPassword() {
        return adminPassword;
    }

    public void setAdminPassword(String adminPassword) {
        this.adminPassword = adminPassword;
    }

    public Authority getAuthority() {
        return authority;
    }

    public void setAuthority(Authority authority) {
        this.authority = authority;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
