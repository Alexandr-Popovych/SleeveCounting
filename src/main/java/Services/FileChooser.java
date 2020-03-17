package Services;

import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;

public class FileChooser {

    public static String fileChoose() {
        JButton open = new JButton();

        JFileChooser fc = new JFileChooser();
        fc.setCurrentDirectory(new java.io.File("D:\\"));
        fc.setDialogTitle("Знайдіть файл специфікації !!!");
        fc.setFileSelectionMode(JFileChooser.FILES_ONLY);

        FileNameExtensionFilter filter = new FileNameExtensionFilter(
                "Excel", "xls");
        fc.setFileFilter(filter);


        if (fc.showOpenDialog(open) == JFileChooser.FILES_AND_DIRECTORIES) {

        }
        String way;
        way = (fc.getSelectedFile().getAbsolutePath());
        return way;
    }
}
//http://java-online.ru/swing-jfilechooser.xhtml