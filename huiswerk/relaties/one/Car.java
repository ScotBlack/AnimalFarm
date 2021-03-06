package huiswerk.relaties.one;

public class Car {
    private String kenteken;
    private String merk;
    private String model;
    private int aantalKm;
    private boolean owned;
    private String owner;


    public Car(String kenteken, String merk,String model, int aantalKm, boolean owned, String owner) {
        this.kenteken = kenteken;
        this.merk = merk;
        this.model = model;
        this.aantalKm = aantalKm;
        this.owned = owned;
        this.owner = owner;
    }

    public String getMerk() {
        return merk;
    }

    public String getModel() {
        return model;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwned(Boolean input) {
      this.owned = input;
    }

    public Boolean getOwned() {
        return owned;
    }

}
