import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class facebookCSS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\Users\\everybody\\Desktop\\selenium\\library\\chromedriver.exe");
    WebDriver driver = new ChromeDriver();
    driver.get("https://www.facebook.com/");
    //driver.get("https://www.google.com/");// hit url on the browser
	// System.out.println(driver.getTitle());// validate if your page title is correct
	// System.out.println(driver.getCurrentUrl());// validate if u landed on correct url
	 //System.out.println(driver.getPageSource());// print page sourse
    driver.findElement(By.cssSelector("input[type='email']")).sendKeys("fanjjuy");
    driver.findElement(By.cssSelector("input[type='password']")).sendKeys("123456");
    driver.findElement(By.cssSelector("*[value='Log In']")).click();
    
    //driver.findElement(By.xpath("//*[@id=\"login_form\"]/table/tbody/tr[3]/td[2]/div/a")).click();
   // driver.findElement(By.xpath("//*[@id=\"loginbutton\"]")).click();
    System.out.println(driver.findElement(By.cssSelector("*[role='alert']")).getText());
    


    
    
	}

}
