package webpagefeatures;


import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetSetBrowserPosition {

	public static void main(String[] args) {

System.setProperty("webdriver.chrome.driver", "C:\\Users\\romse\\Desktop\\Softwares\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		System.out.println(driver.manage().window().getPosition().getX());
		System.out.println(driver.manage().window().getPosition().getY());
		Point p = new Point(30, 150);
		driver.manage().window().setPosition(p);
		
		System.out.println(driver.manage().window().getPosition().getX());
		System.out.println(driver.manage().window().getPosition().getX());
		
	}

}
