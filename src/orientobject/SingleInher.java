package orientobject;


class A {
    int a;

    void display() {
        System.out.println(a);
    }
}

class B extends A {
    int b;

    void print() {
        System.out.println(a);
    }
}

class C extends B {

    int c;

    void show() {
        System.out.println(c);
    }
}

public class SingleInher {

    public static void main(String[] args) {

        A aobj = new A();
        aobj.a = 100;
        aobj.display();

        B bobj = new B();
        bobj.b = 90;
        bobj.a = 80;
        bobj.display();
        bobj.print();

        C cobj = new C();
        cobj.a = 50;
        cobj.b = 40;
        cobj.c = 30;
        cobj.display();
        cobj.print();
        cobj.show();
    }


}
