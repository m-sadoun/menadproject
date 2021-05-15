package orientobject;

public class MethodsType {

    int x;
    int b;


    MethodsType(int h, int j) {
        x = h;
        b = j;
    }


    void sum()  // Method not taking parameters and not returning value
    {

        System.out.println(x + b);
    }

    int substraction() //not taking parameters and returning some value for this reason
    // we specified the type of data returning behind the method
    {
        return (x - b);
    }

    void multiplication(int z, int l) // this method taking parameters and not returning any thing

    {

        System.out.println(z * l);

    }

    int division(int s, int m)// is taking parameters and returning some data we put
    // behind the method the type of data is returning
    {
        return (s / m);

    }


}




