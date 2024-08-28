package Parametrization;

import java.io.FileInputStream;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class get_all_data_fetch 
{
	public static void main(String[] args) throws IOException 

	{
		
		//to reach upto excel file
		 FileInputStream file=new FileInputStream("C:\\Users\\Mahesh Shevkar\\Desktop\\Automation\\26_feb_D.xlsx");
		
		//to fetch data from excel
	     Sheet Sh =WorkbookFactory.create(file).getSheet("Sheet6");
	     
	     int Lastrowindex=Sh.getLastRowNum()-1;
	     
	     int Lastcellindex=Sh.getRow(0).getLastCellNum()-1
	    		 ;	     
	     
	     for(int u=0; u<=Lastrowindex; u++) 
	     {
	    	 for(int i=0; i<= Lastcellindex; i++) 
	    	 {
	    		 
	    		String  Value=Sh.getRow(u).getCell(i).getStringCellValue();
	    		 
	    		 System.out.print(Value+" ");
	    		 
	    	 }
	    	 
	     }
	     
	     System.out.println();
	     
	     }
	     }