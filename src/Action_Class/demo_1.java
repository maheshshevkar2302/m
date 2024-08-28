package Action_Class;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class demo_1 
{
	public static void main(String[] args) throws IOException, InterruptedException 
	{
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Mahesh Shevkar\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Redmi");
		
		driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
		
		File Source=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		File Destination=new File("C:\\Users\\Mahesh Shevkar\\Desktop\\Screenshot\\sample.jpg");
		
		FileHandler.copy(Source,Destination);
		
	    Boolean Display=driver.findElement(By.xpath("//a[@href='/ref=nav_logo']")).isDisplayed();
	    System.out.println(Display);
		
        JavascriptExecutor jse=(JavascriptExecutor)driver;	
        
jse.executeScript("window.scrollBy(0,400);");
		
		Thread.sleep(3000);
		
		jse.executeScript("window.scrollBy(0,400);");
		
		
		
		
	}

}
