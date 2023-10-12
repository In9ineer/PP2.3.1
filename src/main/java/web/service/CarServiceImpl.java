package web.service;

import org.springframework.stereotype.Service;
import web.Dao.CarDao;
import web.model.Car;

import java.util.List;

@Service
public class CarServiceImpl implements CarService {

    @Override
    public List<Car> getCars(Integer count) {
        List<Car> carList = new CarDao().getCarList();

        if (count == null || count >= 5) {
            return carList;
        } else {
            return carList.subList(0, count);
        }
    }
}
