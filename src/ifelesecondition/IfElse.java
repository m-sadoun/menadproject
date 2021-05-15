package ifelesecondition;

import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {

        Scanner put = new Scanner(System.in); //  system in is parametre of scanner constractor allowed ass to put entrees

        System.out.println("give the number ");

        int age = put.nextInt(); // object we crated is intger type.


        if (age >= 18) // satrt with { and ends With}
        {
            System.out.println("Eligble for vote");
        } else { // start with { and ends with }
            System.out.println("Not eligble for vote");
        }


    }
}