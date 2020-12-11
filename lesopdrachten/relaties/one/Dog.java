package lesopdrachten.relaties.one;

public class Dog {
    private String name;
    private String sex;
    private String breed;
    private int age;

    public Dog(String name, String sex, String breed,int age) {
        this.name = name;
        this.sex = sex;
        this.breed = breed;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getSex() {
        return sex;
    }

    public String getBreed() {
        return breed;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public String sexToString () {
        if (sex == "male") {
            return "Hij";
        } else if (sex == "female") {
            return "Zij";
        } else {
            return "Het geslachtsloze hondje";
        }
    }

    public void addYear() {
        this.age++;
    }

    public String dogToString() {
        return getName() + " is a " + getAge() + " year old " + getBreed() + ".";
    }
}
