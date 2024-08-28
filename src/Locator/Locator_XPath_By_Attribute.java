package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator_XPath_By_Attribute 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Mahesh Shevkar\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		
		driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3F%26ext_vrnc%3Dhi%26tag%3Dgooghydrabk1-21%26ref%3Dnav_signin%26adgrpid%3D60571832564%26hvpone%3D%26hvptwo%3D%26hvadid%3D486453138860%26hvpos%3D%26hvnetw%3Dg%26hvrand%3D13129368842088304166%26hvqmt%3De%26hvdev%3Dc%26hvdvcmdl%3D%26hvlocint%3D%26hvlocphy%3D9301240%26hvtargid%3Dkwd-115149184%26hydadcr%3D14452_2154371%26gclid%3DCjwKCAjw9-KTBhBcEiwAr19ig5k4p46npxlBi1olZXjp5KosTQEtY1a8Ng495AUNt6QQMIg_rcYU6RoCH2UQAvD_BwE&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&");
		
		driver.findElement(By.xpath("//input[@maxlength=\"128\"]")).sendKeys("mahesh@2111");
		
		
		
		
		
		
		
		
		
	}

}
