package radiobutton;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\everybody\\Desktop\\selenium\\library\\chromedriver.exe");
		// autosugestive dropdowns
		WebDriver driver = new ChromeDriver();
		driver.get("http://echoecho.com/htmlforms10.htm");
		driver.findElement(By.xpath("//input[@value='Cheese']")).click();
		
		// requirements:
		//1. how many radiobuttons present
		//2. then select one radiobutton
		
		int x = driver.findElements(By.xpath("//input[@name='group1']")).size();
		System.out.println(x);

	}

}