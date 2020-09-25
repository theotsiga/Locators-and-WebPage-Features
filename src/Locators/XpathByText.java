package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathByText  {

	public static void main(String[] args) {
		
		//tagname[text()='textValue'] or //tagname[.='textvalue']

System.setProperty("webdriver.chrome.driver", "C:\\Users\\romse\\Desktop\\Softwares\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		//driver.get("https://www.facebook.com");
		
		//WebElement link = driver.findElement(By.xpath("//a[text()='Forgotten account?'"));
		//WebElement link = driver.findElement(By.xpath("//a[.='Forgotten account?']"));
		//System.out.println(link.getText());
		//link.click();
		
		driver.get("https://demo.actitime.com");
		//driver.findElement(By.xpath("//div[='Login']")).click();
		driver.findElement(By.xpath("//div[contains(text(),'Login')]")).click();
			
	}

}
