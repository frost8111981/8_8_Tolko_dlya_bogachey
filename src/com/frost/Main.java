package com.frost;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Main {

    public static Map<String, Integer> createMap() {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Антон", 500);
        map.put("Василий", 500);
        map.put("Дима", 100);
        map.put("Тима", 100);
        map.put("Баха", 100);
        map.put("Ярик", 100);
        map.put("Маня", 100);
        map.put("Витя", 100);
        map.put("Гена", 100);
        map.put("Сева", 100);
      return map;
    }

    public static void removeItemFromMap(Map<String, Integer> map) {
        Iterator<Map.Entry<String, Integer>> itr = map.entrySet().iterator();
        while (itr.hasNext()) {
            Map.Entry<String, Integer> entry = itr.next();
            if (entry.getValue() < 500) {
                itr.remove();
            }
        }
    }

    public static void main(String[] args) {
        createMap();
        System.out.println();
        removeItemFromMap(createMap());

    }
}
//  for (Map.Entry<String, Integer> entry : map.entrySet()) {
//        System.out.println(entry.getKey() + " " + entry.getValue());
//        }
