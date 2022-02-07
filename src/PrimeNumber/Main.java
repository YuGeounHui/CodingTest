package PrimeNumber;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int firstNumber = scanner.nextInt();
        int lastNumber = scanner.nextInt();

        boolean[] checkPrimeNumber = new boolean[lastNumber + 1];
        checkPrimeNumber[0] = checkPrimeNumber[1] = true;

        for (int i = 2; i * i <= lastNumber; i++) {

            if (checkPrimeNumber[i] == true) {
                continue;
            }

            // 배수제거
            for (int j = i + i; j <= lastNumber; j += i) {
                checkPrimeNumber[j] = true;
            }
        }

        for (int i = firstNumber; i <= lastNumber; i++) {
            if (checkPrimeNumber[i] == false) {
                System.out.println(i);
            }
        }
    }
}
