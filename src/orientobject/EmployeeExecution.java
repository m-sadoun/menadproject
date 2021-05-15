package orientobject;

public class EmployeeExecution {
    public static void main(String[] args) { // creating object by using refrence of variable
        Employee empl1 = new Employee();
        empl1.id = 1;
        empl1.name = "menad";
        empl1.posi = "QA teter";
        empl1.sal = 2000;
        empl1.depname = "testing";
        empl1.display();

        Employee empl2 = new Employee();
        empl2.id = 2;
        empl2.name = "Salim";
        empl2.posi = "QA teter lead";
        empl2.sal = 3000;
        empl2.depname = "testing";
        empl2.display();

        Employee empl3 = new Employee();
        empl3.id = 3;
        empl3.name = "mahbub";
        empl3.posi = "devloper";
        empl3.sal = 2000;
        empl3.depname = "data";
        empl3.display();

        Employee tarik = new Employee();
        tarik.id = 3;
        tarik.name = "tarik";
        tarik.posi = "devloper";
        tarik.sal = 7000;
        tarik.depname = "programiing";
        tarik.display();


    }


}
