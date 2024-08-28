package Webdriver_and_methods;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicit_Wait 
{
	public static void main(String[] args) 
	{
	  
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Mahesh Shevkar\\Desktop\\Chromedriver\\chromedriver-win64\\chromedriver.exe");
		ChromeOptions Options=new ChromeOptions();
		
		Options.addArguments("--remote-allow-origins=*");
		
	    WebDriver driver=new ChromeDriver(Options);
		
		driver.get("https://www.facebook.com/");
		
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofMillis(5000));
		
	   WebElement CreateAccount=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@role='button'][2]")));
	   
	   CreateAccount.click();
	}

}
