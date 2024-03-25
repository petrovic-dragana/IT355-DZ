package com.domaci;

import org.apache.poi.ss.usermodel.*;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExcelReader {
    public static void readStudentsData(String filePath) {
        try (FileInputStream fis = new FileInputStream(filePath);
             Workbook workbook = WorkbookFactory.create(fis)) {

            // Pretpostavljamo da podaci o studentima se nalaze u prvoj sheet-u
            Sheet sheet = workbook.getSheetAt(0);

            for (Row row : sheet) {
                // Pretpostavljamo da podaci o studentima počinju od drugog reda
                if (row.getRowNum() > 0) {
                    String name = row.getCell(0).getStringCellValue();
                    String surname = row.getCell(1).getStringCellValue();
                    String indexNumber = row.getCell(2).getStringCellValue();

                    System.out.println("Name: " + name + ", Surname: " + surname + ", Index Number: " + indexNumber);
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

