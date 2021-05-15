package orientobject;

public class StaticExampleMain {
    public static void main(String[] args) {

        StaticExample acces = new StaticExample();
        acces.m2();

        System.out.println(StaticExample.a);
        System.out.println(acces.b);

        StaticExample.m1();
    }

}