package Services;
//Pre

public class SleeveCounting {

    public static void count(String[] designation, double[] quantity, String[] sleeveSize, double[] sleeveQuantity) {

        for (int i = 0; i < designation.length; i++) {
            String delimiter = "-";
            String[] subStr;
            subStr = designation[i].split(delimiter);
            for (String s : subStr) {
                if (sleeveSize[0].equals(s) | (" " + sleeveSize[0] + " ").equals(s) | (" " + sleeveSize[0] + "").equals(s) | ("" + sleeveSize[0] + " ").equals(s)) {
                    sleeveQuantity[0] = sleeveQuantity[0] + quantity[i];
                } else if (sleeveSize[1].equals(s) | (" " + sleeveSize[1] + " ").equals(s) | (" " + sleeveSize[1] + "").equals(s) | ("" + sleeveSize[1] + " ").equals(s)) {
                    sleeveQuantity[1] = sleeveQuantity[1] + quantity[i];
                } else if (sleeveSize[2].equals(s) | (" " + sleeveSize[2] + " ").equals(s) | (" " + sleeveSize[2] + "").equals(s) | ("" + sleeveSize[2] + " ").equals(s)) {
                    sleeveQuantity[2] = sleeveQuantity[2] + quantity[i];
                } else if (sleeveSize[3].equals(s) | (" " + sleeveSize[3] + " ").equals(s) | (" " + sleeveSize[3] + "").equals(s) | ("" + sleeveSize[3] + " ").equals(s)) {
                    sleeveQuantity[3] = sleeveQuantity[3] + quantity[i];
                } else if (sleeveSize[4].equals(s) | (" " + sleeveSize[4] + " ").equals(s) | (" " + sleeveSize[4] + "").equals(s) | ("" + sleeveSize[4] + " ").equals(s)) {
                    sleeveQuantity[4] = sleeveQuantity[4] + quantity[i];

                }
            }
        }
    }

    public static double getCountSum(double[] sleeveQuantity) {
        double sumSleeveQuantity;
        sumSleeveQuantity = 0.0;
        for (double v : sleeveQuantity) {
            sumSleeveQuantity += v;
        }
        return sumSleeveQuantity;
    }
}