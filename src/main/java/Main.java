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
        way = FileChooser.fileChoose();
        System.out.println("Ви вказали шлях: " + "'" + way + " .");
        System.out.println("Введіть номер закладки в листі MS Excell");
        System.out.println("Введіть початковий номер рядка з фітінгами");
        int first = scanner.nextInt();
        System.out.println("Введіть останній номер рядка з фітінгами");
        int last = scanner.nextInt();
        int delta = last - first + 1;
        String[] name = new String[delta];
        double[] quantity = new double[delta];

        EReader.read(way, delta, name, quantity, first);
        EPrinter.print(name, quantity);


        String[] sleeveSize = {"16", "20", "25", "32"};
        double[] sleeveQuantity = new double[4];
        SleeveCounting.count(name, quantity, sleeveSize, sleeveQuantity);
        double countSumm;
        countSumm = SleeveCounting.getCountSumm(sleeveQuantity);
        EPrinter.printSleeveSizeQuantity(sleeveSize, sleeveQuantity);
        EPrinter.printSumm(countSumm);
    }
}