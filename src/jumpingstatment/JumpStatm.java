package jumpingstatment;

public class JumpStatm {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            if (i == 6 || i == 9 || i == 2) {
                continue;
            }
            System.out.println(i);
        }
    }

}
