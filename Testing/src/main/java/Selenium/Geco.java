package Selenium;

import java.awt.Window;
import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Geco {
          public static void main(String[] args) throws Throwable  {
        	 WebDriverManager.firefoxdriver().setup();
        	 WebDriver driver=new FirefoxDriver();
        	 driver.manage().window().maximize();
        	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        	 
        	 driver.get("https://demoqa.com/alerts");
        	 driver.findElement(By.id("alertButton")).click();
        	 Alert al= driver.switchTo().alert();
        	 Thread.sleep(3000);
        	 al.accept();
        	 driver.findElement(By.id("timerAlertButton")).click();
        	 Thread.sleep(6000);
        	 al.accept();
        	 driver.findElement(By.id("confirmButton")).click();
        	 Thread.sleep(3000);
        	 al.dismiss();
        	 Thread.sleep(3000);
        	 JavascriptExecutor js = (JavascriptExecutor) driver;
       		js.executeScript("window.scrollBy(0,250)", "");
        	 driver.findElement(By.id("promtButton")).click();
        	 
        	 al.sendKeys("Chakram is a good boy");
        	 Thread.sleep(3000);
        	 al.accept();
        	 
        	
        	 
        	 
        	 
        	 
        	 
			
		}
}
