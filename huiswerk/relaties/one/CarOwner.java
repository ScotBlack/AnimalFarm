package huiswerk.relaties.one;

import java.util.ArrayList;
import java.util.List;

public class CarOwner {
    private String ownerName;
    private List<Car> ownerCars;


    public CarOwner(String ownerName) {
        this.ownerName = ownerName;
        this.ownerCars = new ArrayList<>();
    }

    public String getOwnerName() {
        return ownerName;
    }

    public List<Car> getOwnerCars() {
        return ownerCars;
    }

    public void buyCar (Car car, CarDealer dealer) {
        ownerCars.add(car);
        dealer.removeCar(car);
        car.setOwned(true);
        car.setOwner(getOwnerName());
        System.out.println(getOwnerName() + " bought a " + car.getMerk() + car.getModel());
    }

    public void sellCar (Car car, CarDealer dealer) {
        ownerCars.remove(car);
        dealer.addCar(car);
        car.setOwned(false);
        car.setOwner(null);
        System.out.println(getOwnerName() + " sold a " + car.getMerk() + car.getModel());
    }
}

