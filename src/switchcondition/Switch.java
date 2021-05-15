package switchcondition;

public class Switch {
    public static void main(String[] args) {
        int day = 5;
        switch (1) {
            case 1:
                System.out.println("sunday");
                break; //   5==1 false will not execute this ligne
            case 2:
                System.out.println("Monday");
                break;   //5==2 false will not execute this ligne
            case 3:
                System.out.println("tuesday");
                break; //5==3 false will not execute this ligne
            case 4:
                System.out.println("wednsady");
                break; //5==4 false will not execute this ligne
            case 5:
                System.out.println("thursday");
                break;  //5==5 true will  execute this ligne .will print thursaday
            case 6:
                System.out.println("friday");
                break;   //5==6 false will notexecute this ligne
            case 7:
                System.out.println("Sturday");
                break;   //5==7 false will not execute this ligne
            default:
                System.out.println("Invalid day");
        }
    }
}


