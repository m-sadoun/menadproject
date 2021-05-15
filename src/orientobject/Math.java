package orientobject;

class Math {
    int x;
    int y;


    void sum(int l, int h) {
        x = l;
        y = h;

        System.out.println(l + h);

    }

}

class LaSub extends Math {

    int p;
    int k;


    void sum(int j, int r) // overriding the method  we use the same method of parent : the same definition but the progrmame different iparent doing the addtion but in child doig substraction
    {

        p = j;
        k = r;
        System.out.println(j - r);
        super.sum(j, r);
    }


}

class LaDiv extends LaSub {
    int u;
    int w;

    void sum(int f, int g) {

        u = f;
        w = g;


        System.out.println(f / g);
        super.sum(f, g);


    }


}
