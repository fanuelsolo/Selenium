import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ParentChild {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\everybody\\Desktop\\selenium\\library\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.seleniumeasy.com/");
	driver.findElement(By.xpath("//div[@class='region region-navigation']/section/form/div/div/div/input")).
		sendKeys("java");
	driver.findElement(By.xpath("//div[@class='input-group']/span/button/span")).click();

	}

}
