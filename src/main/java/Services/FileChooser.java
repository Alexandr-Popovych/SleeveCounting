package Services;

import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class FileChooser {

    public static String fileChoose() throws IOException {

        FileReader fr = new FileReader("temp.txt");
        char[] tmp = new char[200];
        fr.read(tmp);
        String temp = new String();
        temp = new String(tmp);
        fr.close();
        temp = temp.trim();
        System.out.println(temp);
        JButton open = new JButton();
        JFileChooser fc = new JFileChooser();
        fc.setCurrentDirectory(new java.io.File(temp));
        fc.setDialogTitle("Знайдіть файл специфікації !!!");
        fc.setFileSelectionMode(JFileChooser.FILES_ONLY);

        FileNameExtensionFilter filter = new FileNameExtensionFilter(
                "Excel", "xls");
        fc.setFileFilter(filter);


        if (fc.showOpenDialog(open) == JFileChooser.FILES_AND_DIRECTORIES) {

        }
        String way;
        way = (fc.getSelectedFile().getAbsolutePath());
        FileWriter fw = new FileWriter("temp.txt");
        fw.write(way);
        fw.close();
        return way;
    }
}
//http://java-online.ru/swing-jfilechooser.xhtml