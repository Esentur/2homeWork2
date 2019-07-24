package com.company;

public class Wheel {
    private double sizeOfWheel;
    private String companyName;

    public Wheel(double sizeOfWheel, String companyName) {
        this.sizeOfWheel = sizeOfWheel;
        this.companyName = companyName;
    }

    public double getSizeOfWheel() {
        return sizeOfWheel;
    }

    public void setSizeOfWheel(double sizeOfWheel) {
        this.sizeOfWheel = sizeOfWheel;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }
}
