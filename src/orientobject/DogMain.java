package orientobject;

public class DogMain {

    public static void main(String[] args) {
        Dog dog1 = new Dog();
        Dog dog2 = new Dog();


        ////-----------------ASSIGNE THE VALUE BY USING VARIABLE REFERENCE-----------------------
		
		/*dog1.name="bigger";
		dog1.age=7;
		dog1.race= "germane";
		dog1.display(); 
		*/


        //------ASSIGNE THE VALUE BY USING METHOD CREATED IN THE CLASS ------------

        // -------assigne globle parametres with method assignevalue( String, String, intg)

        dog1.assignevalue("bigger", "germen sheeper", 7);
        dog2.assignevalue("smaller", "gremenr", 3);


        //// -------assigne local parametres with method assignevalue( int, double)


        dog1.assignevalue(12, 15000);
        dog2.assignevalue(15, 25000);

        //// -------assigne local parametres with method assignevalue( int, double)


        /// -------------OBJECT CALLING METHODE---------------------------------
        dog1.display();
        dog2.display();


    }

}
