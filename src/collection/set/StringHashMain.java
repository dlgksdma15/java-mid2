package collection.set;

import java.util.Arrays;
import java.util.LinkedList;

public class StringHashMain {
    static final int CAPACITY = 10;
    public static void main(String[] args) {
        //char
        char charA = 'A';
        char charB = 'B';
        System.out.println("charA = " + (int)charA);
        System.out.println("charB = " + (int)charB);

        //hashCode
        System.out.println("hashCode('A') = " + hashCode("A"));
        System.out.println("hashCode('B') = " + hashCode("B"));
        System.out.println("hashCode('AB') = " + hashCode("AB"));

        //hashIndex
        System.out.println("hashIndex(A) = " + hashIndex(hashCode("A")));
        System.out.println("hashIndex(A) = " + hashIndex(hashCode("B")));
        System.out.println("hashIndex(A) = " + hashIndex(hashCode("AB")));
        LinkedList<Integer>[] list = new LinkedList[CAPACITY];
        System.out.println(Arrays.toString(list));
        list[0] = new LinkedList<>();
        list[0].add(hashIndex(hashCode("A")));
        System.out.println(Arrays.toString(list));

    }

    static int hashCode(String str){
        char[] charArray = str.toCharArray();
        int sum = 0;
        for (char c : charArray) {
            sum = sum +(int)c;
        }
        return sum;

    }

    static int hashIndex(int value){
        return value % CAPACITY;
    }
}
