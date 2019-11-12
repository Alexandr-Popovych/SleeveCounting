package Services;

import javax.swing.*;

public class FileChooser {

    public static String fileChoose() {
        JButton open = new JButton();
        JFileChooser fc = new JFileChooser();
        fc.setCurrentDirectory(new java.io.File("C:\\Users\\User\\Dropbox (Work)"));
        fc.setDialogTitle("Hello world");
        fc.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
        if (fc.showOpenDialog(open) == JFileChooser.APPROVE_OPTION) {

        }
        String way;
        way = (fc.getSelectedFile().getAbsolutePath());
        return way;
    }
}