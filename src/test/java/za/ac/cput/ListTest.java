package za.ac.cput;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

class ListTest implements CollectionTest {

    ArrayList<String> sweets = new ArrayList<String>(Arrays.asList("Chocolate", "Astros", "Sour Worms"));

    @Test
    public void Testadd() {
        sweets.add("Jelly Tots");
        System.out.println("Sweet Added: "+ sweets);
    }

    @Test
    public void Testremove() {
        sweets.remove("Astros");
        System.out.println("Sweet removed: "+ sweets);
    }

    @Test
    public void Testfind() {
        System.out.println("It Has Sour Worms: "+ sweets.contains("Sour Worms"));
    }


}
