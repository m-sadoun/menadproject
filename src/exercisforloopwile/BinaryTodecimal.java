package exercisforloopwile;

import java.util.Scanner;

public class BinaryTodecimal {
    public static void main(String[] args) {

        Scanner array = new Scanner(System.in);

        double[] a = {1, 1, 1, 0, 0};
        double b = 0;
        for (int i = 0; i <= a.length - 1; i++) {

            b = b + (a[i] * (Math.pow(2, a.length - 1 - i)));

        }


        System.out.println(b);

    }


}
