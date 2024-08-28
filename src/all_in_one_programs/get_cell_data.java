package all_in_one_programs;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class get_cell_data 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		//To reach/navigate upto excel sheet
		FileInputStream file=new FileInputStream("C:\\Users\\Mahesh Shevkar\\Desktop\\Automation\\26_feb_D.xlsx");
			
		
		Sheet Sh=WorkbookFactory.create(file).getSheet("Sheet11");
		
		int rowIndex=Sh.getRow(14).getRowNum()-1;
		
		for(int i=0; i<=rowIndex; i++ ) 
		{
			
			String Value=Sh.getRow(14).getCell(0).getStringCellValue();
			System.out.println(Value);}
		
	}

}
