package Action_Class;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class dynamic_listbox 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Mahesh Shevkar\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		Thread.sleep(3000);
		
		//Step_1:Identify element create new account and click on it.
		driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
		Thread.sleep(3000);
		
		//Step_2:Identify address of lisbox and store into object
		WebElement Month=driver.findElement(By.xpath("//select[@aria-label='Month']"));
		Thread.sleep(3000);
		
		//Step_3:Create object of action class and store into object
		Actions Act=new Actions(driver);
		Thread.sleep(3000);
		
		//Steps_4:Call the methods
		Act.click(Month).perform();
		
		Thread.sleep(3000);
		
		//Steps_6:
		Act.sendKeys(Keys.END);
		
		for(int v = 0; v<=4; v++) 
		{
			Act.sendKeys(Keys.ARROW_DOWN).perform();
			
			
		}
		
		
		
	}

}
