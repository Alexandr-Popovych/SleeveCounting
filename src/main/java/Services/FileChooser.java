package Services;

import javax.swing.*;

public class FileChooser {
    public static void main(String[] args) {
        JButton open = new JButton();
        JFileChooser fc = new JFileChooser();
        fc.setCurrentDirectory(new java.io.File("C:\\Users\\User\\Dropbox (Work)"));
        fc.setDialogTitle("Hello world");
        fc.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        if (fc.showOpenDialog(open) == JFileChooser.APPROVE_OPTION) {

        }
        System.out.println(fc.getSelectedFile().getAbsolutePath());
    }
}
