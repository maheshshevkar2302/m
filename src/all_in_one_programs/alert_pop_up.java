package all_in_one_programs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class alert_pop_up 
{
	public static void main(String[] args) 
	{
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Mahesh Shevkar\\Desktop\\Chromedriver\\chromedriver-win64\\chromedriver.exe");
		ChromeOptions Options=new ChromeOptions();
		
		Options.addArguments("--remote-allow-origins=*");
		
		WebDriver driver=new ChromeDriver(Options);
		
		
	    driver.get("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");
	    
	    driver.findElement(By.xpath("(//input[@type='button'])[1]")).click();
	    
	 
	    
	  
	    
	    Alert Alt= driver.switchTo().alert();
	    
	    driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	    
	    Alt.accept();
	    
	    //Step_1:-If u have to handle pop up we have to use driver switch to alert method whose return type is alert so need to store in one object 
	    //Step_2:-if we have to accept pop then use accept();
	    //Step_3:-If we have to dismiss pop then dismiss
	    
	   
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
