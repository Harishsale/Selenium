package Selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Loginform {

	public static void main(String[] args) throws Exception {
		ChromeDriver driver=new ChromeDriver();
//		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
//		driver.findElement(By.id("email")).sendKeys("niharika");
	//	driver.get("https://docs.google.com/forms/d/e/1FAIpQLSfugyKsB9bOEN4KkbIrPqNB8id4f1aStHnTXGA_WGiNTbQJ3A/viewform");
		driver.manage().window().maximize();
		//driver.findElement(By.xpath("//a[text()='Sign in to Google']")).click();
		driver.get("https://accounts.google.com/v3/signin/identifier?dsh=S1443447988%3A1690532510894222&continue=https%3A%2F%2Fdocs.google.com%2Fforms%2Fd%2Fe%2F1FAIpQLSfugyKsB9bOEN4KkbIrPqNB8id4f1aStHnTXGA_WGiNTbQJ3A%2Fviewform%3Ffbzx%3D118067803381831643&ifkv=AeDOFXghWnqtAoxbU5s-IPb8kn5dvLamFjVh1pF4fjDYjWsGMTF3U_r2A3WHYUM5_o4X14PLbaFCeg&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.switchTo().frame(-1);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='OabDMe cXrdqd y2zypf']")).sendKeys("satish99@gmail.com");
		driver.findElement(By.xpath("//span[text()='Next']")).click();
//		//span[text()='Next']
//		//driver.findElement(By.xpath("//span[text()='Next']")).click();
	}
}
