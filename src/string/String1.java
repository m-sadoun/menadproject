package string;

public class String1 {
    public static void main(String[] args) {

        String s = "Welcome";
        String s1 = "to java is the besrt thing that i have done in my life i am trying to do my best";
        String s2 = "       welcome to java "
                + "       ";
        //  length())length of the string (how many characters in the string
        System.out.println(s.length());
        System.out.println(s1.length());

        // concat()concatinate two string
        System.out.println(s.concat(s1));

        // trim() treming the the space form the start and the end
        System.out.println("String before trimingis: " + s2);
        System.out.println("String after trimingis: " + s2.trim());

        //charAt(5) returning a character based on index number ; index start from zero
        System.out.println(s.charAt(5));

        // contains() search the sequence of characters in the string and it returns true or false senstive to upper or lower
        System.out.println(s.contains("wel")); //false
        System.out.println(s.contains("Wel"));//true
        System.out.println(s.contains("ome"));//true

        // equals() compare the Two giving strings returns true or false senstive for upper and lower cases
        System.out.println(s.equals("welcome")); // false
        System.out.println(s.equals("Welcome"));// true

        //equalsIgnorecase() the same like equals() but this method dosen't chek the upper and lower case if charctere much will return true
        System.out.println(s.equalsIgnoreCase("welcome")); // true
        System.out.println(s.equalsIgnoreCase("Welcome"));// true

        //replace() Returns a replaced string , Characters or sequence of characters
        System.out.println(s.replace("om", "dt"));
        System.out.println(s2.replace("java", "selinuim"));

        // Substring(): Returns substring of string based on starting index and ending index
        System.out.println(s.substring(1, 4));


    }


}
