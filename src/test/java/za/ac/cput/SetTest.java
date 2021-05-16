package za.ac.cput;

import org.junit.jupiter.api.Test;

import java.util.*;
import java.util.Set;

public class SetTest implements CollectionTest {

    TreeSet<String> sweetLevel = new TreeSet<String>(Arrays.asList("sweet", "sweeter", "sweetest"));

    @Test
    public void Testadd() {
        sweetLevel.add("sour");
        System.out.println("Levels added: "+ sweetLevel);
    }

    @Test
    public void Testremove() {
        sweetLevel.remove("sweeter");
        System.out.println("Level removed: "+ sweetLevel);
    }

    @Test
    public void Testfind() {

        System.out.println("It Has the level sweetest: "+ sweetLevel.contains("sweetest"));
    }
}
