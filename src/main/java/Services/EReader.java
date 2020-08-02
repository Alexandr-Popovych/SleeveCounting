package Services;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Workbook;

import java.io.FileInputStream;
import java.io.IOException;


public class EReader {
    public static void read(String way, String[] name, String designation[], double[] quantity, int first) throws IOException {
        FileInputStream fis = new FileInputStream(way);
        Workbook wb = new HSSFWorkbook(fis);
        for (int i = 0; i < name.length; i++) {
            name[i] = wb.getSheetAt(0).getRow(i + first - 1).getCell(1).getStringCellValue();
            designation[i] = wb.getSheetAt(0).getRow(i + first - 1).getCell(2).getStringCellValue();
            quantity[i] = wb.getSheetAt(0).getRow(i + first - 1).getCell(6).getNumericCellValue();
        }
        fis.close();
    }

//Сорування
    public static void read(String way) throws IOException {
        FileInputStream fis = new FileInputStream(way);
        Workbook wb = new HSSFWorkbook(fis);
        String[] nameFirst = new String[500];
        for (int i = 4; i < nameFirst.length; i++) {
            nameFirst[i] = wb.getSheetAt(0).getRow(i).getCell(1).getStringCellValue();
            if (nameFirst[i].equals("Фітінги")) {
                System.out.println("Begin to " + (i + 2));
            } else if (nameFirst[i].equals(" ")) {
                System.out.println("End to " + (i - 2));
            }
        }
    }
}