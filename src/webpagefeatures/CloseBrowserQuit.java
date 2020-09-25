package webpagefeatures;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseBrowserQuit {

	public static void main(String[] args) {

		
   System.setProperty("webdriver.chrome.driver", "C:\\Users\\romse\\Desktop\\Softwares\\chromedriver.exe");
   
   WebDriver driver=new ChromeDriver();
   //driver.close();
   driver.quit();
   
   
		
		
	}

}
