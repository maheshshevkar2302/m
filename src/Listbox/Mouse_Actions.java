package Listbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Mouse_Actions 
{
	public static void main(String[] args) throws InterruptedException {
		
	
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Mahesh Shevkar\\Desktop\\Chromedriver\\chromedriver-win64\\chromedriver.exe");
	ChromeOptions Options=new ChromeOptions();
	
	Options.addArguments("--remote-allow-origins=*");
	
	WebDriver driver=new ChromeDriver(Options);
	
	driver.get("https://www.myntra.com/");
	
	WebElement Men=driver.findElement(By.xpath("//a[@data-group='men']"));
	
	Actions Act=new Actions(driver);
	
	Thread.sleep(5000);
	
	Act.click(Men).perform();
	
	}
}
