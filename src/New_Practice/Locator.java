package New_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Mahesh Shevkar\\Desktop\\Selenium\\chromedriver.exe");
	
	   WebDriver driver=new ChromeDriver();
	   
	   driver.get("https://www.amazon.in/");
	   
	   driver.findElement(By.xpath("//html[contains(@lang,\"en\")]"));
	   }

}
