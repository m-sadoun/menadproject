package orientobject;

public class Dog {
    String name;
    String race;
    int age;

    public void display() {
        System.out.println(name + " " + race + " " + age);
    }


    void assignevalue(int id, double price) {

        System.out.println(id);
        System.out.println(price);
    }

    public void assignevalue(String dogname, String dorace, int doage) {
        name = dogname;
        race = dorace;
        age = doage;


    }


}
