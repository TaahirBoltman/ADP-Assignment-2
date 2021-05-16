package za.ac.cput;

import org.junit.jupiter.api.Test;

import java.util.*;

public class MapTest implements CollectionTest  {

    HashMap<Integer, String> typesofSweets = new HashMap<Integer, String>();

    public void setTypesofSweets(HashMap<Integer, String> typesofSweets) {
        typesofSweets.put(1,"Chocolate");
        typesofSweets.put(2,"Sour Worms");
        typesofSweets.put(3,"Astros");
        System.out.println("Default Items: "+ typesofSweets);
    }

    @Test
    public void Testadd() {
        setTypesofSweets(typesofSweets);
        typesofSweets.put(4,"Jelly Tots");
        System.out.println("Items added: "+ typesofSweets);
    }

    @Test
    public void Testremove() {
        setTypesofSweets(typesofSweets);
        typesofSweets.remove(1);
        System.out.println("Item removed: "+ typesofSweets);
    }

    @Test
    public void Testfind() {
        setTypesofSweets(typesofSweets);
        System.out.println("It Has Astros: "+ typesofSweets.containsValue("Astros"));
    }
}
