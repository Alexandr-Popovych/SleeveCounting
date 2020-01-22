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
        way = "C:\\Users\\User\\Google Диск\\01_Проекти 2020\\01_Січень\\20-01-780-Теплодар\\20-01-780-ЕП\\01_19-12-780-Heating System\\01_Convective heat system\\02_19-11-763-Heating system Specification.xls";
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
        SleeveCounting.count(name, quantity, sleeveSize, sleeveQuantity);
        double countSum;
        countSum = SleeveCounting.getCountSumm(sleeveQuantity);

        EPrinter.printSleeveSizeQuantity(sleeveSize, sleeveQuantity);

        EPrinter.printSumm(countSum);
    }
}