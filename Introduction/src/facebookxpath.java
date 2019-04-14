import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class facebookxpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\Users\\everybody\\Desktop\\selenium\\library\\chromedriver.exe");
    WebDriver driver = new ChromeDriver();
    driver.get("https://www.facebook.com/");
    driver.get("http://facebook.com");
	driver.get("https://en-gb.facebook.com/login/");
	driver.findElement(By.linkText("Facebook")).click();
	//driver.findElement(By.linkText("Create New Account")).click();
	driver.findElement(By.id("email")).sendKeys("fanjuy@yahoo.com");
	driver.findElement(By.name("pass")).sendKeys("1234567");
	driver.findElement(By.cssSelector("input[value='Log In']")).click();
	System.out.println(driver.findElement(By.xpath("//*[@role='alert']")).getText());
    driver.findElement(By.xpath("//input[@type='email']")).sendKeys("fanjjuy");
    driver.findElement(By.xpath("//input[@type='password']")).sendKeys("123456");
    driver.findElement(By.xpath("//*[@value='Log In']")).click();
    driver.findElement(By.linkText("Forgot account?")).click();
    //System.out.println(driver.findElement(By.xpath("//*[@role='alert']")).getText());
    


    
    
	}

}
