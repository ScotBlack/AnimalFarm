package huiswerk.relaties.one;

public class MainCar {

    public static void main(String[] args) {
        CarOwner sjoerd = new CarOwner("Sjoerd");

        CarDealer vwdealer = new CarDealer ("Volkswagen Dealer");

        Car golfje = new Car("234-AB-12", "Volkswagen", "Golf", 234_123, false, null );
        Car corsaatje = new Car("128-ZX-92", "Opel", "Corsa", 120_876, false, null);


        System.out.println("owner cars: " + sjoerd.getOwnerCars().size());
        System.out.println("cars in dealer: " + vwdealer.getDealerCars().size());
        System.out.println("Car owned by: " + golfje.getOwner());

        sjoerd.buyCar(golfje, vwdealer);

        System.out.println("owner cars: " + sjoerd.getOwnerCars().size());
        System.out.println("cars in dealer: " + vwdealer.getDealerCars().size());
        System.out.println("Car owned by: " + golfje.getOwner());

        sjoerd.sellCar(golfje, vwdealer);
        sjoerd.buyCar(corsaatje, vwdealer);

        System.out.println("owner cars: " + sjoerd.getOwnerCars().size());
        System.out.println("cars in dealer: " + vwdealer.getDealerCars().size());
        System.out.println("Car owned by: " + golfje.getOwner());

        sjoerd.buyCar(golfje, vwdealer);

        System.out.println("owner cars: " + sjoerd.getOwnerCars().size());
        System.out.println("cars in dealer: " + vwdealer.getDealerCars().size());
        System.out.println("Car owned by: " + golfje.getOwner());


    }
}


    /*
    Maak de volgende drie klassen:
    CarOwner, Car, CarDealer.

    Verzin zelf wat simpele instance variables bij CarOwner en CarDealer.
    Car heeft: kenteken, merk, subtype, aantalKmGereden

    Een CarOwner kan 0 of meerdere auto's hebben.
    Een CarDealer kan 0 of meerdere auto's hebben.
    Een Car kan 0 of 1 owner hebben (alleen CarOwner-klasse). Wanneer de auto bij de dealer staat is de carowner
    leeg (null).

    Voeg aan de CarDealer een methode toe die een auto vanuit zijn garage kan overschrijven naar de CarOwner. Zowel
    de list van CarOwner moet dan uitgebreid worden als de eigenaar van de Car moet aangepast worden. We hebben het hier
    dus over een bidirectionele relatie!

    Zorg ervoor dat alleen unieke auto's op basis van een kenteken aan de List van CarDealer en CarOwner toegevoegd
    kunnen worden.

    Extra: Voeg een variabele leeftijd toe aan CarOwner. Check daarna altijd of de CarOwner wel 18 of ouder is.

     */