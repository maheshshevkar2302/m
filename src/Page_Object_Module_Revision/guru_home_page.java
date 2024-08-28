package Page_Object_Module_Revision;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class guru_home_page 
{
	@FindBy(xpath="//td[@style='color: green']") private WebElement home;

	
	 public  guru_home_page  (WebDriver driver) 
	 {
		 
		 PageFactory.initElements(driver,this);
		 
	 }
	 
	 
	 public void verify_userid() 
	 {
		
			 
		 String Expected_Result="Manger Id : mngr413784";
			
			String Actual_Result=home.getText();
					
		   if(Expected_Result.equals(Actual_Result))
		   {
			   System.out.println("Pass");
		   }
		   else 
		   {
			   System.out.println("Fail");
		   }
	 }

}
