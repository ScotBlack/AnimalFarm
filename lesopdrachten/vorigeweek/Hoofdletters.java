package lesopdrachten.vorigeweek;

import java.util.ArrayList;
import java.util.List;

public class Hoofdletters {

    public static void main(String[] args) {

        List<String> customerNames = new ArrayList<>();

        customerNames.add("nick piraat");
        customerNames.add("michael jackson");
        customerNames.add("glennis grace");
        customerNames.add("dreetje hazes");
        customerNames.add("robbie williams");
        customerNames.add("michiel de ruyter");
        customerNames.add("sjaak polak");
        customerNames.add("jan van jansen");
        customerNames.add("henk den hartog");
        customerNames.add("mo el-mecky");
        customerNames.add("fredje kadetje");


        for (int i = 0; i < customerNames.size(); i++) {
            String tijdelijkeNaam = customerNames.get(i);
            String [] splitNames = tijdelijkeNaam.split(" |-");

            for (int j = 0; j < splitNames.length; j++) {

                if (splitNames[j].contains("van") || splitNames[j].contains("de") || splitNames[j].contains("den")) {
                }

                else {
                    String output = splitNames[j].substring(0, 1).toUpperCase() + splitNames[j].substring(1);
                    System.out.println(output);
                }
            }
        }
    }

//    public static boolean isVoegsels(String args){
//        List<String> isVoegsels = ArrayList.asList("van", "de", "den");
//    }
}