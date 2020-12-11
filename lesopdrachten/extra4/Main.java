package lesopdrachten.extra4;

public class Main {
    public static void main(String[] args) {
        Stoel henk = new Stoel("rood", "hout", 7, "paars");
        henk.setKleur("paars");
        System.out.println(henk.getKleur());
    }
}
