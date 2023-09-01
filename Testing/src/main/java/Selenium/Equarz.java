package Selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Equarz {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.get("http://e-quarz.com/customer/auth/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.findElement(By.id("si-email")).sendKeys("chakrivineesh@gmail.com");
		driver.findElement(By.id("si-password")).sendKeys("Vishnu@1969");
		Thread.sleep(15000);
		driver.findElement(By.xpath("//button[text()='Sign in']")).click();
		driver.findElement(By.xpath("//button[@class='close __close']")).click();
		Actions a=new Actions(driver);
		WebElement fashion=driver.findElement(By.xpath("//span[text()='Fashion']"));
		a.moveToElement(fashion).build().perform();
		Thread.sleep(3000);
		WebElement men=driver.findElement(By.xpath("//span[text()='Mens']"));
		a.moveToElement(men).build().perform();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text()='Trousers']")).click();
		driver.findElement(By.xpath("//img[@src='http://e-quarz.com/storage/app/public/product/thumbnail/2023-06-26-6498f0b3be4a8.png']")).click();
		driver.findElement(By.xpath("//span[text()='Add to cart']")).click();
		WebElement cart=driver.findElement(By.xpath("//i[@class='navbar-tool-icon czi-cart']"));
		a.moveToElement(cart).build().perform();
		driver.findElement(By.xpath("//a[@class='btn btn--primary btn-sm btn-block']")).click();
		WebElement shipping=driver.findElement(By.xpath("//select[@class='form-control']"));
		Select sec=new Select(shipping);
		sec.selectByIndex(1);
		driver.findElement(By.xpath("//a[@class='btn btn--primary pull-right']")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("same_as_shipping_address")).click();
		driver.findElement(By.xpath("//a[@class='btn btn--primary btn-block']")).click();
		
		
		
		
		
		
		

	}

}
