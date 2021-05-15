package whileloop;

public class While {
    public static void main(String[] args) {
        int i = 10;
        while (i >= 0) { // for while condition we need the initilaisation ; condition , and incrementation and decremntation
            if (i % 2 == 0)
                System.out.println(i);
            i--; // we use the incrementation and decrementation to stop the the while loop when we meet the need
        }
    }

}
