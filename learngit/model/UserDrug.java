package com.carelinker.drug.model;

/**
 * Created by zhang on 2016/6/16.
 */
public class UserDrug {

    private String drugNo;
    private String drugName;
    private double buyNum;

    public UserDrug(String drugNo, String drugName, double buyNum) {
        this.drugNo = drugNo;
        this.drugName = drugName;
        this.buyNum = buyNum;
    }

    public String getDrugName() {
        return drugName;
    }

    public void setDrugName(String drugName) {
        this.drugName = drugName;
    }

    public double getBuyNum() {
        return buyNum;
    }

    public void setBuyNum(double buyNum) {
        this.buyNum = buyNum;
    }

    public String getDrugNo() {
        return drugNo;
    }

    public void setDrugNo(String drugNo) {
        this.drugNo = drugNo;
    }
}
