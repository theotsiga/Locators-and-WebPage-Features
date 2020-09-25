package Locators;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkText {

	public static void main(String[] args) {

System.setProperty("webdriver.chrome.driver", "C:\\Users\\romse\\Desktop\\Softwares\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("https://outlook.live.com/owa/");
		driver.findElement(By.linkText("Sign in")).click();
		//driver.findElement(By.linkText("football")).click();
		driver.findElement(By.id("i0116")).sendKeys("theotsiga@hotmail.co.uk");
		driver.findElement(By.id("idSIButton9")).click();
		driver.findElement(By.cssSelector("#i0118")).sendKeys("Chamboko2");
		driver.findElement(By.id("#idSIButton9")).click();
		
		
		
	}
	
}
