package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentForgotPWordLinkText {

	public static void main(String[] args) {

		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\romse\\Desktop\\Softwares\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		//driver.get("https://demo.actitime.com");
		//driver.findElement(By.id("toPasswordRecoveryPageLink")).click();
		
		driver.get("https://www.myntra.com");
		driver.findElement(By.linkText("Essentials")).click();
		
	}

}
