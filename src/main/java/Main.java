import Gui.MyGui;
import Services.EPrinter;
import Services.EReader;
import Services.FileChooser;
import Services.SleeveCounting;

import java.io.IOException;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть розташування файлу");

        String way;
        //  way = FileChooser.fileChoose();
        way = "C:\\Dropbox (Work)\\01_Проекти 2020\\00_Temps\\19-10-757-Паскарь\\19-10-757-ЕП\\03_19-10-757-СО\\02_Cooling system specification-757.xls";
        // MyGui app = new MyGui();
        //app.setVisible(true);
        System.out.println("Ви вказали шлях: " + "'" + way + " .");
        EPrinter.dashLineprint();
        System.out.println("Введіть номер закладки в листі MS Excell");
        EPrinter.dashLineprint();
        System.out.println("Введіть початковий номер рядка з фітінгами");
        int first = scanner.nextInt();
        EPrinter.dashLineprint();
        System.out.println("Введіть останній номер рядка з фітінгами");
        int last = scanner.nextInt();
        EPrinter.dashLineprint();
        int delta = last - first + 1;

        String[] name = new String[delta];
        String[] designation = new String[delta];
        double[] quantity = new double[delta];

        EReader.read(way, name, designation, quantity, first);
        EPrinter.print(name, designation, quantity);


        String[] sleeveSize = {"16", "20", "25", "32"};
        double[] sleeveQuantity = new double[4];
        SleeveCounting.count(designation, quantity, sleeveSize, sleeveQuantity);
        double countSum;
        countSum = SleeveCounting.getCountSumm(sleeveQuantity);

        EPrinter.printSleeveSizeQuantity(sleeveSize, sleeveQuantity);

        EPrinter.printSumm(countSum);
    }
}