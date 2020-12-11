package lesopdrachten.relaties.one;

import java.util.ArrayList;
import java.util.List;

public class DogOwner {
    private String name;
    private String sex;
    private List<Dog> dogs;

    public DogOwner(String name, String sex, List<Dog> dogs) {
        this.name = name;
        this.sex = sex;
        this.dogs = dogs;
    }
    public DogOwner(String name, String sex) {
        this.name = name;
        this.sex = sex;
        dogs = new ArrayList<>();
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getSex() {
        return sex;
    }

    public List<Dog> getDogs() {
        return dogs;
    }

    public void addDog(Dog dog) {
        if (dogs.size() < 1) {
            dogs.add(dog);
        } else {
            System.out.println("Can't add more dogs!");
        }
    }

    public void changeDogName(String newName) {
        dogs.get(0).setName(newName);
    }

    public String showInfo() {
        return getName() + " heeft een " + dogs.get(0).getBreed() + " genaamd " + dogs.get(0).getName() + ". " + dogs.get(0).sexToString()
                + " is alweer " + dogs.get(0).getAge() + " jaar oud.";
    }
}

