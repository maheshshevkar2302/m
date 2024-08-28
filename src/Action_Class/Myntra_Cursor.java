package Action_Class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Myntra_Cursor 
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Mahesh Shevkar\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.myntra.com/");
		
		Thread.sleep(3000);
		
		WebElement Kids=driver.findElement(By.xpath("(//a[@href='/shop/kids'])[1]"));
		

		Thread.sleep(3000);
		
		Actions Act=new Actions(driver);
		

		Thread.sleep(3000);
		
		Act.moveToElement(Kids).perform();
		
		
	}

}
