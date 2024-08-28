package Listbox;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;



public class Listbox_Practice_24 
{
	public static void main(String[] args) throws InterruptedException 
	{
		
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Mahesh Shevkar\\Desktop\\Chromedriver\\chromedriver-win64\\chromedriver.exe");
		ChromeOptions Options=new ChromeOptions();
		
		Options.addArguments("--remote-allow-origins=*");
		
		WebDriver driver=new ChromeDriver(Options);
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		//two parameter time as an integer and Measurement in terms of seconds and milisecond 
		
		driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
		
		WebElement Month=driver.findElement(By.xpath("//Select[@aria-label='Month']"));
		
		Select S1=new Select(Month);
		
		S1.selectByVisibleText("Aug");
		
		Thread.sleep(5000);
		
		S1.selectByIndex(2);
		
	}

}
