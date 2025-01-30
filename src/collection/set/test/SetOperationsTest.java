package collection.set.test;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetOperationsTest {
    public static void main(String[] args) {
        HashSet<Integer> set1 = new HashSet<>(List.of(1, 2, 3, 4, 5));
        HashSet<Integer> set2 = new HashSet<>(List.of(3, 4, 5, 6, 7));

        /*Set<Integer> union = new HashSet<>(set1);
        for (Integer s : set2) {
            union.add(s);
        }

        Set<Integer> intersection = new HashSet<>();
        for (Integer s : set2) {
            if(set1.contains(s)){
                intersection.add(s);
            }
        }

        Set<Object> difference = new HashSet<>(set1);
        for (Integer s : set2) {
            difference.remove(s);
        }*/
        Set<Integer> union = new HashSet<>(set1);
        union.addAll(set2);

        Set<Object> intersection = new HashSet<>(set1);
        intersection.retainAll(set2);

        Set<Object> difference = new HashSet<>(set1);
        difference.removeAll(set2);

        System.out.println("합집합: " + union);
        System.out.println("교집합: " + intersection);
        System.out.println("차집합: " + difference);
    }
}
