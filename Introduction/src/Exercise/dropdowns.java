package Exercise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class dropdowns {

	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\everybody\\Desktop\\selenium\\library\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		/*driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		//Select s = new Select(driver.findElement(By.id("ctl00_mainContent_ddl_originStation1")));
		//s.selectByValue("AIP");
		driver.findElement(By.xpath("//a[@value='DEL']")).click();
		driver.findElement(By.id("ctl00_mainContent_ddl_destinationStation1_CTXT")).click();
		 driver.findElement(By.xpath("(//a[@value='HYD'])[2]")).click();  
		driver.findElement(By.id("ctl00_mainContent_view_date1")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/div[1]/table/tbody/tr[5]/td[6]/a")).click();*/
		
		driver.manage().window().maximize();
		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(4000);
		
		//driver.findElement(By.id("hrefIncAdt")).click();
		
		int i=1;
		while (i<5) {
			driver.findElement(By.id("hrefIncAdt")).click();
			i++;
			
		}
		driver.findElement(By.xpath("//input[@value='Done']")).click();
		
		/*for(int i=1;i<5;i++) {
			driver.findElement(By.id("hrefIncAdt")).click();
			
			
		}
		driver.findElement(By.xpath("//input[@value='Done']")).click();

	}*/
}
}
