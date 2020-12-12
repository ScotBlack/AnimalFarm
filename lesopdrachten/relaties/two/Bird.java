package lesopdrachten.relaties.two;

public class Bird {
    private String nickName;
    private String species;
    private String sex;
    private int ringNumber;

    public Bird(String nickName, String species, String sex, int ringNumber) {
        this.nickName = nickName;
        this.species = species;
        this.sex = sex;
        this.ringNumber = ringNumber;
    }

    public String getNickName() {
        return nickName;
    }

    public String getSpecies() {
        return species;
    }

    public String getSex() {
        return sex;
    }

    public int getRingNumber() {
        return ringNumber;
    }
}
