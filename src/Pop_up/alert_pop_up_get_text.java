package Pop_up;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class alert_pop_up_get_text 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Mahesh Shevkar\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@name='cusid']")).sendKeys("98501657666");
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("Mahesh@9763")).sendKeys("Mahesh@9763");
		
		Alert Alt=driver.switchTo().alert();
		
		String Msg=Alt.getText();
		
		System.out.println(Msg);
		
	}

}
