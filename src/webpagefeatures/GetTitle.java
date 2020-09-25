package webpagefeatures;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTitle {

	public static void main(String[] args) {

		
  System.setProperty("webdriver.chrome.driver","C:\\Users\\romse\\Desktop\\Softwares\\chromedriver.exe");		
		 
  WebDriver driver = new ChromeDriver();
		driver.get("https://www.myntra.com");
		//driver.get("https://www.sky.com");
		
		String title = driver .getTitle();
		
		//System.out.println(driver.getTitle());
		System.out.println(title);
		
		}

}
