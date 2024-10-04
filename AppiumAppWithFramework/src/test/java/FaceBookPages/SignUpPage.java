package FaceBookPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;

public class SignUpPage {
	
	 AndroidDriver driver;

	    // Constructor to initialize the PageFactory
	    public SignUpPage(AndroidDriver d) {
	        driver = d;
	        PageFactory.initElements(driver, this);
	    }
	    
	@FindBy(id="com.android.permissioncontroller:id/permission_allow_button")
	WebElement allowPermisson;
	
	@FindBy(xpath="//android.widget.FrameLayout[@resource-id=\"com.facebook.lite:id/main_layout\"]/android.widget.FrameLayout/android.view.ViewGroup[2]/android.view.ViewGroup[3]/android.view.View")
	WebElement createNewAcc;
	
	@FindBy(xpath="//android.widget.FrameLayout[@resource-id=\"com.facebook.lite:id/main_layout\"]/android.widget.FrameLayout/android.view.ViewGroup[3]/android.view.ViewGroup[2]/android.view.ViewGroup")
	WebElement next;
	
	@FindBy(xpath="//android.widget.FrameLayout[@resource-id=\"com.facebook.lite:id/main_layout\"]/android.widget.FrameLayout/android.view.ViewGroup[1]/android.widget.MultiAutoCompleteTextView[1]")
	WebElement txtFName;
	
	@FindBy(xpath="//android.widget.FrameLayout[@resource-id=\"com.facebook.lite:id/main_layout\"]/android.widget.FrameLayout/android.view.ViewGroup[1]/android.widget.MultiAutoCompleteTextView[2]")
	WebElement txtLName;
	
	@FindBy(xpath="//android.widget.FrameLayout[@resource-id=\"com.facebook.lite:id/main_layout\"]/android.widget.FrameLayout/android.view.ViewGroup[1]/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.View")
	WebElement clickOnNextBtn;
	
	@FindBy(id="com.android.permissioncontroller:id/permission_allow_button")
	WebElement allow;
	
	@FindBy(xpath="//android.widget.FrameLayout[@resource-id=\"com.facebook.lite:id/main_layout\"]/android.widget.FrameLayout/android.view.ViewGroup[3]/android.view.ViewGroup[3]/android.view.View")
	WebElement signupwithEmail;
	
	@FindBy(xpath="//android.widget.MultiAutoCompleteTextView")
	WebElement txtEmail;
	
	@FindBy(xpath="//android.widget.FrameLayout[@resource-id=\"com.facebook.lite:id/main_layout\"]/android.widget.FrameLayout/android.view.ViewGroup[3]/android.view.ViewGroup[2]/android.view.ViewGroup")
	WebElement ClickNext;
	
	@FindBy(xpath="//android.widget.FrameLayout[@resource-id=\"com.facebook.lite:id/main_layout\"]/android.widget.FrameLayout/android.view.ViewGroup[3]/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.View[1]")
	WebElement birthDate;
	
	@FindBy(xpath="//android.widget.FrameLayout[@resource-id=\"com.facebook.lite:id/main_layout\"]/android.widget.FrameLayout/android.view.ViewGroup[4]/android.view.ViewGroup[1]/android.view.View")
	WebElement selectOne;
	
	@FindBy(xpath="//android.widget.FrameLayout[@resource-id=\"com.facebook.lite:id/main_layout\"]/android.widget.FrameLayout/android.view.ViewGroup[3]/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.View[3]")
	WebElement birthMonth;
	
	@FindBy(xpath="//android.widget.FrameLayout[@resource-id=\"com.facebook.lite:id/main_layout\"]/android.widget.FrameLayout/android.view.ViewGroup[4]/android.view.ViewGroup[11]/android.view.View")
	WebElement selectZero;
	
	@FindBy(xpath="//android.widget.FrameLayout[@resource-id=\"com.facebook.lite:id/main_layout\"]/android.widget.FrameLayout/android.view.ViewGroup[4]/android.view.ViewGroup[5]/android.view.View")
	WebElement selectFive;
	
	@FindBy(xpath="//android.widget.FrameLayout[@resource-id=\"com.facebook.lite:id/main_layout\"]/android.widget.FrameLayout/android.view.ViewGroup[3]/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.View[5]")
	WebElement birthYear;
	
	@FindBy(xpath="//android.widget.FrameLayout[@resource-id=\"com.facebook.lite:id/main_layout\"]/android.widget.FrameLayout/android.view.ViewGroup[4]/android.view.ViewGroup[2]/android.view.View")
	WebElement selectTwo;

	@FindBy(xpath="//android.widget.FrameLayout[@resource-id=\"com.facebook.lite:id/main_layout\"]/android.widget.FrameLayout/android.view.ViewGroup[3]/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup")
	WebElement bithNext;
	
	@FindBy(xpath="//android.widget.FrameLayout[@resource-id=\"com.facebook.lite:id/main_layout\"]/android.widget.FrameLayout/android.view.ViewGroup[4]/android.view.ViewGroup[2]/android.view.View[2]")
	WebElement femaleBtn;
	
	@FindBy(xpath="//android.widget.MultiAutoCompleteTextView")
	WebElement txtNewPwd;
	
	@FindBy(xpath = "//android.widget.FrameLayout[@resource-id=\"com.facebook.lite:id/main_layout\"]/android.widget.FrameLayout/android.view.ViewGroup[1]/android.view.ViewGroup[2]/android.view.ViewGroup")
	WebElement nextButn;
	
	@FindBy(xpath="//android.widget.FrameLayout[@resource-id=\"com.facebook.lite:id/main_layout\"]/android.widget.FrameLayout/android.view.ViewGroup[4]/android.view.ViewGroup[7]/android.view.ViewGroup/android.view.View")
	WebElement signUp;
	
	public void clickallowPermisson()
	{
		allowPermisson.click();
	}

	public void createNewAccBtn()
	{
		createNewAcc.click();
	}
	
	public void nextBtn()
	{
		next.click();
	}
	
	public void FirstName()
	{
		txtFName.sendKeys("Rani");
	}
	
	public void LastName()
	{
		
		txtLName.sendKeys("Naik");
	}
	
	public void NextButton()
	{
		clickOnNextBtn.click();
	}
	
	public void Allow()
	{
		allow.click();
	}
	
	public void SignUpEmail()
	{
		//signupwithEmail.click();
		txtEmail.sendKeys("ranunaikkbh@gmail.com");
	}
	
	public void ClickOnNextBtn() 
	{
		ClickNext.click();
	}
	
	public void BirthDate()
	{
		birthDate.click();
		selectOne.click();
		selectOne.click();
		//birthDate.sendKeys("11");
		
		birthMonth.click();
		selectZero.click();
		selectFive.click();
		
		selectTwo.click();
		selectZero.click();
		selectZero.click();
		selectZero.click();
		//birthYear.sendKeys("2000");
		
	}
	
	public void birthNextBtn()
	{
		bithNext.click();
	}
	public void radioBtnF()
	{
		femaleBtn.click();
	}
	
	public void NewPwd()
	{
		
		txtNewPwd.sendKeys("Ranunaik@123");
	}
	
	public void NextBTN()
	{
		nextButn.click();
	}
	
	public void SignUpBtn()
	{
		signUp.click();
	}
}
