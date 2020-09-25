package Locators;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;//
import org.openqa.selenium.chrome.ChromeDriver;

public class ID {

	public static void main(String[] args) {

System.setProperty("webdriver.chrome.driver", "C:\\Users\\romse\\Desktop\\Softwares\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https:www.facebook.com");
		//WebElement email=driver.findElement(By.id("email"));
		//email.sendKeys("Theo");
		
		driver.findElement(By.id("email")).sendKeys("Theo");
		driver.findElement(By.id("pass")).sendKeys("jojojo");
		
		
	}

}
