package collection.list.test.ex1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListEx3 {
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
        int sum = 0;
        for (Integer number : numbers) {
            sum += number;
        }
        double average = (double) sum / numbers.size();
        System.out.println("입력한 정수의 합계: " + sum);
        System.out.println("입력한 정수의 편균: " + average);
    }
}
