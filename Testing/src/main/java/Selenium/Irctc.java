package Selenium;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Irctc {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.irctc.co.in/nget/train-search");
		Thread.sleep(3000);
		Actions action = new Actions(driver);
		action.sendKeys(Keys.ESCAPE);
		driver.findElement(By.id("disha-banner-close")).click();
		Thread.sleep(3000);
	//	Actions a=new Actions(driver);
//		a.sendKeys(Keys.ESCAPE).build().perform();
		driver.findElement(By.xpath("//a[@class='search_btn loginText ng-star-inserted']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='User Name']")).sendKeys("h_a_r_i_9854");
	//	driver.findElement(By.id("7755338")).sendKeys("h_a_r_i_9854");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("Randy123");
		Thread.sleep(15000);
        driver.findElement(By.xpath("//button[@class='search_btn train_Search']")).click();
        Actions a=new Actions(driver);
        a.moveToElement(null).click();

	}

}
