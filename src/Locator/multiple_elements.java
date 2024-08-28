package Locator;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class multiple_elements 
{
	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Mahesh Shevkar\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");
		
		//create object of chromedriver with reference to webdriver
		
		WebDriver driver=new ChromeDriver();
		
		//to enter url
		driver.get("https://www.facebook.com/");
		
		Thread.sleep(3000);
		
		List<WebElement> Input=driver.findElements(By.xpath("//button"));
		
		for(WebElement different_inputs:Input) 
		{
			System.out.println(different_inputs.getText());
			
			
		}
		
		
	}

}
