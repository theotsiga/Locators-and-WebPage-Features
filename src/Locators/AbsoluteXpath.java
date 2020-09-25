package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AbsoluteXpath {

	public static void main(String[] args) {

System.setProperty("webdriver.chrome.driver", "C:\\Users\\romse\\Desktop\\Softwares\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/romse/Desktop/HTML/Demo2.html");
		driver.findElement(By.xpath("/html/body/input[1]")).sendKeys("Theo");
		driver.findElement(By.xpath("/html/body/input[2]")).sendKeys("Jojo");
		
	}

}
