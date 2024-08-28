package Parametrization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class get_all_data_rows 
{
	public static void main(String[] args) throws IOException 
	{
		
		FileInputStream file=new FileInputStream("C:\\Users\\Mahesh Shevkar\\Desktop\\Automation\\26_feb_D.xlsx");
		
		
		Sheet Sh=WorkbookFactory.create(file).getSheet("Sheet5");
		
		int Lastcellnum=Sh.getRow(0).getLastCellNum()-1;
		
		for(int i = 0; i<=Lastcellnum; i++)
		{
			
			String Value=Sh.getRow(0).getCell(i).getStringCellValue();
			System.out.println(Value);
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
