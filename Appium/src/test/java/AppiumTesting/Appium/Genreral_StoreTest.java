package AppiumTesting.Appium;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;

public class Genreral_StoreTest extends Base {
	
	@Test (enabled = false)
	
	
	public void dropDown() throws InterruptedException 
	{
		driver.findElement(By.id("android:id/text1")).click();
		driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Bangladesh\"));"));
		driver.findElement(By.xpath("//android.widget.TextView[@text='Bangladesh']")).click();
		
		//Type name in a field
		driver.findElement(By.id("com.androidsample.generalstore:id/nameField")).sendKeys("Ranu");
		driver.hideKeyboard();                        //hide keyboard
		Thread.sleep(3000);
		
		//select radio button
		driver.findElement(By.id("com.androidsample.generalstore:id/radioFemale")).click();
		driver.findElement(By.id("com.androidsample.generalstore:id/btnLetsShop")).click();
		Thread.sleep(3000);
	}
	
	
	
	@Test
	
	public void toastMsgTest() {
		
        //Scroll & select Bangladesh option from dropDown.
		driver.findElement(By.id("android:id/text1")).click();
		driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Bangladesh\"));"));
		driver.findElement(By.xpath("//android.widget.TextView[@text='Bangladesh']")).click();
		
		
		//select radio button
		driver.findElement(By.id("com.androidsample.generalstore:id/radioFemale")).click();
		driver.findElement(By.id("com.androidsample.generalstore:id/btnLetsShop")).click();
		
		//spy toast message & get the text tagName= android.widget.Toast		
		String toastMsg = driver.findElement(By.xpath("(//android.widget.Toast)[1]")).getAttribute("name");
		Assert.assertEquals(toastMsg, "Please enter your name");
	}
}
