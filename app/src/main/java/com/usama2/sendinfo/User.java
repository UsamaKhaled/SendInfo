package com.usama2.sendinfo;

import java.io.Serializable;

public class User implements Serializable {

    private String idET;
    private String nameET, addressET, jobET;
    private String salaryET;

    public User(String idET, String nameET, String addressET, String jobET, String salaryET) {
        this.idET = idET;
        this.nameET = nameET;
        this.addressET = addressET;
        this.jobET = jobET;
        this.salaryET = salaryET;
    }

    public String getIdET() {
        return idET;
    }

    public void setIdET(String idET) {
        this.idET = idET;
    }

    public String getNameET() {
        return nameET;
    }

    public void setNameET(String nameET) {
        this.nameET = nameET;
    }

    public String getAddressET() {
        return addressET;
    }

    public void setAddressET(String addressET) {
        this.addressET = addressET;
    }

    public String getJobET() {
        return jobET;
    }

    public void setJobET(String jobET) {
        this.jobET = jobET;
    }

    public String getSalaryET() {
        return salaryET;
    }

    public void setSalaryET(String salaryET) {
        this.salaryET = salaryET;
    }
}
