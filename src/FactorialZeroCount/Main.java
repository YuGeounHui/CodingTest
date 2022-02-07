package FactorialZeroCount;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();
        int answer = 0;

        for (int i = 5; i <= number; i *= 5) {
            answer += number / i;
        }

        System.out.println(answer);
    }
}
