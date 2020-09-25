package Locators;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XByAttriAssignment2 {

	public static void main(String[] args) {

			
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\romse\\Desktop\\Softwares\\chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.findElement(By.xpath("//input[@name='txtUsername']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("admin123");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
	    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		//driver.close();
	    
		
		//driver.manage().window();
		driver.get("https://www.netflix.com/gb/login");
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("romseytsiga@outlook.com");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Romseyroad1");
		
		//driver.manage().window();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("test");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("tested");
		
		
	}

}
