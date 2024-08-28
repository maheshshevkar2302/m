package Handling_Dynamic_Handling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class clock_dynamic_element 

{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Mahesh Shevkar\\Downloads\\chromedriver_win32 (8)\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.timeanddate.com/time/zone/india/pune");
		
		Thread.sleep(3000);
		
		WebElement Clock=driver.findElement(By.xpath("(//div[@id='qlook']//span)[3]"));
		
		Thread.sleep(3000);
		
		String Sh=Clock.getText();
		
		Thread.sleep(3000);
		
		System.out.println(Sh);
	}
}
