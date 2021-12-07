package one.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.TreeSet;

public class Demonstration {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Sead");
        names.add("Vedad");
        names.add("Ajla");
        names.add("Berin");
        names.add("Adnan");
        String[] itemsArray = new String[names.size()];
        String[] arrayOfNames = names.toArray(itemsArray);
        //Bubble sort
        Arrays.sort(arrayOfNames,String::compareTo );
        for (String name : arrayOfNames) {
            System.out.println(name);
        }

    }
}
