package lesopdrachten.relaties.one;

public class DogOwnerMain {
    public static void main(String[] args) {
        Dog bobby = new Dog("Bobby", "male", "Golden Retriever", 8 );
        Dog felix = new Dog("Felix", "male", "Chihuahau", 3);
        DogOwner sjoerd = new DogOwner("Sjoerd", "man");

        System.out.println(bobby.dogToString());
        System.out.println(felix.dogToString());

        sjoerd.addDog(bobby);
        sjoerd.addDog(felix);

        System.out.println(sjoerd.showInfo());

        bobby.addYear();

        System.out.println(sjoerd.showInfo());

        sjoerd.changeDogName("Herman");

        System.out.println(sjoerd.showInfo());
    }
}



/*
    Opdracht
    Geef de klasse Dog de volgende instance variables: name, species, age, sex. Datatypes mag je zelf verzinnen.
    De sex en species variables mogen na instantiatie niet meer aangepast worden.

    Geef de klasse DogOwner de volgende instance variables: name, sex.
    Er zijn geen restricties op getters en setters.

    Programmeer de volgende relatie: Een DogOwner kan maximaal 1 Dog hebben. De DogOwner is in dit geval de eigenaar.
    De DogOwner-klasse moet methodes bevatten om de naam van de hond aan te passen én de leeftijd met 1 te verhogen.

    Geef de DogOwner een toString()-methode en druk dit af:
    NAAM-DogOwner heeft een reu/teef, deze is xx jaar oud en van het soort: SOORT-Dog. De hond heet: NAAM-Dog

    Instantieer hieronder de objecten en laat zien dat je code werkt.
     */