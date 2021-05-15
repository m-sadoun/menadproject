package orientobject;

public class MethodsTypeExecution {
    public static void main(String[] args) {
        MethodsType calc = new MethodsType(10, 11);

        calc.sum(); // just calling by the help of object the method and print the result
        /// like teacher : he send starbucks i drunk coffee and i came back with message
        // teacher i did good i drunk coffee


        int sub = calc.substraction(); // here we called the method and it brought with it some data
        System.out.println(sub);
        // value that  i need to store somewhere and i will use it when i want to.for this reason
        // i created container i gave the name for it  the name  sub ant the type integer because the method
        // return integer(like teacher said go bring me cup of coffee


        calc.multiplication(125, 146); // here teacher gave some money and he said go drink coffee you deserve it

        int div = calc.division(47, 12); // here he gave me money he said go bring me some coffee

        System.out.println(div);
    }
}
