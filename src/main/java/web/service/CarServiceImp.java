package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.List;

@Service
public class CarServiceImp implements CarService {

    private List<Car> cars = List.of(
            new Car("Tesla", "USA", "1"),
            new Car("BMW", "Germany", "2"),
            new Car("Reno", "France", "3"),
            new Car("Volvo", "Sweden", "4"),
            new Car("Mazda", "Japan", "5")
    );

    public List<Car> getCars(int number) {
        return number > cars.size() ? cars : cars.subList(0, number);
    }

}
