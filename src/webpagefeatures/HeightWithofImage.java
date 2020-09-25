package webpagefeatures;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HeightWithofImage {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\romse\\Desktop\\Softwares\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.myntra.com/");
		driver.manage().window().maximize();
		
		WebElement image = driver.findElement(By.xpath("//img[@src='http://assets.myntassets.com/"
				+ "w_196,c_limit,fl_progressive,dpr_2.0/assets/images/2020/6/22/c68dc840-343f-4996-8f44-fefbf1d43d7e1592765512400-sass.jpg"));
		System.out.println(image.getSize().getHeight());
		System.out.println(image.getSize().getWidth());
		driver.close();
		
	}

}
