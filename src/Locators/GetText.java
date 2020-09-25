package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetText {

	public static void main(String[] args) {

		

System.setProperty("webdriver.chrome.driver", "C:\\Users\\romse\\Desktop\\Softwares\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com");
		//WebElement link = driver.findElement(By.linkText("Forgotten account?"));
		WebElement link = driver.findElement(By.linkText("Log In"));
		
		System.out.println(link.getText());
		System.out.println(link.getText());
		
		driver.close();
		
	}

}
