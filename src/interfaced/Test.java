package interfaced;

interface A {
    int a = 10;// by default variable in interface are static and final

    void m1();// this is abstract method and by default is public. abstract means method has just defintion no code

}

public class Test implements A {

    public static void main(String[] args) {
        Test test = new Test();
        test.m1();
        A t = new Test();
        t.m1();

    }

    public void m1() {

        System.out.println(a);
    }

}

