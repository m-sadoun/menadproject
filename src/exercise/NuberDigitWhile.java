package exercise;

import java.util.Scanner;

public class NuberDigitWhile {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("the number 0f digit for ");
        int x = scan.nextInt();
        scan.close();
        int i = 0;
        do {
            x /= 10;
            i++;

        }

        while (x > 0);
        System.out.println("is " + i);

    }

}
