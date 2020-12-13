package lesopdrachten.relaties.two;

import java.util.ArrayList;
import java.util.List;

public class BirdOwner {
    private String name;
    private String sex;
    private List<Bird> birds;
    private List<Bird> selectedBirds;

    public BirdOwner(String name, String sex) {
        this.name = name;
        this.sex = sex;
        birds = new ArrayList<>();
        selectedBirds = new ArrayList<>();
    }

    public String getName() { return name; }

    public List<Bird> getBirds() { return birds; }

    public List<Bird> getSelectedBirds() { return selectedBirds; }

    public int randNum() {
        int range = getBirds().size() -1;
        return Math.toIntExact(Math.round(Math.random() * range));
    }

    public void randomBirdList() {
        int birdInt;
        int maleInt = 0;
        int femaleInt =0;
        String birdString = "Names of the selected birds:";

        while (getSelectedBirds().size() < 6){
            birdInt = randNum();

            if (getBirds().get(birdInt).getSex() == "male" && maleInt < 3 && !getSelectedBirds().contains(birds.get(birdInt)))  {
                maleInt++;
                getSelectedBirds().add(birds.get(birdInt));
//                System.out.println(birds.get(birdInt).getNickName() + " was added. \n Males:" + maleInt + "\n Females:" + femaleInt + "\n Total selected: " + getSelectedBirds().size());
            } else if (getBirds().get(birdInt).getSex() == "female" && femaleInt < 3 && !getSelectedBirds().contains(birds.get(birdInt)) ) {
                femaleInt++;
                getSelectedBirds().add(birds.get(birdInt));
//                System.out.println(birds.get(birdInt).getNickName() + " was added. \n Males:" + maleInt + "\n Females:" + femaleInt + "\n Total size: " + getSelectedBirds().size());
            } else {
                if (getSelectedBirds().contains(birds.get(birdInt))) {
                    System.out.println(birds.get(birdInt).getNickName() + " could not be added. Is already selected!");
                } else if (maleInt == 3) {
                    System.out.println(birds.get(birdInt).getNickName() + " could not be added. Too many males already!");
                } else if (femaleInt == 3) {
//                    System.out.println(birds.get(birdInt).getNickName() + " could not be added. Too many females already!");
                }
            }
        }
        for (int i = 0; i < getSelectedBirds().size() ; i++) {
            birdString += getSelectedBirds().get(i).getNickName() + " ";
        }
        System.out.println(birdString);
    }

    public String getBirdlist() {
        String birdOverzicht = "";
        for (int i = 0; i < birds.size(); i++) {
            birdOverzicht += (i + 1) + " "  + birds.get(i).getNickName() + " is a " + birds.get(i).getSpecies() +
                        " with the ring number: " + birds.get(i).getRingNumber() + ". \n" ;
        }
        return birdOverzicht;
    }

    public void addBird(Bird bird) {
        if(birds.isEmpty()) {
            birds.add(bird);
        } else if (checkBirdAvailable(bird) == true) {
            System.out.println("Bird is already added.");
        } else {
            birds.add(bird);
        }
    }

        public boolean checkBirdAvailable(Bird arg) {
            for (int i = 0; i < birds.size(); i++) {
                if (arg == birds.get(i)) {
                    return true;
                }
            }
            return false;
        }

    public void ownerToString() {
        System.out.println(getName() + " has the birds: " + "\n" + getBirdlist());
    }
}
