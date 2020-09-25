package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DepIndeXpathAssignment {

	public static void main(String[] args) throws InterruptedException {

System.setProperty("webdriver.chrome.driver", "C:\\Users\\romse\\Desktop\\Softwares\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demo.actitime.com");
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.linkText("Login")).click();
		Thread.sleep(7000);
		driver.findElement(By.className("popupMenuArrow")).click();
		Thread.sleep(7000);
		driver.findElement(By.linkText("Types of Work")).click();
		Thread.sleep(7000);
		driver.findElement(By.linkText("Create Type of Work")).click();
		Thread.sleep(70000);
		driver.findElement(By.name("name")).sendKeys("Theo");
		Thread.sleep(7000);
		driver.close();
	}
			
}