package Services;

public class EPrinter {

    public static void print(String[] name, double[] quantity) {
        for (int i = 0; i < name.length; i++) {
            System.out.println(i+1 + ". " + name[i] + ", кількіттю " + quantity[i] + " шт.");
        }
    }

    public static void printSleeveSizeQuantity(String[] sleeveSize, double[] sleeveQuantify) {
        for (int i = 0; i < sleeveSize.length; i++) {
            System.out.println("Кількість гільз " + sleeveSize[i] + " складає " + sleeveQuantify[i] + " шт.");
        }
    }

    public static void print(double[] sleeveQuantity) {
        for (int i = 0; i < sleeveQuantity.length; i++)
            System.out.println(sleeveQuantity[i]);
    }


    public static void printSumm(double sum) {
        System.out.println("Загальна кількість гільз складає " + sum + " шт.");
    }

}