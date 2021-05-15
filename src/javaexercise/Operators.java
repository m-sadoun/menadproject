package javaexercise;

public class Operators {
    //variable is container of data
    public static void main(String[] args) {
        int a = 10; // the equal here is to attribute the value for variable
        int b = 20;
        System.out.println("------------------------ Arithemitique operators------------------------------------------");
        // Arithemitique Operators
        System.out.println("sum of " + (a + b));
        System.out.println("diffof a and b " + (a - b));
        System.out.println("mul pf a and b " + (a * b));
        System.out.println("Divof a and b " + (a / b)); // the rest of division

        System.out.println("mod div od a and b " + (a % b)); //
        // Relational operators Comparison
        //relational return always boolean result

        System.out.println("------------------------ Relationaloperators------------------------------------------");
        System.out.println(a > b);//false
        System.out.println(a >= b);//false
        System.out.println(a < b);//true
        System.out.println(a <= b);//true
        System.out.println(a != b);//true
        System.out.println(a == b);//False // the equal of mathematique

        System.out.println("------------------------ Logical operators------------------------------------------");

        //Logical operators && || !
        //logical works always betwen two boolean


        boolean x = true;
        boolean y = false;
        System.out.println(y && x); //y and y
        System.out.println(x || y);// x or y
        System.out.println(!y); // not y  not false
        System.out.println(!x);

        System.out.println("------------------------ Increment/Decrement------------------------------------------");
        //increment/decrement operators ++ ---  i conactination
        a = 10;
        a++; //or a=a+1; increment operator a++ this one means a=a+1 this result 11
        //a/=2; //SHortcut of a=a/2;

        System.out.println(a);
        //decrement operator
        b = 20;
        b--; //or b=b-1;
        System.out.println(b);
    }

}
