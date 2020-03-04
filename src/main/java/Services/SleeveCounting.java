package Services;

public class SleeveCounting {

    public static void count(String[] designation, double[] quantity, String[] sleeveSize, double[] sleeveQuantity) {

        for (int i = 0; i < designation.length; i++) {
            String delimeter = "-";
            String[] subStr;
            subStr = designation[i].split(delimeter);
            for (int j = 0; j < subStr.length; j++) {
                if (sleeveSize[0].equals(subStr[j]) | (" " + sleeveSize[0] + " ").equals(subStr[j])) {
                    sleeveQuantity[0] = sleeveQuantity[0] + quantity[i];
                } else if (sleeveSize[1].equals(subStr[j]) | (" " + sleeveSize[1] + " ").equals(subStr[j]) | (" " + sleeveSize[1] + "").equals(subStr[j]) | ("" + sleeveSize[1] + " ").equals(subStr[j])) {
                    sleeveQuantity[1] = sleeveQuantity[1] + quantity[i];
                } else if (sleeveSize[2].equals(subStr[j]) | (" " + sleeveSize[2] + " ").equals(subStr[j]) | (" " + sleeveSize[2] + "").equals(subStr[j]) | ("" + sleeveSize[2] + " ").equals(subStr[j])) {
                    sleeveQuantity[2] = sleeveQuantity[2] + quantity[i];
                } else if (sleeveSize[3].equals(subStr[j]) | (" " + sleeveSize[3] + " ").equals(subStr[j]) | (" " + sleeveSize[3] + "").equals(subStr[j]) | ("" + sleeveSize[3] + " ").equals(subStr[j])) {
                    sleeveQuantity[3] = sleeveQuantity[3] + quantity[i];
                }
            }
        }
    }

    public static double getCountSumm(double[] sleeveQuantity) {
        double summSleeveQuantity = 0.0;
        for (int i = 0; i < sleeveQuantity.length; i++) {
            summSleeveQuantity = summSleeveQuantity + sleeveQuantity[i];
        }
        return summSleeveQuantity;
    }
}