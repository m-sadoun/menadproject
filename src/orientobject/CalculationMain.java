package orientobject;

public class CalculationMain {
    public static void main(String[] args) {

        Calculation cal = new Calculation();
        Calculation.sum(10, 20);
        System.out.println(Calculation.sum(10, 20));
        int w = cal.sum(5, 7, 9);

        System.out.println(w);
        cal.sum(21.5, 22.4);
        System.out.println(cal.sum(21.5, 22.4));
        cal.sum(12.5, 53.8, 15.6);
        System.out.println(cal.sum(12.5, 53.8, 15.6));


    }
}
