package FaceBookTests;

import org.testng.annotations.Test;

import FaceBookPages.LoginPage;
import io.appium.java_client.android.AndroidDriver;

public class FacebookTest extends Base {

	@Test
	
	public void AllFaceBookTest() throws InterruptedException
	{
		
	//  initialized AndroidDriver 
        AndroidDriver driver = getDriver();
        
//        SignUpPage register = new SignUpPage(driver);
//
//        register.clickallowPermisson();
//        register.createNewAccBtn();
//        register.nextBtn();
//        register.FirstName();
//        register.LastName();
//        register.NextButton();
//        register.Allow();
//        register.SignUpEmail();
//        register.ClickOnNextBtn();
//        register.BirthDate();
//        register.birthNextBtn();
//        register.radioBtnF();
//        register.NewPwd();
//        register.NextBTN();
//        register.SignUpBtn();
        
        
        //Login Page
        
        LoginPage login = new LoginPage(driver);
        
       login.clickallowPermisson();
        login.EmailId();
        login.password();
        login.LoginBtn();
        Thread.sleep(3000);
        
        
        //after Login
        
        AfterLogin AftrLogin = new AfterLogin(driver);
        
        		AftrLogin.clickOnOkBtn();
        		//AftrLogin.SkipBtn();
        		AftrLogin.contactIcon();
        		
	}
}
