package ifelesecondition;

import java.util.Scanner;

public class LargeNumber {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("please enter your first number ");
        int a = scan.nextInt();
        System.out.println("please enter your second number ");
        int b = scan.nextInt();
        if (a > b) {
            System.out.println(" first numbers lager than  second number");
        } else
            System.out.println(" second number larger than second number ");


    }

}
