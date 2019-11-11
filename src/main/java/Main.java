import Services.EPrinter;
import Services.EReader;
import Services.SleeveCounting;

import java.io.IOException;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) throws IOException {

        // MyGui app = new MyGui();
        //app.setVisible(true);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть розташування файлу");

        //String way = scanner.nextLine();
        String way = "C:\\Users\\User\\Google Диск\\19-00_Лосенко\\19-11-779-Провулок Токучаєвський\\19-11-763-ЕП\\02_19-11-763-Wather System\\02_19-11-763-Ws Specification.xls";
        System.out.println("Ви вказали шлях: " + "'" + way + " .");

        System.out.println("Введіть номер закладки в листі MS Excell");
        //int sheet = scanner.nextInt();
        System.out.println("Введіть початковий номер рядка з фітінгами");
        int first = scanner.nextInt();
        System.out.println("Введіть останній номер рядка з фітінгами");
        int last = scanner.nextInt();
        int delta = last - first + 1;
        String[] name = new String[delta];
        double[] quantity = new double[delta];

        EReader.read(way, delta, name, quantity, first);//читаємо з файлу фітінги
        EPrinter.print(name, quantity);//друкуємо прочитане у вигляді списку


        String[] sleeveSize = {"16", "20", "25", "32"};
        double[] sleeveQuantity = new double[4];
        SleeveCounting.count(name, quantity, sleeveSize, sleeveQuantity);
        EPrinter.print(sleeveQuantity);
        double countSumm;
        countSumm = SleeveCounting.getCountSumm(sleeveQuantity);
        EPrinter.printSleeveSizeQuantity(sleeveSize, sleeveQuantity);
        EPrinter.printSumm(countSumm);
    }
}