package com.domaci;
import org.apache.poi.ss.usermodel.*;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class StudentDataReader {
    public void readStudentsData(String filePath) {
        try {
            FileInputStream file = new FileInputStream(new File(filePath));
            Workbook workbook = WorkbookFactory.create(file);
            Sheet sheet = workbook.getSheetAt(0);

            for (Row row : sheet) {
                Cell firstNameCell = row.getCell(0);
                Cell lastNameCell = row.getCell(1);
                Cell indexCell = row.getCell(2);

                String firstName = firstNameCell.getStringCellValue();
                String lastName = lastNameCell.getStringCellValue();
                String index = indexCell.getStringCellValue();

                System.out.println("Student: " + firstName + " " + lastName + ", Index: " + index);
            }

            workbook.close();
            file.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
