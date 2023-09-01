package Testng;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Data2 {
	WebDriver driver;
	@Test (dataProvider="getdata" , dataProviderClass = Dataexample1.class)
	  public void dataset(String username, String password) throws Throwable {
		 
		  driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
			
			driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
			Thread.sleep(3000);
			driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys(username);
			driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(password);
			Thread.sleep(3000);
			driver.findElement(By.xpath("//button[@type='submit']")).click();
			Thread.sleep(3000);
			String url = driver.getCurrentUrl();
			Assert.assertEquals("https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index", url);
			//Assert.assertTrue(driver.findElement(By.xpath("//p[text()='Rasheeka Collings']")).isDisplayed());
			Thread.sleep(3000);
			driver.close();

}
}