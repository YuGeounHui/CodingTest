package Combination;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        long n = scanner.nextInt();
        long m = scanner.nextInt();

        long twoCount = 0;
        long fiveCount = 0;

        for (long i = 2; i<=n; i*=2) {
            twoCount += n/i;
        }
        for (long i = 2; i<=n-m; i*=2) {
            twoCount -= (n-m)/i;
        }
        for (long i = 2; i<=m; i*=2) {
            twoCount -= m/i;
        }
        for (long i = 5; i<=n; i*=5) {
            fiveCount += n/i;
        }
        for (long i = 5; i<=n-m; i*=5) {
            fiveCount -= (n-m)/i;
        }
        for (long i = 5; i<=m; i*=5) {
            fiveCount -= m/i;
        }

        System.out.println(Math.min(twoCount, fiveCount));
    }
}
