import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class salesForce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\everybody\\Desktop\\selenium\\library\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://login.salesforce.com");
		driver.manage().window().maximize();
		
		//driver.findElement(By.className("input r4 wide mb16 mt8 username")).sendKeys("hello");
		// invalid selector: Compound class names not permitted
		//driver.findElement(By.xpath("//input[@id='username']")).sendKeys("hello");
		driver.findElement(By.cssSelector("#username")).sendKeys("hi");
		//driver.findElement(By.xpath("//input[@name='pw']")).sendKeys("123");// or//*[@name='pw']
		driver.findElement(By.cssSelector("#password")).sendKeys("1254");
		driver.findElement(By.cssSelector("input[value='Log In']")).click();// or #Log In

		driver.quit();
	}

}

//a[contains(text(),'Forgotten account?')]
