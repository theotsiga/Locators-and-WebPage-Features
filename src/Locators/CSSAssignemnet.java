package Locators;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSAssignemnet {

	public static void main(String[] args) {

System.setProperty("webdriver.chrome.driver", "C:\\Users\\romse\\Desktop\\Softwares\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		//driver.get("https://demo.actitime.com");
		//driver.findElement(By.cssSelector("input[placeholder='Username']")).sendKeys("admin");
		//driver.findElement(By.cssSelector("input[name='pwd']")).sendKeys("manager");
		//driver.findElement(By.linkText("Login")).click();
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.findElement(By.cssSelector("input[name='txtUsername']")).sendKeys("Admin");
		driver.findElement(By.cssSelector("input[name='txtPassword']")).sendKeys("admin123");
		driver.findElement(By.cssSelector("input[value='LOGIN']")).click();
			

	}

}
