package Locators;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathByContainsAssingment {

	public static void main(String[] args) throws InterruptedException {
		
		//tag[contains@AttributeName,'(AttributeValue)]
				//tag[contains(text(),'textvalue')]

System.setProperty("webdriver.chrome.driver", "C:\\Users\\romse\\Desktop\\Softwares\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		//driver.get("https://demo.actitime.com/");
		driver.navigate().to("https://www.netflix.com/gb/login");
		driver.manage().window().maximize();
		
	
		// driver.findElement(By.xpath("//a[contains(text(),'Forgot')]")).click();

		
		driver.findElement(By.xpath("//a[contains(text(),'Sign up now')]")).click();
		driver.findElement(By.xpath("//input[contains(@name,'email')]")).sendKeys("me@hotmail.com");
		
		
		
	}

}
