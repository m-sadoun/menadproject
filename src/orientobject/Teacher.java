package orientobject;

public class Teacher {

    String designation;
    String collegeName;


    Teacher(String tdesignation, String tcollegeName, String module, int credit) {
        designation = tdesignation;
        collegeName = tcollegeName;
        System.out.println(module);
        System.out.println(credit);
    }


    Teacher(String designation, String collegeName, String module) {
        this.designation = designation;
        this.collegeName = collegeName;
        System.out.println(module);


    }

    void display() {
        System.out.println("The designation is: " + designation + "   and the college name is:" + collegeName);

    }

    void assignvalue(int idt, int ids) {
        System.out.println(idt);
        System.out.println(ids);
    }


}
   
 
	  
  


	 




