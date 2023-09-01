package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hospiol {

	public static void main(String[] args) throws Exception {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://hospiol.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@class='theme_btn theme_btn_bg'][1]")).click();
		
		

	}

}