import java.util.Scanner;
import java.util.StringTokenizer;

//public class Main {
//    public static void main(String[] args) {
//
//        Scanner scanner = new Scanner(System.in);
//        StringTokenizer stringTokenizer;
//        String str;
//
//        int t = scanner.nextInt();
//
//        for (int i = 0; i < t; i++) {
//
//            str = scanner.next();
//            stringTokenizer = new StringTokenizer(str, ",");
//
//            int a = Integer.parseInt(stringTokenizer.nextToken());
//            int b = Integer.parseInt(stringTokenizer.nextToken());
//
//            System.out.println(a + b);
//        }
//
//        scanner.close();
//    }
//}

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt();

        for (int i = 1; i <= t; i++) {

            int a = scanner.nextInt();
            int b = scanner.nextInt();

            System.out.println("Case #" + i + ": " + a + " + " + b + " = " + (a + b));
        }

        scanner.close();
    }
}
