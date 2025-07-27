package Utility;


import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class ExcelReader {

    public static Map<String, String> getDataForTestCase(String filePath, String sheetName, String testCaseName) {
        Map<String, String> dataMap = new HashMap<>();

        try (FileInputStream fis = new FileInputStream(filePath);
             Workbook workbook = new XSSFWorkbook(fis)) {

            Sheet sheet = workbook.getSheet(sheetName);
            if (sheet == null) {
                throw new RuntimeException("Sheet not found: " + sheetName);
            }

            Row headerRow = sheet.getRow(0); // first row is header
            int totalColumns = headerRow.getLastCellNum();
            int totalRows = sheet.getLastRowNum();

            for (int i = 1; i <= totalRows; i++) {
                Row currentRow = sheet.getRow(i);
                if (currentRow == null) continue;

                Cell testCaseCell = currentRow.getCell(0);
                if (testCaseCell == null) continue;

                String tcName = testCaseCell.getStringCellValue().trim();
                if (tcName.equalsIgnoreCase(testCaseName)) {
                    for (int j = 1; j < totalColumns; j++) { // start from 1, as 0 is TC_Name
                        String key = headerRow.getCell(j).getStringCellValue().trim();
                        String value = currentRow.getCell(j).getStringCellValue().trim();
                        dataMap.put(key, value);
                    }
                    break; // found the test case, no need to continue
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        return dataMap;
    }
}

