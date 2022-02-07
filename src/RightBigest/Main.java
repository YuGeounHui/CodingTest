package RightBigest;

import java.io.*;
import java.util.Stack;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(bufferedReader.readLine());

        int[] a = new int[n];
        int[] answer = new int[n];
        String[] temp = bufferedReader.readLine().split(" ");
        for (int i = 0; i< n; i++) {
            a[i] = Integer.parseInt(temp[i]);
        }

        Stack<Integer> indexStack = new Stack<>();
        indexStack.push(0);

        for (int i = 0; i < n; i++) {
            if (indexStack.isEmpty()) {
                indexStack.push(i);
            }

            while (!indexStack.isEmpty() && a[indexStack.peek()] < a[i]) {
                answer[indexStack.pop()] = a[i];
            }
            indexStack.push(i);
        }

        while (!indexStack.isEmpty()) {
            answer[indexStack.pop()] = -1;
        }

        for (int i = 0; i < n; i++) {
            bufferedWriter.write(answer[i] + " ");
        }
        bufferedWriter.write("\n");
        bufferedWriter.flush();
    }
}
