package web.Dao;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarDao {

    private List<Car> carList = new ArrayList<>();

    public CarDao() {

        carList.add(new Car("Sedan", "ABC123", 1500));
        carList.add(new Car("SUV", "DEF456", 2000));
        carList.add(new Car("Hatchback", "GHI789", 1200));
        carList.add(new Car("Convertible", "JKL012", 1800));
        carList.add(new Car("Truck", "MNO345", 2500));
    }

    public List<Car> getCarList() {
        return carList;
    }
}
