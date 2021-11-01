package guru.qa.lesson2.hw;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class MapExample {

    public static void main(String[] args) {

        Map<String, String> capitals = new HashMap<>();

        capitals.put("Liberia", "Monrovia");
        capitals.put("Guinea", "Conakry");
        capitals.put("Botswana", "Gaborone");
        capitals.put("Argentina", "Buenos Aires");
        capitals.put("Chile", "Santiago");
        capitals.put("Mali", "Bamako");
        capitals.put("Jordan", "Amman");

        TreeMap<String,String> sortedMapByKey = new TreeMap<>();
        sortedMapByKey.putAll(capitals);

        System.out.println("Sorting by key:");
        for (Map.Entry entry : sortedMapByKey.entrySet()) {
            System.out.println("Key: " + entry.getKey() + " Value: "
                    + entry.getValue());
        }

        System.out.println();

        Map <String, String> sortedMapByValue = capitals.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue())
                .collect(Collectors
                        .toMap(Map.Entry::getKey,
                                Map.Entry::getValue,
                                (e1, e2) -> e1,
                                LinkedHashMap::new));

        System.out.println("Sorting by value:");
        for (Map.Entry entry : sortedMapByValue.entrySet()) {
            System.out.println("Value: " + entry.getValue() + " Key: "
                    + entry.getKey());
        }

    }
}
