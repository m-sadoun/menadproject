package orientobject;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class ReadTxtFile {

    public static void main(String[] args) throws IOException {
        String x = null;
     FileReader fr = new FileReader("C:\\Users\\sadou\\OneDrive\\Desktop\\note\\note.txt");
        BufferedReader bf = new BufferedReader(fr);
        while ((x = bf.readLine()) != null) {

            System.out.println(x);
        }


    }


}



