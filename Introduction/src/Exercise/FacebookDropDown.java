package Exercise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookDropDown {
	public void propertySelectValues() {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\everybody\\Desktop\\selenium\\library\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		WebElement monthDropDown = driver.findElement(By.id("month"));
		
		
	}

}
