package huiswerk.relaties.one;

import java.util.ArrayList;
import java.util.List;

public class CarDealer {
    private String dealerName;
    private List<Car> dealerCars;

    public CarDealer (String dealerName) {
        this.dealerName = dealerName;
        this.dealerCars = new ArrayList<>();
    }

    public String getDealerName() {
        return dealerName;
    }

    public List<Car> getDealerCars() {
        return dealerCars;
    }

    public void addCar(Car car) {
        dealerCars.add(car);
    }

    public void removeCar(Car car) {
        if (this.dealerCars.contains(car)) {
            this.dealerCars.remove(car);
        } else {
        }
    }


//    public void newOwner(Car car) {
//        getOwnerCars().add(car);
//    }

}

