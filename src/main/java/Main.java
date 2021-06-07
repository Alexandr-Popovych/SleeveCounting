import Services.*;

import java.io.IOException;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);//Створюємо екземляр класу "Scanner" під іменем "scan" з аргументом "System.in" (укр."Системний ввід")
        String way; //Створюємо
        way = FileChooser.fileChoose();
        System.out.println("Ви вказали шлях: " + "'" + way + "'" + " .");
        EPrinter.dashLinePrint();
        System.out.println("Введіть початковий номер рядка з фітінгами");
        int first = scanner.nextInt();
        EPrinter.dashLinePrint();
        System.out.println("Введіть останній номер рядка з фітінгами");
        int last = scanner.nextInt();
        EPrinter.dashLinePrint();

        int delta = last - first + 1;


        String[] name = new String[delta];
        String[] designation = new String[delta];
        double[] quantity = new double[delta];


        EReader.read(way, name, designation, quantity, first);
        EPrinter.print(name, designation, quantity);


        String[] sleeveSize = {"10", "16", "20", "25", "32"};
        double[] sleeveQuantity = new double[5];
        SleeveCounting.count(designation, quantity, sleeveSize, sleeveQuantity);
        double countSum;
        countSum = SleeveCounting.getCountSum(sleeveQuantity);

        EPrinter.printSleeveSizeQuantity(sleeveSize, sleeveQuantity);

        EPrinter.printSum(countSum);
    }
}