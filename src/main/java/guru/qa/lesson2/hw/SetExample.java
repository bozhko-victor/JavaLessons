package guru.qa.lesson2.hw;

import java.util.HashSet;
import java.util.TreeSet;

public class SetExample {

    public static void main(String[] args) {
        HashSet<String> capitals = new HashSet<>();

        capitals.add("Monrovia");
        capitals.add("Conakry");
        capitals.add("Gaborone");
        capitals.add("Buenos Aires");
        capitals.add("Santiago");
        capitals.add("Bamako");
        capitals.add("Amman");
        capitals.add("Monrovia");

        HashSet<String> list = new HashSet<>();
        list.addAll(capitals);
        System.out.println(list);

        System.out.println();

        System.out.println("Sorted :");
        TreeSet<String> listSorted = new TreeSet<>();
        listSorted.addAll(capitals);

        for (String elementCollection : listSorted) {
            System.out.println(elementCollection);
        }

    }
}
