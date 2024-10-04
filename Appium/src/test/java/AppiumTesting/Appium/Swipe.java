package AppiumTesting.Appium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumBy;

public class Swipe  extends Base{
	
	@Test
	public void swipeDemoTest() throws InterruptedException
	{
		driver.findElement(AppiumBy.accessibilityId("Views")).click();
		driver.findElement(AppiumBy.accessibilityId("Gallery")).click();
		driver.findElement(By.xpath("//android.widget.TextView[@content-desc='1. Photos']")).click();
		
		Thread.sleep(5000);
		
		WebElement firstImage = driver.findElement(By.xpath("(//android.widget.ImageView)[1]"));
		
		//Before perform swipe
		String firstTimeValue = firstImage.getAttribute("focusable");
		Assert.assertEquals("true", firstTimeValue);
		
		//perform swipe action
		((JavascriptExecutor) driver).executeScript("mobile: swipeGesture", ImmutableMap.of(
				"elementId", ((RemoteWebElement) firstImage).getId(),
				"direction", "left",
		    "percent", 0.75
		));
		
		//After perform swipe
		String secondTimeValue = firstImage.getAttribute("focusable");
		Assert.assertEquals("false", secondTimeValue);
		
	//not properly working	
		
	}

}
