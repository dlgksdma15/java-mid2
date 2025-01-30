package collection.map.test;

import java.util.HashMap;
import java.util.Map;

public class WordFrequencyTest2 {
    public static void main(String[] args) {
        String text = "orange banana apple apple banana apple";
        String[] words = text.split(" ");
        Map<String, Integer> map = new HashMap<>();

        for (String word : words) {
            map.put(word, map.getOrDefault(word, 0) +1); //없으면 0을 반환해라 있으면 있는값을 반환하고 +1

        }
        System.out.println(map);
    }
}
