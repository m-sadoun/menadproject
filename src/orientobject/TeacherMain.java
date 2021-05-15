package orientobject;

public class TeacherMain {

    public static void main(String[] args) {
		
	/*Teacher teach =new Teacher();
	   teach.collegeName ="dnver";
	   teach.designation = "teacher";
	   teach.display();
	    Teacher teach1 = new Teacher();
	    teach1.collegeName ="Aurora";
		   teach1.designation = "teacher1";
		   teach1.display();
		
		
	   Teacher teach= new Teacher();
	   teach.assignvalue(" bejaia", "techaer", "math");
	   teach.display();
	    teach.assignvalue(100, 10);*/

        Teacher teach = new Teacher("Teacher", "cud", "math");
        teach.display();
        Teacher teach1 = new Teacher("Teacher", "cud", "math", 45);
        teach1.display();


    }


}
