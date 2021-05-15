package orientobject;

public class HierchInhert {

    int x;
    int y;

    HierchInhert(int x, int y) {
        this.x = x;
        this.y = y;
    }

    void sum() {
        System.out.println(x + y);

    }


}


class Child1 extends HierchInhert {
    int l, m;

    Child1(int l, int m) {
        super(l, m);
        this.l = l;
        this.m = m;
    }

    void sum() {
        super.sum();
        System.out.println(l * m);

    }

}

class Child2 extends HierchInhert {
    double h, r;

    Child2(int h, int r) {
        super(h, r);
        this.r = r;
        this.r = r;
    }

    void sum() {
        super.sum();
        System.out.println(h / r);


    }


}