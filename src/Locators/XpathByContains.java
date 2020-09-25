package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathByContains {

	public static void main(String[] args) throws InterruptedException {
		
		//tag[contains@AttributeName,'(AttributeValue)]
		//tag[contains(text(),'textvalue')]

System.setProperty("webdriver.chrome.driver", "C:\\Users\\romse\\Desktop\\Softwares\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		//driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		
		//dynamic text value and dynamic attribute value - that means is changes forgot , forgotten etc.
		
		/*
		 * driver.findElement(By.xpath("//input[contains(@aria-label,'First')]")).
		 * sendKeys("Theo"); Thread.sleep(10000);
		 * driver.findElement(By.xpath("//a[contains(text(),'Forgotten')]")).click();
		 * driver.close();
		 */
		
		// non breakable space in either your text or attribute value 
		
		driver.get("https://login.yahoo.com/");
		driver.findElement(By.xpath("//a[contains(text(),'Create')]")).click();
		Thread.sleep(7000);
		driver.close();
		
		
	}

}
