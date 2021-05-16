package za.ac.cput;

import java.util.Arrays;
import java.util.TreeSet;

public class Set implements Collection {

    TreeSet<String> sweetLevel = new TreeSet<String>(Arrays.asList("sweet", "sweeter", "sweetest"));

    @Override
    public void add() {
        sweetLevel.add("sour");
        System.out.println("Levels added: "+ sweetLevel);
    }

    @Override
    public void remove() {
        sweetLevel.remove("sweeter");
        System.out.println("Level removed: "+ sweetLevel);
    }

    @Override
    public void find() {
        System.out.println("It Has the level sweetest: "+ sweetLevel.contains("sweetest"));
    }
}
