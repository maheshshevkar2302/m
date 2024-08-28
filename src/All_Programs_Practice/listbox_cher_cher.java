package All_Programs_Practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class listbox_cher_cher 
{

	public static void main(String[] args) 
	{
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Mahesh Shevkar\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
		
	driver.get("https://chercher.tech/practice/practice-dropdowns-selenium-webdriver");
	
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	
	WebElement Animal=driver.findElement(By.xpath("(//select[@class='col-lg-3'])[1]"));
		
	Select S1=new Select(Animal);
	
	S1.selectByVisibleText("Google");
		
		
		
		
		
		
		
	}
}
