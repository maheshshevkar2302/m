package Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class kite_login_Page_1 
{
	//Step_1:-Declare data member globally with access level private by using @findsby annotations
	 @FindBy(xpath="//input[@type='text']") private WebElement username;
	 @FindBy(xpath="//input[@type='password']") private WebElement password;
	 @FindBy(xpath="//button[@type='submit']")  private WebElement loginbtn;
	 
	 //Step_2:Initialize within constructor with access level public by using pagefactory
	 public kite_login_Page_1 (WebDriver driver) 
	 {
		 PageFactory.initElements(driver,this);
	 }
	 
	 //Step_3:-Usage of data member using methods
	 
	 
	 public void enterusername() 
	 {
		 username.sendKeys("VOX248");
	 }
	 public void enterpassword() 
	 {
		 password.sendKeys("Mahesh@9763");
	 }
	 public void logbtn() 
	 {
		 loginbtn.click();
	 }

}
