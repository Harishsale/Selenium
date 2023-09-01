package Selenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Seleniumpractice {

	public static void main(String[] args) throws Throwable{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://itera-qa.azurewebsites.net/home/automation");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
		driver.findElement(By.id("name")).sendKeys("Harish");
		driver.findElement(By.id("phone")).sendKeys("9876543210");
		driver.findElement(By.id("email")).sendKeys("Harishjohn@gmail.com");
		driver.findElement(By.id("password")).sendKeys("12234");
		driver.findElement(By.id("address")).sendKeys("flat no:1 hyderbad");
		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
	//	driver.findElement(By.id("male")).click();
		List<WebElement> week=driver.findElements(By.xpath("//input[@class='form-check-input']"));
		for(int i=4;i<week.size()-2;i++)
		{
			week.get(i).click();
		}
		
//		driver.findElement(By.id("tuesday")).click();
//		driver.findElement(By.id("friday")).click();
		WebElement dropdown= driver.findElement(By.xpath("//select[@class='custom-select']"));
		Select sel=new Select(dropdown);
		sel.selectByIndex(2);
		driver.findElement(By.xpath("//label[@for='1year']")).click();
		List<WebElement> tools=driver.findElements(By.xpath("//label[@class='custom-control-label']"));
		for(WebElement software:tools)
		{
			if(!(software.getText().equals("Selenium Webdriver")||software.getText().equals("TestNG")))
			{
				software.click();
			}
		}
		//driver.findElement(By.xpath("//label[text()='Selenium Webdriver']")).click();
		//driver.findElement(By.xpath("//label[text()='TestNG']")).click();
		Robot robo=new Robot();
		driver.findElement(By.id("inputGroupFile02")).click();
		robo.delay(3000);
	
		StringSelection upload=new StringSelection("C:\\Users\\Dell\\Desktop\\HARISH PERSONAL DATA\\IDFC BANK STATEMENT");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(upload, null);
		robo.keyPress(KeyEvent.VK_CONTROL);
		robo.keyPress(KeyEvent.VK_V);
		robo.keyRelease(KeyEvent.VK_CONTROL);
		robo.keyRelease(KeyEvent.VK_V);
		robo.keyPress(KeyEvent.VK_ENTER);
		robo.keyRelease(KeyEvent.VK_ENTER);
		
	}

}
