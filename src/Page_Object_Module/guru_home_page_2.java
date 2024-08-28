package Page_Object_Module;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class guru_home_page_2 
{
	//Step_1;Data member should be declared globally having access level private by using findsannotations.
	
	@FindBy(xpath="//td[@style='color: green']") private WebElement Home;
	
	public guru_home_page_2 (WebDriver driver) 
	{
		PageFactory.initElements(driver,this);
	}
	
	public void home() 
	{
		String Expected_Result="Manger Id : mngr413784";
		
		String Actual_Result =Home.getText();
				
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
