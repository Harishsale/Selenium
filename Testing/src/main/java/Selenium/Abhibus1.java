package Selenium;

import java.time.Duration;
import org.testng.annotations.Test;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.google.common.annotations.VisibleForTesting;

public class Abhibus1 {

	 @Test 
	 public void Abhi() throws InterruptedException {
		 
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.abhibus.com/");
		driver.manage().window().maximize();;
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.findElement(By.id("source")).sendKeys("Hyderabad");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//li[text()='Hyderabad']")).click();
		driver.findElement(By.id("destination")).sendKeys("Bangalore");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//li[text()='Bangalore']")).click();
		driver.findElement(By.id("datepicker1")).click();
		List<WebElement> days = driver.findElements(By.xpath("//td[@data-month='7']"));
		for (WebElement Days:days) {
			if ( Days.getText().equalsIgnoreCase("16")) {
				Days.click();
				break;

	}
		}
		
		driver.findElement(By.xpath("//a[@class='btn btn-main px-5 py-2 border-right-radius']")).click();
		driver.findElement(By.id("Bustypes1")).click();
		driver.findElement(By.id("Bustypes4")).click();
		List<WebElement> bus= driver.findElements(By.xpath("//div[@class='travele clearfix rSet ng-scope']"));
		for(WebElement buses:bus)
		{
		//	System.out.println(buses.getText());
		    if(buses.getText().contains("RAMANA TRAVELS"))
			{
				driver.findElement(By.id("1650674992")).click();
				break;
			}
		}
		driver.findElement(By.id("UO7-1ZZ")).click();
		WebElement boarding=driver.findElement(By.id("boardingpoint_id"));
	//	Thread.sleep(2000);
		Select sc=new Select(boarding); 
		sc.selectByIndex(1);
		
	    WebElement droping=driver.findElement(By.id("droppingpoint_id"));
     	Select drop=new Select(droping);
		drop.selectByIndex(4);
		driver.findElement(By.id("btnEnable1")).click();
	} 
}

