package lesopdrachten.inheritance.one;

public class Main {

    public static void main(String[] args) {
        Tiger beatrix = new Tiger(true, "van Nassau", "Female","Rawrr", "Yesterday", "Paleis Soestdijk", "Germany", 1);
//        System.out.println(beatrix.getPet());
//        System.out.println(beatrix.getName());
//        System.out.println(beatrix.getNameOfShelter());
//        System.out.println(beatrix.move());
//        System.out.println(beatrix.getSound());
        System.out.println(beatrix.toString());

        Wolf willem = new Wolf(false, "Willem de Zwijger", "Male", "Vollenhove Flat", "Tomorrow", "ZeistWestSide", "Spain");
        System.out.println(willem.getNameOfShelter());
        System.out.println(willem.move());
    }

}
