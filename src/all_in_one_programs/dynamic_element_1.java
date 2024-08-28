package all_in_one_programs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class dynamic_element_1 
{
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Mahesh Shevkar\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.amazon.in/s?k=Camera&i=electronics&ref=nb_sb_noss");
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);	
		
		WebElement Rating=driver.findElement(By.xpath("((//div[contains(@class,'a-section')])[8]//span)[5]"));
		
              String R=Rating.getText();
              
              System.out.println(R);
}
}
