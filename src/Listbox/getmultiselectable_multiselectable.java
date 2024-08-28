package Listbox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class getmultiselectable_multiselectable 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Mahesh Shevkar\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("file:///C:/Users/Mahesh%20Shevkar/Desktop/HTML/Listbox_3.html");
		
		WebElement Month =driver.findElement(By.xpath("//select[@id='1234']"));
		
		Select Multi_Text=new Select(Month);
	
		Multi_Text.selectByVisibleText("India");
		Thread.sleep(3000);
		
		Multi_Text.selectByVisibleText("Pakistan");
		Thread.sleep(3000);
	
		Multi_Text.selectByVisibleText("Srilanka");
		Thread.sleep(3000);
	
		Multi_Text.selectByVisibleText("Nepal");
		Thread.sleep(3000);
		
		 List<WebElement>  S1=Multi_Text.getAllSelectedOptions();
		 
		 for(WebElement S2:S1) 
		 {
			 System.out.println(S2.getText());
		 }
		
		 
		
		
		
	
	
	
	
	
	
	

}
	
}

