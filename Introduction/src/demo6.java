import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\everybody\\Desktop\\selenium\\library\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//driver.get("http://salesforce.com");
		driver.get("https://login.salesforce.com/");
		driver.findElement(By.id("username")).sendKeys("fanjuy@yahoo.com");
		driver.findElement(By.name("pw")).sendKeys("1234567");
		//driver.findElement(By.className("button 4e t yui")).sendKeys("12345");//error..
		//driver.findElement(By.id("Login")).click();or
		driver.findElement(By.xpath("//*[@id=\"Login\"]")).click();// or use single qote "//*[@id=\"Login\"]"
		// or driver.findElement(By.xpath("//*[@id='loginbutton']")).click();
		//driver.findElement(By.cssSelector("input#Login.button.r4.wide.primary")).click();
		System.out.println(driver.findElement(By.cssSelector("div#error.loginError")).getText());
		driver.close();
	}

}

