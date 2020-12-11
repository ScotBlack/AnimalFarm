package lesopdrachten.extra2;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Inhabitant henk = new Inhabitant("Henk", " de Boer");
        System.out.println(henk.getFirstName() + henk.getLastName());

        Appartment luxeFlat = new Appartment("Laan van Vollenhove", "504");
        System.out.println(luxeFlat.getHouseNumber());

        Appartment superDeluxeFlat = new Appartment("Laan van Vollenhove", "508");
//        System.out.println(getPersons());
    }
}
