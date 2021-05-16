package za.ac.cput;

import java.util.HashMap;

public class Map implements Collection {

    HashMap<Integer, String> typesofSweets = new HashMap<Integer, String>();

    public void setTypesofSweets(HashMap<Integer, String> typesofSweets) {
        typesofSweets.put(1,"Chocolate");
        typesofSweets.put(2,"Sour Worms");
        typesofSweets.put(3,"Astros");
        System.out.println("Default Items: "+ typesofSweets);
    }

    @Override
    public void add() {
        setTypesofSweets(typesofSweets);
        typesofSweets.put(4,"Jelly Tots");
        System.out.println("Items added: "+ typesofSweets);
    }

    @Override
    public void remove() {
        setTypesofSweets(typesofSweets);
        typesofSweets.remove(1);
        System.out.println("Item removed: "+ typesofSweets);
    }

    @Override
    public void find() {
        setTypesofSweets(typesofSweets);
        System.out.println("It Has Astros: "+ typesofSweets.containsValue("Astros"));
    }
}
