package AppiumTesting.Appium;

import org.openqa.selenium.By;

import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;

public class SetWiFi extends Base{
	
	@Test
	public void setwifiTest()
	{
		
		//Locators : id , xpath, accessibilityId, classname, androidautomator
		driver.findElement(AppiumBy.accessibilityId("Preference")).click();
		
		driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"3. Preference dependencies\"]")).click();
		driver.findElement(By.id("android:id/checkbox")).click();
		driver.findElement(By.xpath("//android.widget.ListView[@resource-id=\"android:id/list\"]/android.widget.LinearLayout[2]/android.widget.RelativeLayout")).click();    //Uses the 2nd tagname of xpath
//		String wifiTitle = driver.findElement(By.id("")).getText();
//		Assert.assertEquals(wifiTitle, "WiFi settings");
		
		driver.findElement(By.id("android:id/edit")).sendKeys("ranu123");
		driver.findElement(AppiumBy.className("android.widget.Button")).click();

	}
	

}
