package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleXpathAtrributes {

	public static void main(String[] args) {

		
		// tag[@attributename='attributevalue'][@attributename='attributevalue'][[@attributename='attributevalue']
		//input[@class='inputtext login_login_form_input_box - facebook valuer 

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\romse\\Desktop\\Softwares\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		//driver.get("https://demo.actitime.com");
		driver.navigate().to("https://demo.actitime.com");
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
		driver.findElement(By.xpath("//a[@id='loginButton']")).click();
		
		//driver.findElement(By.xpath("//input[@class='inputtext login_login_form_input_box'][@name='email']")).sendKeys("Theo");- facebook elements example
	}

}
