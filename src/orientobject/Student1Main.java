package orientobject;

public class Student1Main {
    public static void main(String[] args) {
        Student1 student1 = new Student1();
        Student1 student2 = new Student1();
        Student1 student3 = new Student1();
        Student1 student4 = new Student1();
        Student1 student5 = new Student1();
        Student1 student6 = new Student1();
        student1.getStuData(100, "menad");
        student2.getStuData(101, "zineb");
        student3.getStuData(102, "aylan");
        student4.getStuData(103, "arab ");
        student5.getStuData(104, "ahmed");
        student6.getStuData(106, "aya  ");
        student1.getStuMarks(10, 10, 10);
        student2.getStuMarks(11, 12, 13);
        student3.getStuMarks(14, 15, 16);
        student4.getStuMarks(10, 17, 10);
        student5.getStuMarks(10, 18, 10);
        student6.getStuMarks(10, 19, 10);
        student1.totalMarks();
        student2.totalMarks();
        student3.totalMarks();
        student4.totalMarks();
        student5.totalMarks();
        student6.totalMarks();

    }


}
