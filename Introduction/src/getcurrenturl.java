import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getcurrenturl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\everybody\\Desktop\\selenium\\library\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		String url = driver.getCurrentUrl();
		System.out.println(url);
		//driver.get("https://www.yahoo.com/");
		driver.navigate().to("https://www.yahoo.com/");
		url = driver.getCurrentUrl();
		System.out.println(url);
		

	}

}
