package Selenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Abhibus {

	public static void main(String[] args) throws Throwable {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.abhibus.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.findElement(By.id("source")).sendKeys("Hyderabad");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//li[text()='Hyderabad']")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("destination")).sendKeys("Tirupati");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//li[text()='Tirupathi']")).click();
		driver.findElement(By.id("datepicker1")).click();
//		driver.findElement(By.xpath("//input[@id='datepicker1']")).click();
//		List<WebElement> date=driver.findElements(By.xpath("//td[@data-month='7']"));
//		for(WebElement Date:date)
//		{
//			if(Date.getText().equalsIgnoreCase("25"))
//			{
//				Date.click();
//				break;
//			}
//		}
//		driver.findElement(By.xpath("//a[@class='btn btn-main px-5 py-2 border-right-radius']")).click();
//		Thread.sleep(3000);
		
		
		

	}

}
