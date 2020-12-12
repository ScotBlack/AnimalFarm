package lesopdrachten.relaties.two;

public class MainBird {

    public static void main(String[] args) {
        Bird larry = new Bird("Larry", "Parrot", "male", 837);
        Bird afi = new Bird ("Afi", "Kakatoo", "female", 674);
        Bird pietje = new Bird ("Pietje", "Canary", "male", 235);
        Bird willie = new Bird ("Willie", "Kakatoo", "male", 621);
        Bird lizzy = new Bird ("Lizzy", "Pidgeon", "female", 674);
        Bird mary = new Bird ("Mary", "Sparrow", "female", 201);
        Bird herman = new Bird ("Herman", "Canary", "male", 103);
        Bird sjoerd = new Bird ("Sjoerd", "Seagul", "male", 302);
        Bird sarah = new Bird ("Sarah", "Gull", "female", 902);
        Bird missy = new Bird ("Missy", "Parrot", "female", 287);


        BirdOwner hans = new BirdOwner("Hans", "male");

        hans.addBird(larry);
        hans.addBird(afi);
        hans.addBird(pietje);
        hans.addBird(willie);
        hans.addBird(lizzy);
        hans.addBird(mary);
        hans.addBird(herman);
        hans.addBird(sjoerd);
        hans.addBird(sarah);
        hans.addBird(missy);

        hans.getBirdlist();

        hans.randomBirdList();
    }
}



    /*
    Geef de klasse Bird de volgende instance variables: nickname, species, ringNumber
    De species en ringNumber variables mogen na instantiatie niet meer aangepast worden.

    Geef de klasse BirdOwner de volgende instance variables: name, sex.
    Er zijn geen restricties op getters en setters.

    Programmeer de volgende relatie.
    Een BirdOwner kan een oneindig aantal vogels hebben. Elke vogel mag echter maar 1 keer in de lijst voorkomen.
    Er mag geen List via de constructor gevuld worden. Dit moet via een methode.

    Maak een toString()-methode die het volgende afdrukt: Naam van eigenaar en van elke vogel de nickname en
    serienummer.

    Uitdagend:
    1. Zorg ervoor dat de BirdOwner minimaal 10 Bird-objecten heeft.
    2. De BirdOwner mag van de gemeente nog maar 10 Vogels houden. Hij wil random 5 vrouwtjes en vijf mannetjes kiezen.
    Schrijf een methode die dit doet en de vijf random gekozen mannetjes en de vijf random gekozen vrouwtjes uitprint.

     */