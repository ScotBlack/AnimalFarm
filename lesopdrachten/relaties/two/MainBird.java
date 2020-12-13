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

        hans.ownerToString();

        hans.randomBirdList();
    }
}

