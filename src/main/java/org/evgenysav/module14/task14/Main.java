package org.evgenysav.module14.task14;

import java.util.Arrays;
import java.util.Map;
import java.util.Random;
import java.util.Set;

public class Main {

    private static final String[] items = new String[]{"Milk", "Bread", "Salad", "Broccoli", "Pears", "Pineapples", "Bread", "Butter"};

    public static void main(String[] args) {
        Map<String, Integer> map = new MyHashMap<>();
        initMap(map);
        System.out.println("Before in store: " + map);
        System.out.println("Most frequent: " + getMostFrequent(map));
        System.out.println("Products in store: " + getKeysFromMap(map, new String[]{"Sweets", "Chocolate", "Cookies", "Marmalade"}));
    }

    private static void initMap(Map<String, Integer> map) {
        Random r = new Random();
        for (int i = 0; i < items.length; i++) {
            int randomNum = r.nextInt(70);
            if (randomNum < 30) {
                randomNum += 30;
            }

            map.put(items[i], randomNum);
        }
    }

    private static String getMostFrequent(Map<String, Integer> map) {
        int max = map.values().stream().mapToInt(Integer::intValue).max().getAsInt();
        for (var entry : map.entrySet()) {
            if (entry.getValue() == max) {
                return entry.getKey();
            }
        }

        return "Not found";
    }

    private static Set<String> getKeysFromMap(Map<String, Integer> map, String[] valuesToAdd) {
        Set<String> keys = map.keySet();
        keys.addAll(Arrays.asList(valuesToAdd));
        return keys;
    }
}
