package Action_Class;

import java.io.FileInputStream;

import java.io.IOException;

import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Fetch_Data_From_Excel 
{
	
	public static void main(String[] args) throws IOException 
	{
		FileInputStream file=new FileInputStream("C:\\Users\\Mahesh Shevkar\\Desktop\\Important Things\\Interview Preparation.xlsx");
		
		String Numeric=WorkbookFactory.create(file).getSheet("Sheet13").getRow(0).getCell(0).getStringCellValue();
		
		System.out.println(Numeric);
		
		
		
		
		
	}

}
