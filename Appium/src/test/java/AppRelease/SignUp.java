package AppRelease;

import org.testng.annotations.Test;
import org.openqa.selenium.By;

public class SignUp extends Base{
	
	@Test
	
	public void signUp() throws InterruptedException {
		
		driver.findElement(By.id("upwork.andri.productlisting:id/signup_text")).click();
		driver.findElement(By.id("upwork.andri.productlisting:id/input_name")).sendKeys("Rani Naik");
		driver.findElement(By.id("upwork.andri.productlisting:id/input_email")).sendKeys("ranunaikkbh@gmail.com");
		driver.findElement(By.id("upwork.andri.productlisting:id/input_password")).sendKeys("rani@123");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//android.widget.Button[@resource-id=\"upwork.andri.productlisting:id/btn_signup\"]")).click();
		Thread.sleep(3000);	
	}
	
}
