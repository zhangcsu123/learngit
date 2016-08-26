package com.carelinker.drug.model;

/**
 * Created by zhang on 2016/6/16.
 */
public class UserStatistics {

    private String lastServiceTime;
    private String lastConsumptionTime;
    private String employeeUserId;
    private Double customerUnitPrice;
    private Double customerFrequency;
    private Double totalMoney;
    private Double measureFrequency;

    public UserStatistics(String lastServiceTime, String lastConsumptionTime, String employeeUserId, Double customerUnitPrice, Double customerFrequency, Double totalMoney, Double measureFrequency) {
        this.lastServiceTime = lastServiceTime;
        this.lastConsumptionTime = lastConsumptionTime;
        this.employeeUserId = employeeUserId;
        this.customerUnitPrice = customerUnitPrice;
        this.customerFrequency = customerFrequency;
        this.totalMoney = totalMoney;
        this.measureFrequency = measureFrequency;
    }

    public String getLastServiceTime() {
        return lastServiceTime;
    }

    public void setLastServiceTime(String lastServiceTime) {
        this.lastServiceTime = lastServiceTime;
    }

    public String getLastConsumptionTime() {
        return lastConsumptionTime;
    }

    public void setLastConsumptionTime(String lastConsumptionTime) {
        this.lastConsumptionTime = lastConsumptionTime;
    }

    public String getEmployeeUserId() {
        return employeeUserId;
    }

    public void setEmployeeUserId(String employeeUserId) {
        this.employeeUserId = employeeUserId;
    }

    public Double getCustomerUnitPrice() {
        return customerUnitPrice;
    }

    public void setCustomerUnitPrice(Double customerUnitPrice) {
        this.customerUnitPrice = customerUnitPrice;
    }

    public Double getCustomerFrequency() {
        return customerFrequency;
    }

    public void setCustomerFrequency(Double customerFrequency) {
        this.customerFrequency = customerFrequency;
    }

    public Double getTotalMoney() {
        return totalMoney;
    }

    public void setTotalMoney(Double totalMoney) {
        this.totalMoney = totalMoney;
    }

    public Double getMeasureFrequency() {
        return measureFrequency;
    }

    public void setMeasureFrequency(Double measureFrequency) {
        this.measureFrequency = measureFrequency;
    }
}
