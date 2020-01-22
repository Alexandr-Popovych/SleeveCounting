package Services;

public class EPrinter {

    public static void print(String[] name, String[] designation, double[] quantity) {
        int num = 0;
        for (int i = 0; i < name.length; i++) {
            if (designation[i].equals("") == false) {
                System.out.println(num + 1 + ". " + name[i] + designation[i] + ", кількіттю " + quantity[i] + " шт.");
                num++;
            } else {
                dashLineprint();
                System.out.println(name[i] + designation[i] + ", кількіттю " + quantity[i] + " шт.");
            }
        }
        dashLineprint();
    }

    public static void printSleeveSizeQuantity(String[] sleeveSize, double[] sleeveQuantify) {
        for (int i = 0; i < sleeveSize.length; i++) {
            System.out.println("Кількість гільз " + sleeveSize[i] + " складає " + sleeveQuantify[i] + " шт.");
        }
        dashLineprint();
    }

    public static void print(double[] sleeveQuantity) {
        for (int i = 0; i < sleeveQuantity.length; i++)
            System.out.println(sleeveQuantity[i]);
    }

    public static void printSumm(double sum) {
        System.out.println("Загальна кількість гільз складає " + sum + " шт.");
        dashLineprint();
    }

    public static void dashLineprint() {
        System.out.println("-------------------------------------------------------------------------");
    }
}