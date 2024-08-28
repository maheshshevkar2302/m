package Launch_Browser;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Open_Browser_2 
{
	public static void main(String[] args) 
	{
		//Parameter-I:Name of the browser
		//Parameter-II:Path of the chromedriver.exe file
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Mahesh Shevkar\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");
		
		
		//create object of chromedriver class by providing reference of the webdriver
	                    WebDriver driver=new ChromeDriver();
	                    
	                    
	          driver.get("https://www.facebook.com/");   
	          
	          //identify link Elements
	   List<WebElement> Links=driver.findElements(By.xpath("//a"));
	          
	
	        for(WebElement S1:Links) 
	        {
	        	System.out.println(S1.getText());
	        } 
	         
	         
	}
	
	}

