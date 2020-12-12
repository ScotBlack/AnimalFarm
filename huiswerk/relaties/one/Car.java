package huiswerk.relaties.one;

public class Car {
    private String kenteken;
    private String merk;
    private String model;
    private int aantalKm;
    private boolean owned;

    public Car(String kenteken, String merk,String model, int aantalKm, boolean owned) {
        this.kenteken = kenteken;
        this.merk = merk;
        this.model = model;
        this.aantalKm = aantalKm;
        this.owned = owned;
    }
}
