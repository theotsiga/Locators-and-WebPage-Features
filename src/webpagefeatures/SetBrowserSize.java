package webpagefeatures;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetBrowserSize {

	public static void main(String[] args) {

		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\romse\\Desktop\\Softwares\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		System.out.println(driver.manage().window().getSize());
		Dimension d = new Dimension (500,200);
		driver.manage().window().setSize(d);
		System.out.println(driver.manage().window().getSize());
		
	}

}
