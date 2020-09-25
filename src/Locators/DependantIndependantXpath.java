package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DependantIndependantXpath {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\romse\\Desktop\\Softwares\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		//driver.get("https://www.selenium.dev/downloads");
		//driver.findElement(By.xpath("//td[.='Java']/..//a[.='Download']")).click();
		//driver.findElement(By.xpath("////td[.='Ruby']/..//a[.='Download']")).click();
		
		driver.get("http://qspiders.com/contact");
		driver.manage().window().maximize();
		//driver.findElement(By.xpath("//a[contains(text(),'Qspiders Us')]/../../.././/div[.='+1 (415) 429-3957']"));
		WebElement Us = driver.findElement(By.xpath("//a[contains(text(),'Qspiders Us')]/../../.././/div[.='+1 (415) 429-3957']"));
		System.out.println("Q Spider Us"+Us.getText());
	}	
	
}
