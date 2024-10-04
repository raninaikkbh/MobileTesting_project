package AppRelease;

import org.testng.annotations.Test;
import org.openqa.selenium.By;

public class login extends Base{
	
	
	@Test
	public void loginTest() throws InterruptedException
	{
		driver.findElement(By.xpath("//android.widget.EditText[@resource-id=\"upwork.andri.productlisting:id/input_email\"]")).sendKeys("ranunaikkbh@gmail.com");
		driver.findElement(By.id("upwork.andri.productlisting:id/input_password")).sendKeys("rani@123");
	    driver.findElement(By.id("upwork.andri.productlisting:id/btn_login")).click();
	    Thread.sleep(6000);
	}

}
