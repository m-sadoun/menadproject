package javaexercise;

public class SwapVariable {
    public static void main(String[] args) {
        int a = 20;
        int b = 10;
        int c;

        c = a; //puting the the value of into c variable means a is empty now
        a = b;// putting the value of in a variable  b is empty now
        b = c;

        System.out.println("the new value of a  " + a);
        System.out.println("the value of b is " + b);
    }


}
