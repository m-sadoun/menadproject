package interfaced;


interface ABC {
    int x = 100;
    int y = 200;

    void m1(int x, int y);
}

interface AZD {
    int a = 150;
    int b = 250;

    void m2(int a, int b);

}

public class MultInhTest implements ABC, AZD {
    public static void main(String[] args) {

        MultInhTest ob = new MultInhTest();

        ob.m1(a,y);
        ob.m2(a, b);
    }

    public void m1(int x, int y) {

        System.out.println(x + y);
    }

    public void m2(int a, int b) {

        System.out.println(a + b);
    }


}


