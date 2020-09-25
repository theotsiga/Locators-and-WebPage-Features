package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathByGroupIndex {

	public static void main(String[] args) {

		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\romse\\Desktop\\Softwares\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		driver.findElement(By.xpath("//input[@class='inputtext inputtext _58mg _5dba _2ph-'](1)")).sendKeys("Theo"); //dead code 
		driver.findElement(By.xpath("//input[@class='inputtext login_form_input box'](2)")).sendKeys("change"); // dead code 
	}

}
