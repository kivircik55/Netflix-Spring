package com.bluelagoon.webservice.webservice;

import com.bluelagoon.webservice.Car.Car;
import com.bluelagoon.webservice.Car.CarList;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.stream.Stream;

@RestController
public class WebServiceController {

    private final CarList carList;

    public WebServiceController(){
        this.carList = new CarList();
    }

    @GetMapping(value = "/" , produces = MediaType.APPLICATION_JSON_VALUE)
    public Collection<Car> sayHello(){
        return this.carList.getCarHashMap().values();
    }

    @GetMapping(value = "/cars", produces = MediaType.APPLICATION_JSON_VALUE)
    public Car getCarFromPlate(@RequestParam (value = "carPlate") String carPlate){
        return this.carList.getCarHashMap().get(carPlate);
    }

    @PostMapping(value = "/cars/addCar", consumes = MediaType.APPLICATION_JSON_VALUE)
    public String addCar(@RequestParam Car car){
        if (this.carList.getCarHashMap().containsKey(car.getPlate())){
            return "This vehicle is already registered on the base";
        }
        else {
            this.carList.getCarHashMap().put(car.getPlate(),car);
            return "The car has been added to the base";
        }
    }
}
