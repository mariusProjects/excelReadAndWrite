import java.io.*;
import java.io.File;
import java.util.Iterator;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;


public class Main {
    public static void main(String[] args) throws IOException {


    File excelFile = new File("D:\\fisier\\Din\\Din\\din\\Diverse\\PrelucrareExcel\\src\\main\\resources\\Book11.xlsx");
        FileInputStream fis = null;
        try {
            fis = new FileInputStream(excelFile);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        // we create an HSSF Workbook object for our XLSX Excel File
        HSSFWorkbook workbook = null;
        try {
            workbook = new HSSFWorkbook(fis);
        } catch (IOException e) {
            e.printStackTrace();
        }
        // we get first sheet
    HSSFSheet sheet = workbook.getSheetAt(0);

    // we iterate on rows
    Iterator<Row> rowIt = sheet.iterator();

    while(rowIt.hasNext()) {
        Row row = rowIt.next();

        // iterate on cells for the current row
        Iterator<Cell> cellIterator = row.cellIterator();

        while (cellIterator.hasNext()) {
            Cell cell = cellIterator.next();
            System.out.print(cell.toString() + ";");
        }

        System.out.println();
    }

    workbook.close();
    fis.close();
}

}


