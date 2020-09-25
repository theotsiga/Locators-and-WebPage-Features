package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathTraversing {

	public static void main(String[] args) {

System.setProperty("webdriver.chrome.driver", "C:\\Users\\romse\\Desktop\\Softwares\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/romse/Desktop/HTML/Transversing.html");
		driver.manage().window().maximize();

		//html to D
		driver.findElement(By.xpath("html//div[2]/input[2]")).click();
		
		//html to E
		driver.findElement(By.xpath("html//div[3]/input[1]")).click();
		
		//html B to Body to F
		driver.findElement(By.xpath("html//div[1]/input[2]/../..//div[3]/input[2]")).click();
		
		//html B to html to F
		driver.findElement(By.xpath("html//div[2]/input[2]/../../..//div[3]/input[2]")).click();
		
		
	}

}
