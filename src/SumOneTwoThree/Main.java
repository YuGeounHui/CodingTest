package SumOneTwoThree;

import java.util.*;

public class Main {
    public static void main(String args[]) {

        Scanner scanner = new Scanner(System.in);
        int[] d = new int[11];
        d[0] = 1; // 0을 나타낼 수 있는건 1개

        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 3; j++) {
                if (i - j >= 0) {
                    d[i] += d[i-j];
                }
            }
        }

        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            System.out.println(d[n]);
        }
    }
}