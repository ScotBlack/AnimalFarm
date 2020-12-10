package lesopdrachten.inheritance.one;

public class Tiger extends AnimalMain {

    private String lastFed;
    private String nameOfShelter;
    private String countryOrigin;
    private int numStripes;

    public Tiger(Boolean isPet, String name, String sex, String sound, String lastFed, String nameOfShelter, String countryOrigin, int numStripes) {
        setPet(isPet);
        setName(name);
        setSex(sex);
        setSound(sound);

        this.lastFed = lastFed;
        this.nameOfShelter = nameOfShelter;
        this.countryOrigin = countryOrigin;
        this.numStripes = numStripes;
    }



//    public void setLastFed(String lastFed) {
//        this.lastFed = lastFed;
//    }
//
//    public String getLastFed() {
//        return lastFed;
//    }
//
//    public void setNameOfShelter(String nameOfShelter) {
//        this.nameOfShelter = nameOfShelter;
//    }

    public String getNameOfShelter() {
        return nameOfShelter;
    }

//    public void setCountryOrigin(String countryOrigin) {
//        this.countryOrigin = countryOrigin;
//    }
//
//    public String getCountryOrigin() {
//        return countryOrigin;
//    }
//
//    public void setNumStripes(int numStripes) {
//        this.numStripes = numStripes;
//    }
//
//    public int getNumStripes() {
//        return numStripes;
//    }

    public String toString() {
        return "Hello my name is " + getName() + ". How are you doing?";
    }

    public int goSleep() {
        return 8;
    }
}
