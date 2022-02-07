package ReverseVoca2;

import java.io.*;
import java.util.Stack;

public class Main {

    /***
     * Stack에 있는 값을 모두 출력해준다.
     * @param bufferedWriter
     * @param stack
     * @throws IOException
     */
    static void allStackValuePrint(BufferedWriter bufferedWriter, Stack<Character> stack) throws IOException {
        while (!stack.isEmpty()) {
            bufferedWriter.write(stack.pop());
        }
    }

    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        String str = bufferedReader.readLine();
        boolean tag = false;
        Stack<Character> stack = new Stack<>();

        for (char ch: str.toCharArray()) { // 한글자 씩 받아오면서
            if (ch == '<') {
                allStackValuePrint(bufferedWriter, stack);
                tag = true;
                bufferedWriter.write(ch);
            } else if (ch == '>') {
                tag = false;
                bufferedWriter.write(ch);
            } else if (tag) {
                bufferedWriter.write(ch);
            } else {
                if (ch == ' ') {
                    allStackValuePrint(bufferedWriter, stack);
                    bufferedWriter.write(ch);
                } else {
                    stack.push(ch);
                }
            }
        }

        allStackValuePrint(bufferedWriter, stack);
        bufferedWriter.write("\n");
        bufferedWriter.flush();
    }
}
