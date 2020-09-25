package webpagefeatures;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCurrentURL {

	public static void main(String[] args) {

		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\romse\\Desktop\\Softwares\\chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.bbc.co.uk/football");
		driver.get("https://www.nike.co.uk");
		
		String title = driver .getTitle();
		
		System.out.println(driver.getCurrentUrl());
		System.out.println(title);
		driver.close();
		
	}

}
