package exercise;

import java.util.Scanner;

public class Numberofdigit {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the nimber you want");
        long x = scan.nextInt();
        long a = 0;
        for (long i = x; i > 0; i /= 10) {

            a = a + 1;


        }
        System.out.println(a);


    }


}
