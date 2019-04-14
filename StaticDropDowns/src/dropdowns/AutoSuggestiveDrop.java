package dropdowns;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestiveDrop {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\everybody\\Desktop\\selenium\\library\\chromedriver.exe");
		// autosugestive dropdowns
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		driver.findElement(By.id("//input[@value='Mumbai']")).clear();
		//driver.findElement(By.id("//input[@value='Mumbai']")).sendKeys("MUM");
		
	}

}
