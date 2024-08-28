package POM_base_test_utility_testng;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;


public class POM_utility_class 
{
	//To read data from property file                                    //PIN
		public static String getDataFromPF(String key) throws IOException 
		{
			//Create object of FileInputStream Class and provide path of property file(Reach to property file)	
		FileInputStream file=new FileInputStream("C:\\Users\\Mahesh Shevkar\\eclipse-workspace\\26_feb_Morning_2022\\PropertyFile.properties");
			
			//Create of  Properties class
			Properties prop=new Properties();
		
		   //To open Property file
		    prop.load(file);
		    
		    //To fetch value                //PIN
		     String  Value1=prop.getProperty(key);
			
		     return Value1;//111000
			
		}
		
		         //To read data from Excel sheet
		                                              //0             //3
		public static String GetDatafromExcelsheet(int rowIndex,int cellIndex) throws EncryptedDocumentException, IOException 
		{
			FileInputStream file=new FileInputStream("C:\\Users\\samsung\\Desktop\\Automation\\26_feb\\parameterization\\26Feb_D_Morning.xlsx");         
	          
			 Sheet Sh=WorkbookFactory.create(file).getSheet("Sheet10"); 
			                         //0              //3
			String Value2 =Sh.getRow(rowIndex).getCell(cellIndex).getStringCellValue();
			 
			 return Value2; //GP8097
			
		}
		
		
		public static void CaptureScreenshot(WebDriver driver) throws IOException 
		{
		    //Take Screenshot  
			   File  Src =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);    
				          System.out.println(Src); 
				          
				        //Create object of File
				   File dest=new File("C:\\Users\\Mahesh Shevkar\\Desktop\\Screenshot\\Sample13.png");
				        
				 //Copy screenshot to destination folder
				     FileHandler.copy(Src, dest);     
			
		
		}
		
		

}
