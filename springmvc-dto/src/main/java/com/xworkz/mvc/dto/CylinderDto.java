package com.xworkz.mvc.dto;

public class CylinderDto {


    private String companyName;

    private String customerName;

    private String cylinderPrice;


    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCylinderPrice() {
        return cylinderPrice;
    }

    public void setCylinderPrice(String cylinderPrice) {
        this.cylinderPrice = cylinderPrice;
    }

    @Override
    public String toString() {
        return "CylinderDto{" +
                "companyName='" + companyName + '\'' +
                ", customerName='" + customerName + '\'' +
                ", cylinderPrice='" + cylinderPrice + '\'' +
                '}';
    }
}
