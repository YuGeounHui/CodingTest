package IronRod;

import java.util.Scanner;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Stack<Integer> ironStack = new Stack<>();

        String iron = scanner.nextLine().trim();
        int ironLength = iron.length();
        int answer = 0;

        for (int i = 0; i < ironLength; i++) {

            char index = iron.charAt(i);
            if (index == '(') {

                ironStack.push(i);

            } else {

                if (ironStack.peek() + 1 == i) {

                    ironStack.pop();
                    answer += ironStack.size();

                } else {
                    ironStack.pop();
                    answer += 1;
                }
            }
        }
        System.out.println(answer);
    }
}
