package AppiumTesting.Appium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumBy;

public class LongPress extends Base{
	
	@Test
	public void longpressTest() throws InterruptedException
	{
		
		driver.findElement(AppiumBy.accessibilityId("Views")).click();
		driver.findElement(By.xpath("//android.widget.TextView[@content-desc='Expandable Lists']")).click();
		//driver.findElement(By.id("android:id/text1")).click();
		driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"1. Custom Adapter\"]")).click();

		WebElement longEle = driver.findElement(By.xpath("//android.widget.TextView[@text='People Names']"));
		
		((JavascriptExecutor)driver).executeScript("mobile: longClickGesture", ImmutableMap.of(
			    "elementId", ((RemoteWebElement) longEle).getId()), "duration", 6000);
		
		Thread.sleep(3000);
		
		WebElement smenu = driver.findElement(By.id("android:id/title"));	

		String Peopletext = smenu.getText();
		
		Assert.assertEquals(Peopletext,"Sample menu");
		
		boolean display = smenu.isDisplayed();
		Assert.assertTrue(display);
	}

}
