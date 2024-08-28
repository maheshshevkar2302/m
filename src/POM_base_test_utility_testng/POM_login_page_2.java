package POM_base_test_utility_testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM_login_page_2 
{
	
	 //POM 2
	
		//1. Data members/Global Variable should be declared globally with access level private by using @Findby Annotation
	         @FindBy(xpath="//input[@id='pin']")  private   WebElement PIN; // private WebElement PIN=driver.findElement(By.xpath("//input[@id='pin']"));
	         @FindBy(xpath="//button[text()='Continue ']")  private   WebElement Ctnbtn; //private WebElement Ctnbtn=driver.findElement(By.xpath("//button[text()='Continue ']"));
		

	     	//2. Initialize within a constructor with access level public using pagefactory      
	        public POM_login_page_2 (WebDriver driver)
	         {
	        	 PageFactory.initElements(driver, this);
	        	 
	         }
	        
	        //3.Utilize within a method with access level public
	        public void enterPIN(String Pin) //111000
	    	{
	        	PIN.sendKeys(Pin); //111000
	    	}
	    	
	        public void ClickCtnBtn() 
	    	{
	        	Ctnbtn.click();
	    	}
	        

}
