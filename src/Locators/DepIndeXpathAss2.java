package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DepIndeXpathAss2 {

	public static void main(String[] args) throws InterruptedException {

		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\romse\\Desktop\\Softwares\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://filehippo.com/popular/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@id='didomi-notice-agree-button']")).click();
		driver.findElement(By.xpath("//p[contains(text(),'VLC Media Player 64-bit')]/../../../../.././/p[contains(text(),'VLC Media Player 64-bit')]")).click();
	}

}
