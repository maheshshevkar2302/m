package Listbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class getfirstselectable_multiselectable 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Mahesh Shevkar\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("file:///C:/Users/Mahesh%20Shevkar/Desktop/HTML/Listbox_3.html");
		
		WebElement Month =driver.findElement(By.xpath("//select[@id='1234']"));
		
		
		Select SingleText=new Select(Month);
		
		SingleText.selectByVisibleText("India");
		
		WebElement S1=SingleText.getFirstSelectedOption();
		
		System.out.println(S1.getText());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
