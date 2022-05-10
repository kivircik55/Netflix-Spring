package com.bluelagoon.webservice.Car;

import java.util.Date;

public class Car implements Vehicle{
    private String plate;
    private String brand;
    private String model;
    private Date serviceDate;
    private String gas;
    private float horsePower;
    private float miles;
    private String color;
    private int numberWheels;
    private int numberDoors;

    public Car(String plate, String brand, String model, Date serviceDate, String gas,
               float horsePower, float miles, String color, int numberWheels, int numberDoors) {
        this.plate = plate;
        this.brand = brand;
        this.model = model;
        this.serviceDate = serviceDate;
        this.gas = gas;
        this.horsePower = horsePower;
        this.miles = miles;
        this.color = color;
        this.numberWheels = numberWheels;
        this.numberDoors = numberDoors;
    }

    public String getPlate() {
        return plate;
    }

    public void setPlate(String plate) {
        this.plate = plate;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Date getServiceDate() {
        return serviceDate;
    }

    public void setServiceDate(Date serviceDate) {
        this.serviceDate = serviceDate;
    }

    public String getGas() {
        return gas;
    }

    public void setGas(String gas) {
        this.gas = gas;
    }

    public float getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(float horsePower) {
        this.horsePower = horsePower;
    }

    public float getMiles() {
        return miles;
    }

    public void setMiles(float miles) {
        this.miles = miles;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getNumberWheels() {
        return numberWheels;
    }

    public void setNumberWheels(int numberWheels) {
        this.numberWheels = numberWheels;
    }

    public int getNumberDoors() {
        return numberDoors;
    }

    public void setNumberDoors(int numberDoors) {
        this.numberDoors = numberDoors;
    }

    @Override
    public String toString() {
        return "This car is Car{" +
                "plate='" + plate + '\'' +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", serviceDate=" + serviceDate +
                ", gas='" + gas + '\'' +
                ", horsePower=" + horsePower +
                ", miles=" + miles +
                ", color='" + color + '\'' +
                ", numberWheels=" + numberWheels +
                ", numberDoors=" + numberDoors +
                '}';
    }

    @Override
    public int numberWheels() {
        return this.numberWheels;
    }
}
