package web.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Configuration
@ComponentScan
public class AppConfig {

    @Bean
    public List<Car> carList() {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("Sedan", "ABC123", 1500));
        cars.add(new Car("SUV", "DEF456", 2000));
        cars.add(new Car("Hatchback", "GHI789", 1200));
        cars.add(new Car("Convertible", "JKL012", 1800));
        cars.add(new Car("Truck", "MNO345", 2500));
        return cars;
    }
}
