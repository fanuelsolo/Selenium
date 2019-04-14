import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class parentChildTraverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\Users\\everybody\\Desktop\\selenium\\library\\chromedriver.exe");
WebDriver driver = new ChromeDriver();

driver.get("https://www.seleniumeasy.com/");
//driver.manage().window().maximize();
driver.findElement(By.xpath("//*[@id='navbar-collapse']/nav/ul/li[1]/a")).click();
System.out.println("HOME");
driver.findElement(By.xpath("//*[@id='navbar-collapse']/nav/ul/li[2]/a")).click();
System.out.println("selenium");
//driver.findElement(By.xpath("//*[@id='navbar-collapse']/nav/ul/li[2]/ul/li[1]")).click();
//System.out.println("selnium java");
//driver.findElement(By.xpath("//*[@id='navbar-collapse']/nav/ul/li[2]/ul/li[2]a")).click();
//System.out.println("selnium python");
driver.findElement(By.xpath("//*[@id=\"navbar-collapse\"]/nav/ul/li[3]/a")).click();
System.out.println("selnium testNG");











	}
	
	

}
