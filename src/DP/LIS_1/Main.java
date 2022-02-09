package DP.LIS_1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        int[] d = new int[n];

        for (int i = 0; i < n; i++) {

            d[i] = 1; // 처음 값 1로 무조건 초기화

            for (int j = 0; j < i; j++) {
                if (a[j] < a[i] && d[i] < d[j] + 1) {
                    d[i] = d[j] + 1;
                }
            }
        }

        int answer = d[0];
        for (int i = 0; i < n; i++) {
            if (answer < d[i]) {
                answer = d[i];
            }
        }
        System.out.println(answer);
    }
}
