package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.List;

@Service
public class CarServiceImpl implements CarService {

    @Autowired
    private final List<Car> carList;

    public CarServiceImpl (List<Car> carList) {
        this.carList = carList;
    }

    @Override
    public List<Car> getCars(Integer count) {
        if (count == null || count >= 5) {
            return carList;
        } else {
            return carList.subList(0, count);
        }
    }
}
