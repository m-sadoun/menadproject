package exercise;

import java.util.Scanner;

public class Multiplication5 {
    public static void main(String[] args) {

        System.out.println("The multiplication of 5");

        System.out.print("Enter the  number: ");
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int a;
        int i;
        for (i = 0; i <= num; i++) {

            //int a;
            a = i * 5;
            //System.out.println("The multiplication of 5");
            System.out.println(i + "*5=" + a);
        }
        //System.out.println(  i+"*5=" +a);
    }

}
