package all_in_one_programs;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class drop_down_semantec 
{
	public static void main(String[] args) throws IOException 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Mahesh Shevkar\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");
		
	    WebDriver driver=new ChromeDriver();
	    
	    driver.get("https://www.myntra.com/");
		
	    driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	    
	   WebElement Home=driver.findElement(By.xpath("(//a[@href='/shop/home-living'])[1]"));
	   
	   Actions Act=new Actions(driver);
	   
	   Act.moveToElement(Home).perform();}

}
