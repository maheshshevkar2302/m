package Parametrization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.WorkbookFactory;


public class Sample_2 
{
	public static void main(String[] args) throws IOException 
	{
		//to reach or navigate upto excel file
	FileInputStream file=new FileInputStream("C:\\Users\\Mahesh Shevkar\\Desktop\\Automation\\26_feb_D.xlsx");
	
	
	//to fetch data from excel file
		
	String Value=WorkbookFactory.create(file).getSheet("Sheet1").getRow(1).getCell(0).getStringCellValue();
		
	System.out.println(Value);
		
		
		
		
	}
	
	
	
}
