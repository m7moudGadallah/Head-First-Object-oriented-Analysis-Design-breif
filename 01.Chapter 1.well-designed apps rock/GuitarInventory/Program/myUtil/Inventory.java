package myUtil;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Inventory {
    private List<Guitar> guitars;

    public Inventory(){
        guitars = new LinkedList<Guitar>();
    }

    public void addGuiter(String serialNumber, double price, GuitarSpec spec) {
        Guitar guitar = new Guitar(serialNumber, price, spec);

        guitars.add(guitar);
    }

    public Guitar getGuitar(String serialNumber) {
        for (Iterator<Guitar> it = guitars.iterator(); it.hasNext(); ) {
            Guitar guitar = (Guitar) it.next();

            if (guitar.getSerialNumber().equals(serialNumber))
                return guitar;
        }

        return null;
    }

    public List<Guitar> search(GuitarSpec serachSpec)
    {
        List<Guitar> matchingGuitars = new LinkedList<Guitar>();

        for (Iterator<Guitar> it = guitars.iterator(); it.hasNext(); ) {
            Guitar guitar = (Guitar) it.next();
            GuitarSpec spec = guitar.getSpec();
            if (spec.matches(serachSpec))
                matchingGuitars.add(guitar);
        }

        return matchingGuitars;
    }
}
