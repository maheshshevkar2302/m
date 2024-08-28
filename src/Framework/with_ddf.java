package Framework;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FilterInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class with_ddf 
{
	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException 
	{
System.setProperty("webdriver.chrome.driver","C:\\Users\\Mahesh Shevkar\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://kite.zerodha.com/");
		
		Thread.sleep(3000);
		
		FileInputStream file=new FileInputStream("C:\\Users\\Mahesh Shevkar\\Desktop\\Automation\\26_feb_D.xlsx");
		
		
		Sheet Sh=WorkbookFactory.create(file).getSheet("Sheet8");
		
		String Username=Sh.getRow(0).getCell(0).getStringCellValue();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys(Username);
		
		Thread.sleep(3000);
		
		String Password=Sh.getRow(0).getCell(1).getStringCellValue();
		
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys(Password);
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		Thread.sleep(3000);
		
		String PIN=Sh.getRow(0).getCell(2).getStringCellValue();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys(PIN);
		
		Thread.sleep(3000);
		
        driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		Thread.sleep(3000);
		
	
		String Expected_Result=driver.findElement(By.xpath("//span[text()='GP8097']")).getText();
		
		String Actual_Result=Sh.getRow(0).getCell(3).getStringCellValue();
		
		if(Expected_Result.equals(Actual_Result))
		{
			System.out.println("Pass");
		}
	
	else 
	{
		System.out.println("Fail");
	}

}
}