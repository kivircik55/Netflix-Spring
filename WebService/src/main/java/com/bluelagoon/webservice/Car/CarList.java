package com.bluelagoon.webservice.Car;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;
import java.util.HashMap;

public class CarList {
    private final HashMap<String, Car> carHashMap;

    public CarList() {
        this.carHashMap = new HashMap<String, Car>();
        Car car1 = new Car("EE073GB","Renault","Kadjar",new Date(2016,10,10),
                "Diesel",1300,150000,"Blue", 4,5);
        Car car2 = new Car("DC832AS","Maserati","Ghibli",new Date(2016,04,17),
                "Gazolin",8000,123450,"Grey", 4,5);
        Car car3 = new Car("AG203KJ","Peugeot","206",new Date(2000,04,07),
                "Gazolin",273,175520,"Grey", 4,5);
        Car car4 = new Car("TC809VB","Renault","Clio",new Date(2005,12,03),
                "Diesel",375,75000,"Blue", 4,5);

        this.carHashMap.put(car1.getPlate(), car1);
        this.carHashMap.put(car2.getPlate(), car2);
        this.carHashMap.put(car3.getPlate(), car3);
        this.carHashMap.put(car4.getPlate(), car4);
    }

    public HashMap<String, Car> getCarHashMap() {
        return carHashMap;
    }
}
