package exercise;

import java.util.Scanner;

public class MultiplicationForN {
    public static void main(String[] args) {
        Scanner scan1 = new Scanner(System.in);
        System.out.println("Enter the Number you want multiplication ");
        int x = scan1.nextInt();
        System.out.println("The n numbers you to multiplay");
        int N = scan1.nextInt();
        System.out.println("The result is ");
        for (int i = 0; i <= N; i++) {
            int y = x;
            int b;
            b = i * y;

            System.out.println(i + "*" + y + "=" + b);
        }

    }
}

