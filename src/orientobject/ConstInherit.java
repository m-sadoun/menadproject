package orientobject;

public class ConstInherit {
    int x;
    int y;

    ConstInherit(int x, int y) {
        this.x = x;
        this.y = y;

    }

    void sum() {

        System.out.println(x + y);
    }
}

class LaSub1 extends ConstInherit {
    int p;
    int k;

    LaSub1(int p, int k) {
        super(p, k);
        this.p = p;
        this.k = k;
    }

    void sum() {
        super.sum();
        System.out.println(p - k);

    }
}

class LaDiv1 extends LaSub1 {
    int u;
    int w;

    LaDiv1(int u, int w) {
        super(u, w);
        this.u = u;
        this.w = u;
    }


    void sum() {
        super.sum();
        System.out.println(u / w);

    }


}

	
	
	


