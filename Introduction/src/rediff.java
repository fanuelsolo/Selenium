import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class rediff {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\everybody\\Desktop\\selenium\\library\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();// means create chromedriver in webdriver interface
		driver.get("https://www.rediff.com/");
		//tagname[attribute=’value’] 
		//driver.findElement(By.cssSelector("a[title='Already a user? Sign in']")).click();
		// NO NEED TO WRITE THE WHOLE VALUE
		// use htis preferable Tagname[attribute*=’value’] 
		driver.findElement(By.cssSelector("a[title*='Sign in']")).click();
		driver.findElement(By.xpath("//input[@id='login1']")).sendKeys("username");
		driver.findElement(By.xpath("//input[@name='passwd']")).sendKeys("PASSWORD");
		//tagname[contains(@attribute,’value’)]
		driver.findElement(By.xpath("//input[contains(@value,'Go')]")).click();
		
		driver.findElement(By.xpath("//a[@class='forgot-password']")).click();
		
		
		driver.quit();

	}

}

//.fb_logo
//i[@class='fb_logo img sp_7TPb4rZ1w7k_1_5x sx_e4d30e']
