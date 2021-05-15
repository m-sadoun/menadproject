package ifelesecondition;

import java.util.Scanner;

public class EvenorOddnumber {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("please enter your number ");
        int number = scan.nextInt();
        if (number % 2 == 0) {
            System.out.println("the number is even number ");
        } else {
            System.out.println("the number is odd number ");
        }
    }
}


