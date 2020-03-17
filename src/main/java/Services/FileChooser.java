package Services;

import javax.swing.*;

public class FileChooser {

    private final String[][] FILTERS = {{"docx", "Файлы Word (*.docx)"},
            {"pdf" , "Adobe Reader(*.pdf)"}};

    public static String fileChoose() {
        JButton open = new JButton();
        JFileChooser fc = new JFileChooser();
        fc.setCurrentDirectory(new java.io.File("D:\\"));
        fc.setDialogTitle("Знайдіть файл специфікації !!!");
        fc.setFileSelectionMode(JFileChooser.FILES_ONLY);
        if (fc.showOpenDialog(open) == JFileChooser.APPROVE_OPTION) {

        }
        String way;
        way = (fc.getSelectedFile().getAbsolutePath());
        return way;
    }
}
//http://java-online.ru/swing-jfilechooser.xhtml