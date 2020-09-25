package webpagefeatures;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyTitle {

	public static void main(String[] args) {



		System.setProperty("webdriver.chrome.driver", "C:\\Users\\romse\\Desktop\\Softwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.google.com");
		String actualTitle = driver.getTitle();

		if (actualTitle.equalsIgnoreCase("google"))
		{
			System.out.println("both titles are matching");
		}
		else
			System.out.println("both titles are not matching");

		{

		}
	}

	}

