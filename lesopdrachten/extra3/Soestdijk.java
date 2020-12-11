package lesopdrachten.extra3;

import java.util.List;

public class Soestdijk {
    public static void main(String[] args) {
        Person beatrix = new Person("Beatrix", "van Nassau");
        Person willie = new Person("Willem", "van Nassau");
        Person max = new Person("Maxima", "van Nassau");
        Person amalia = new Person("Amalia", "van Nassau");

        Appartment soestdijk = new Appartment("Soestdijksestraat", "1");

        soestdijk.addPerson(beatrix);
        soestdijk.addPerson(willie);
        soestdijk.addPerson(max);
        soestdijk.addPerson(amalia);

        System.out.println(soestdijk.toString());



    }
}
