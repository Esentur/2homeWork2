package com.company;

public abstract class Cars {
    private Helm helm;
    private Wheel wheel;
    private String nameOfCar;

    public Cars(Helm helm, Wheel wheel, String nameOfCar) {
        this.helm = helm;
        this.wheel = wheel;
        this.nameOfCar = nameOfCar;
    }

    public Helm getHelm() {
        return helm;
    }

    public void setHelm(Helm helm) {
        this.helm = helm;
    }

    public Wheel getWheel() {
        return wheel;
    }

    public void setWheel(Wheel wheel) {
        this.wheel = wheel;
    }

    public String getNameOfCar() {
        return nameOfCar;
    }

    public void setNameOfCar(String nameOfCar) {
        this.nameOfCar = nameOfCar;
    }
}
