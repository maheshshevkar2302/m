package Pop_up;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class window_child_main_windows 
{
public static void main(String[] args) throws InterruptedException 
{
	
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Mahesh Shevkar\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://skpatro.github.io/demo/links/");
	
	driver.manage().window().maximize();
	
	Thread.sleep(3000);
	
	driver.findElement(By.xpath("(//input[@type='button'])[2]")).click();
	
	Thread.sleep(3000);
	
    Set<String> Windows=driver.getWindowHandles();
    
    ArrayList<String> ar=new ArrayList<String>(Windows);
	
	String MainWindow=ar.get(0);
	String Childwindow=ar.get(1);
	
	driver.switchTo().window(Childwindow);
}
}
