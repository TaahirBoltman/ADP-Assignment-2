package za.ac.cput;

import java.util.*;

public class List implements Collection{

    ArrayList<String> sweets = new ArrayList<String>(Arrays.asList("Chocolate", "Astros", "Sour Worms"));

    @Override
    public void add() {
        sweets.add("Jelly Tots");
        System.out.println(sweets);
    }

    @Override
    public void remove() {
        sweets.remove("Astros");
        System.out.println("Sweet removed: "+ sweets);
    }

    @Override
    public void find() {
        sweets.contains("Sour Worms");
        System.out.println("It Has Sour Worms: "+ sweets);
    }
}
