package lesopdrachten.inheritance.one;

public class AnimalMain {

    private static Boolean isPet;
    private static String name;
    private static String sex;
    private static String sound;
    private static int hoursOfSleep;

    public static void setPet(Boolean pet) {
        isPet = pet;
    }

    public static Boolean getPet() {
        return isPet;
    }

    public static void setName(String nameInput) {
        name = nameInput;
    }

    public static String getName() {
        return name;
    }

    public static void setSex(String sexInput) {
        sex = sexInput;
    }

    public static String getSex() {
        return sex;
    }

    public static void setSound(String soundInput) {
        sound = soundInput;
    }

    public static String getSound() {
        return sound;
    }

    public static String move() {
        if (isPet) {
            return getName() + " moves " + 0.25;
        } else {
            return getName() + " moves " + 0.5;
        }
    }

    public static String petToString() {
        if (getPet()) {
            return "I am a pet";
        } else {
            return "I am a wild animal";
        }
    }
}



