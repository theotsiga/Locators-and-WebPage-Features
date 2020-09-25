package webpagefeatures;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BackForwardRefresh {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\romse\\Desktop\\Softwares\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.navigate().to("https://www.flipkart.com");
		driver.navigate().to ("https://www.myntra.com");
		driver.navigate().back();
		driver.navigate().forward();
		Thread.sleep(10000);
		driver.navigate().refresh();
		driver.close();
		
	}

}
