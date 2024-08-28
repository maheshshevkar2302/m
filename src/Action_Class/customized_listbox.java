package Action_Class;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class customized_listbox 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Mahesh Shevkar\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
		
		Thread.sleep(3000);
		
		WebElement Month=driver.findElement(By.xpath("//select[@aria-label='Month']"));
		
		Thread.sleep(3000);
		
		Actions Act=new Actions(driver);
		
		Thread.sleep(3000);
		
		Act.click(Month).perform();
		
		Thread.sleep(3000);
		
		Act.sendKeys(Keys.ARROW_UP).perform();
		
		Thread.sleep(3000);
		
		Act.sendKeys(Keys.ARROW_DOWN).perform();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
