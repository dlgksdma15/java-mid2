package collection.list.test.ex1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ListEx2 {
    public static void main(String[] args) {
        System.out.println("n개의 정수를 입력하세요 (종료 0)");
        Scanner sc = new Scanner(System.in);
        List<Integer> numbers = new ArrayList<>();
        while (true){
            int n = sc.nextInt();
            if(n == 0){
                break;
            }
            numbers.add(n);
        }
        for (int i = 0; i < numbers.size(); i++) {
            System.out.print(numbers.get(i));
            if(i < numbers.size() - 1){
                System.out.print(", ");
            }
        }
    }
}
