package dataproviderr;

import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormat;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Older {
	//Xl reading class base 3 class

	public static String[][] getXlData()  {

		String filelocation = "C:\\Users\\DURAIRAJ\\eclipse-workspace\\FramsWork\\xlfilefolder\\login.xlsx";
		XSSFWorkbook books=null;
		try {
			books = new XSSFWorkbook(filelocation);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		XSSFSheet sheetAt = books.getSheetAt(0);
		int lastRowNum = sheetAt.getLastRowNum();
		System.out.println(lastRowNum);
		int physicalNumberOfRows = sheetAt.getPhysicalNumberOfRows();// should know which is get all rows include header
		System.out.println(physicalNumberOfRows);
		short lastCellNum = sheetAt.getRow(0).getLastCellNum();
		System.out.println("this is last cell number" + lastCellNum);
		String data[][]=new String[lastRowNum][lastCellNum];

		for (int i = 1; i <= lastRowNum; i++) {
			XSSFRow row = sheetAt.getRow(i);
			for (int j = 0; j < lastCellNum; j++) {
				XSSFCell cell = row.getCell(j);
				DataFormatter dft = new DataFormatter();
				String Value = dft.formatCellValue(cell);
//				System.out.println(formatCellValue);
				data[i-1][j]=Value;

			}
		}
		try {
			books.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return data;
		

	}

}
