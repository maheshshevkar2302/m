package Handling_Dynamic_Handling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class dynamic_cricbuzz_score 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Mahesh Shevkar\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.cricbuzz.com/live-cricket-scores/46597/wi-vs-pak-1st-odi-rescheduled-match-west-indies-tour-of-pakistan-2021-22");
		
		Thread.sleep(3000);
		
		WebElement RunRate=driver.findElement(By.xpath("((//div[@class='cb-col cb-col-67 cb-nws-lft-col cb-comm-pg']//span))[19]"));
		
		String S1=RunRate.getText();
		
		System.out.println(S1);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
