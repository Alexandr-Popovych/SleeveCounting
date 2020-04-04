package Services;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class Temp {

    public static String tempRead() throws IOException {
        FileReader fr = new FileReader("temp.txt");
      //  FileWriter fw = new FileWriter("temp.txt");
        char[] tmp = new char[200];
        fr.read(tmp);
        String temp = new String();
        temp = new String(tmp);
        fr.close();
        temp = temp.trim();
        System.out.println(temp);
        return temp;
    }
}
