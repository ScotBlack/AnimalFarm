package lesopdrachten.inheritance.one;

public class Wolf extends AnimalMain {
    private String nameOfShelter;
    private String lastFed;
    private String nameOfPack;
    private String countryOrigin;

    public Wolf(Boolean isPet, String name, String sex, String nameOfShelter, String lastFed, String nameOfPack, String countryOrigin) {
        setPet(isPet);
        setName(name);
        setSex(sex);

        this.lastFed = lastFed;
        this.nameOfShelter = nameOfShelter;
        this.nameOfPack = nameOfPack;
        this.countryOrigin = countryOrigin;
    }

    public String getNameOfShelter() {
        return nameOfShelter;
    }

    public String getLastFed() {
        return lastFed;
    }

    public String getNameOfPack() {
        return nameOfPack;
    }

    public String getCountryOrigin() {
        return countryOrigin;
    }
}

