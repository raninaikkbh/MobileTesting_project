package FaceBookTests;


import org.testng.annotations.Test;

import FaceBookPages.SignUpPage;
import io.appium.java_client.android.AndroidDriver;

public class signUpTest extends Base{
	
	 @Test
	    public void signUp() throws InterruptedException {
		 
	        //  initialized AndroidDriver 
	        AndroidDriver driver = getDriver();
	        
	        // Pass the driver instance to the constructor of SignUpPage
	        SignUpPage register = new SignUpPage(driver);

	        
	        register.clickallowPermisson();
	        register.createNewAccBtn();
	        register.nextBtn();
	        register.FirstName();
	        register.LastName();
	        register.NextButton();
	        register.Allow();
	        register.SignUpEmail();
	        register.ClickOnNextBtn();
	        register.BirthDate();
	        register.birthNextBtn();
	        register.radioBtnF();
	        register.NewPwd();
	        register.NextBTN();
	        register.SignUpBtn();
	        Thread.sleep(3000);
	 }	
}
