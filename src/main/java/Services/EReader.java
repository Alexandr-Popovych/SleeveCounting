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

    public static void read(String way, String[] name, String designation[]) throws IOException {
        FileInputStream fis = new FileInputStream(way);
        Workbook wb = new HSSFWorkbook(fis);
        for (int i = 0; i < name.length; i++) {
            name[i] = wb.getSheetAt(0).getRow(i - 1).getCell(1).getStringCellValue();
            designation[i] = wb.getSheetAt(0).getRow(i - 1).getCell(2).getStringCellValue();
        }
        fis.close();
    }
}