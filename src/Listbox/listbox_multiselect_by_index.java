package Listbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class listbox_multiselect_by_index 
{
	public static void main(String[] args) throws InterruptedException 
	{
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Mahesh Shevkar\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("file:///C:/Users/Mahesh%20Shevkar/Desktop/HTML/Listbox_3.html");
		
		WebElement Country =driver.findElement(By.xpath("//select[@id='1234']"));
		
		Select S=new Select(Country);
		
		S.selectByIndex(0);
		
		Thread.sleep(2000);
		
S.selectByIndex(0);
		
		Thread.sleep(2000);
		
S.selectByIndex(1);
		
		Thread.sleep(2000);
		
S.selectByIndex(2);
		
		Thread.sleep(2000);
		
S.selectByIndex(3);
		
		Thread.sleep(2000);
	}

}
