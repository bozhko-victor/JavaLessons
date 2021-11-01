package guru.qa.lesson2.hw;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListExample {
    public static void main(String[] args) {

        List<String> sortList = new ArrayList<>();
        sortList.add("Monrovia");
        sortList.add("Conakry");
        sortList.add("Gaborone");
        sortList.add("Buenos Aires");
        sortList.add("Santiago");
        sortList.add("Bamako");
        sortList.add("Amman");

        System.out.println(sortList.size());
        System.out.println();
        for (String element : sortList) {
            System.out.println(element);
        }
        System.out.println();
        for (int i = sortList.size() - 1; i >= 0; i--) {
            System.out.println(sortList.get(i));
        }
        System.out.println();
        Collections.sort(sortList);
        for (String element: sortList) {
            System.out.println(element);
        }
        System.out.println();
        Collections.reverse(sortList);
        for (String element: sortList) {
            System.out.println(element);
        }
    }
}
