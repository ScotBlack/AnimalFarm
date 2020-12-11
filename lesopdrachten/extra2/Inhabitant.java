package lesopdrachten.extra2;

import java.util.List;

public class Inhabitant {
    private String firstName;
    private String lastName;


    public Inhabitant ( String firstName,String lastName ) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
//    public List<Inhabitant> getPersons() {
//        return persons;
//    }
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}
