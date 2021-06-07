package Services;

public class EPrinter {

    public static void print(String[] name, String[] designation, double[] quantity) {

        int num = 0;
        for (int i = 0; i < name.length; i++)
            if (!designation[i].equals("")) {
                System.out.println(num + 1 + ". " + name[i] + designation[i] + ", кількіттю " + quantity[i] + " шт.");
                num++;
            } else {
                dashLinePrint();
                System.out.println((name[i] + designation[i] + ", кількіттю " + quantity[i] + " шт."));
                dashLinePrint();
            }
        dashLinePrint();
    }

    public static void printSleeveSizeQuantity(String[] sleeveSize, double[] sleeveQuantify) {
        for (int i = 0; i < sleeveSize.length; i++) {
            System.out.println("Кількість гільз " + sleeveSize[i] + " складає " + sleeveQuantify[i] + " шт.");
        }
        dashLinePrint();
    }

    public static void print(double[] sleeveQuantity) {
        for (double v : sleeveQuantity) System.out.println(v);
    }

    public static void printSum(double sum) {
        System.out.println("Загальна кількість гільз складає " + sum + " шт.");
        dashLinePrint();
    }

    public static void dashLinePrint() {
        System.out.println("-------------------------------------------------------------------------");
    }
}