package orientobject;

public class Student1 {

    int sid;
    String sname;
    int sub1, sub2, sub3;

    void getStuData(int stid, String stname) {
        sid = stid;
        sname = stname;
    }

    void getStuMarks(int stub1, int stub2, int stub3) {
        sub1 = stub1;
        sub2 = stub2;
        sub3 = stub2;

    }

    void totalMarks() {
        System.out.println(sid + " " + sname + "  " + (sub1 + sub2 + sub3));

    }

}
