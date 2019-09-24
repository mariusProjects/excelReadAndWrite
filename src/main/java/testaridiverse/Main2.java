package testaridiverse;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Main2 {
    public static void main(String[] args) throws IOException {
        File excelFileInput = new File("D:\\fisier\\Din\\Din\\din\\Diverse\\PrelucrareExcel\\src\\main\\resources\\InputFile.xlsx");
        File excelFileOutput = new File("D:\\fisier\\Din\\Din\\din\\Diverse\\PrelucrareExcel\\src\\main\\resources\\OutputFile.xlsx");
        FileInputStream inputFile = new FileInputStream(excelFileInput);
        FileOutputStream outputFile = new FileOutputStream(excelFileOutput);

        // we create an XSSF Workbook object for our XLSX Excel File
        XSSFWorkbook workbook = new XSSFWorkbook(inputFile);
        // we get first sheet
        XSSFSheet sheet = workbook.getSheetAt(0);

        // we iterate on rows
        Iterator<Row> rowIt = sheet.iterator();

        while(rowIt.hasNext() ) {
            Row row = rowIt.next();

            // iterate on cells for the current row
            Iterator<Cell> cellIterator = row.cellIterator();

            while (cellIterator.hasNext()) {
                Cell cell = cellIterator.next();
                System.out.print(cell);
            }

            System.out.println();
        }

        workbook.close();
        inputFile.close();
    }
}
