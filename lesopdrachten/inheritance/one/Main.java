package lesopdrachten.inheritance.one;

public class Main {

    public static void main(String[] args) {
        Tiger beatrix = new Tiger(false, "Beatrix van Nassau", "Female","Rawrr", "monday", "Paleis Soestdijk", "Germany", 24);
        System.out.println(beatrix.toString());

        Wolf willem = new Wolf(false, "Willem de Zwijger", "Male", "Vollenhove Flat", "Tomorrow", "ZeistWestSide", "Spain");

        System.out.println(willem.getNameOfShelter());
        System.out.println(willem.move());
    }

}
