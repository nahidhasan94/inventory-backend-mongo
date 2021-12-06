package com.inventory.model;

import com.inventory.dto.CheckOutDTO;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;

import java.util.Date;
import java.util.List;

public class TransactionLog {
    @Id
    private ObjectId id;
    private String billNo;
    private List<String> items;
    private String customerName;
    private String mobileNumber;
    private List<CheckOutDTO> detailsInfo;
    private int total;
    private Date date;
    private String status;

    public TransactionLog() {
    }

    public TransactionLog(String status) {
        this.status = status;
    }

    public TransactionLog(ObjectId id, String billNo, List<String> items, String customerName, String mobileNumber, List<CheckOutDTO> detailsInfo, int total, Date date, String status) {
        this.id = id;
        this.billNo = billNo;
        this.items = items;
        this.customerName = customerName;
        this.mobileNumber = mobileNumber;
        this.detailsInfo = detailsInfo;
        this.total = total;
        this.date = date;
        this.status = status;
    }

    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

    public String getBillNo() {
        return billNo;
    }

    public void setBillNo(String billNo) {
        this.billNo = billNo;
    }

    public List<String> getItems() {
        return items;
    }

    public void setItems(List<String> items) {
        this.items = items;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<CheckOutDTO> getDetailsInfo() {
        return detailsInfo;
    }

    public void setDetailsInfo(List<CheckOutDTO> detailsInfo) {
        this.detailsInfo = detailsInfo;
    }
}

