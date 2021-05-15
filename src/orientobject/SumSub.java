package orientobject;

public class SumSub {

    public static void main(String[] args) {

        Math sum = new Math();
        sum.sum(10, 2);

        LaSub sub = new LaSub();

        sub.sum(10, 2);

        LaDiv div = new LaDiv();
        div.sum(10, 2);

        ConstInherit sum1 = new ConstInherit(10, 11);
        sum1.sum();
        LaSub1 sub1 = new LaSub1(10, 11);
        sub1.sum();
        LaDiv1 div1 = new LaDiv1(10, 11);
        div1.sum();


    }
}


