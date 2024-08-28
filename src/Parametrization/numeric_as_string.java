package Parametrization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.WorkbookFactory;


public class numeric_as_string 
{
	public static void main(String[] args) throws IOException 
	{
		
		//to reach upto excel file.
		
		FileInputStream file=new FileInputStream("C:\\Users\\Mahesh Shevkar\\Desktop\\Automation\\26_feb_D.xlsx");
		
		//to fetch data numeric no as string 
        String Numeric =WorkbookFactory.create(file).getSheet("Sheet2").getRow(0).getCell(0).getStringCellValue();		
		
		System.out.println(Numeric);
	}

}
