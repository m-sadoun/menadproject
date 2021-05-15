package orientobject;

public class Student {
    int id;
    String name;
    String field;

    Student(int sid, String sname, String sfield, String prev) {
        id = sid;
        name = sname;
        field = sfield;
        System.out.println(prev);


    }

    Student() {
        id = 102;
        name = "salim";
        field = "it";

        System.out.println(id + "   " + name + " " + field);
    }

    public void display() {
        System.out.println(id);
        System.out.println(name);
        System.out.println(field);


    }
}
