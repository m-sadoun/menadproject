package exercisforloopwile;

import java.util.Scanner;

public class IntToBin {
    public static void main(String[] args) {

        int[] bin = new int[10];
        int a;
        int l = 0;
        Scanner myInput = new Scanner(System.in);
        System.out.print("Enter number you want to convert : ");
        int  i = myInput.nextInt();
        while (i >= 1) {
            a = i % 2;
            bin[l] = a;
            i = i / 2;
            l++;
        }

        for (int j = l - 1; j >= 0; j--) {
            System.out.print(bin[j]);

        }


    }
}