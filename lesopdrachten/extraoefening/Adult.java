package lesopdrachten.extraoefening;

public class Adult extends Person {
    private Boolean hasChildren;
    private int hasLegs;

    public Adult(String firstName, String lastName, String gender, Boolean hasChildren, int hasLegs) {
        setFirstName(firstName);
        setLastName(lastName);
        setGender(gender);

        this.hasChildren = hasChildren;
        this.hasLegs = hasLegs;
    }

    public String toString() {
        return getFirstName() + " " + getLastName() + " is een " + getGender() + hasChildrenString() + " " + hasLegsString();
    }

    public String hasChildrenString() {
        if (hasChildren) {
            return " en heeft kinderen.";
        } else {
            return " en heeft geen kinderen.";
        }
    }

    public String hasLegsString() {
        if (hasLegs == 2) {
            return getFirstName() + " heeft gelukkig gewoon twee benen.";
        } else if (hasLegs == 1) {
            return getFirstName() + " heeft maar een been, maar huppelt gelukkig vrolijk door het leven.";
        } else if (hasLegs == 0) {
            return getFirstName() + " heeft geen benen, maar rolt gelukkig vrolijk door het leven.";
        } else if (hasLegs > 2) {
            return getFirstName() + " heeft " + hasLegs + " benen en is dus waarschijnlijk in Czernobyl geboren.";
        } else {
            return getFirstName();
        }
    }
}