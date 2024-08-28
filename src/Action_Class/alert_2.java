package Action_Class;



import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class alert_2 
{
	
		public static void main(String[] args) throws IOException, InterruptedException 
		{
			System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver_win32 (11)\\chromedriver.exe");
			
		    WebDriver driver=new 	ChromeDriver();
		    
		    driver.get("https://nxtgenaiacademy.com/alertandpopup/");
		    
		    Thread.sleep(3000);
		    
		    driver.findElement(By.xpath("//button[@name=\"alertbox\"]")).click();
		    
		   
;		
	}

}
