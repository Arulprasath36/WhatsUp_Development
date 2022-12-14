package assertions;

import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class XlRreading {
	public static void main(String[] args) throws IOException {
		String filelocation = "C:\\Users\\DURAIRAJ\\eclipse-workspace\\FramsWork\\xlfilefolder\\login.xlsx";
		XSSFWorkbook books = new XSSFWorkbook(filelocation);
		XSSFSheet sheetAt = books.getSheetAt(0);
		int lastRowNum = sheetAt.getLastRowNum();
		short lastCellNum = sheetAt.getRow(0).getLastCellNum();
		for (int i = 1; i <= lastRowNum; i++) {
			XSSFRow row = sheetAt.getRow(i);
			for (int j = 0; j < lastCellNum; j++) {
				XSSFCell cell = row.getCell(j);
				DataFormatter f=new DataFormatter();
				String formatCellValue = f.formatCellValue(cell);
				System.out.println(formatCellValue);
//				String stringCellValue = cell.getStringCellValue();
//				System.out.println(stringCellValue);
			}
		}
		books.close();

	}

}
//note;
//you should snow 3 points
//getLastRow number which is return last row i mean the end value of the page
//getLastCell number which is return last cell i mean the end value of the row
//converting integer value into strings format using dataformater 

