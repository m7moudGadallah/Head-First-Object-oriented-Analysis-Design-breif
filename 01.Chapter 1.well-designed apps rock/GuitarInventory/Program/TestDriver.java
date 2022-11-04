import java.util.Iterator;
import java.util.List;

import myUtil.*;

public class TestDriver{
    public static void initializeInventor(Inventory inventory) {
        inventory.addGuiter("V95693", 1499.95, new GuitarSpec(Builder.FENDER,
                            "Stratocastor", Type.ELECTRIC,
                            6, Wood.ALDER, Wood.ALDER));
        
        inventory.addGuiter("V9512", 1549.95, new GuitarSpec(Builder.FENDER,
                            "Stratocastor", Type.ELECTRIC,
                            6, Wood.ALDER, Wood.ALDER));
    }

    public static void main(String[] args) {
        Inventory inventory = new Inventory();
        initializeInventor(inventory);

        GuitarSpec whatErinLikes = new GuitarSpec(Builder.FENDER,
                                          "Stratocastor", Type.ELECTRIC,
                                          6, Wood.ALDER, Wood.ALDER);
        
        List<Guitar> matchingGuitars = inventory.search(whatErinLikes);

        if (!matchingGuitars.isEmpty()) {
            System.out.println("Erin, you might like these guitars:  ");

            for (Iterator<Guitar> it = matchingGuitars.iterator(); it.hasNext(); ) {
                Guitar guitar = (Guitar) it.next();
                GuitarSpec spec = guitar.getSpec();

                System.out.println( "we have a " +
                    spec.getBuilder() + " " + spec.getModel() + " " + spec.getNumStrings() + "-string " +
                    spec.getType() + " guitar:\n " + 
                    spec.getBackWood() + " back and sides,\n " + 
                    spec.getTopWood() + " top.\n you can hav it for only $" + 
                    guitar.getPrice() + "!\n-------");
            }
        }
        else {
            System.out.println("Sorry, Erin, we have nothing for you.");
        }
    }
}