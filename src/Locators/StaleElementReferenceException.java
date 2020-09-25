package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaleElementReferenceException {

	public static void main(String[] args) {


System.setProperty("webdriver.chrome.driver", "C:\\Users\\romse\\Desktop\\Softwares\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com");
		WebElement link = driver.findElement(By.linkText("Forgotten account"));
		System.out.println(link.getText());
		link.click();
		link.getText(); //stale element ref. exception
		
		///how to overcome 
		/*WebElement link1 = driver.findElement(By.linkText ("forgotten account?"));
		 *///System.out.println(link1getText())*/
		
	}

}
