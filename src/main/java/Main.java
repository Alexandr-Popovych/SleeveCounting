import Services.*;
import java.io.IOException;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);
        String way;
        way = FileChooser.fileChoose();
        System.out.println("Ви вказали шлях: " + "'" + way + " .");
        EPrinter.dashLineprint();
        System.out.println("Введіть номер закладки в листі MS Excel");
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