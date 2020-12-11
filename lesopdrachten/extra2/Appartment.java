package lesopdrachten.extra2;

import lesopdrachten.extraoefening.Person;

import java.util.ArrayList;
import java.util.List;

public class Appartment {
    private String streetName;
    private String houseNumber;
    private List<Inhabitant> persons;

    public Appartment(String streetName, String houseNumber, List<Inhabitant> persons) {
        this.streetName = streetName;
        this.houseNumber = houseNumber;
        this.persons = persons;
    }

    public Appartment(String streetName, String houseNumber) {
        this.streetName = streetName;
        this.houseNumber = houseNumber;
        persons = new ArrayList<>();
    }

    public String getStreetName() {
        return streetName;
    }

    public String getHouseNumber() {
        return houseNumber;
    }

    public List<Inhabitant> getPersons() {
        return persons;
    }
}
