import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class navigateBack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*class name = x;
		x driver = new x();*
		if u want to automate in chrome browser u have to create an object for chrome driver class
		2. create driver object for chrome browser
		3. strictly implement methods for webdriver interface. so u have to give that webdriver 
		a knowlegde to your object sothat it will automate each ui in your browser hence
		*/
		
//		class name = chromedriver;
//		chromedriver driver = new chromedriver();
		//4 .invoke the browser or the .exe file first. these two steps are responsible for invoking the browser
System.setProperty("webdriver.chrome.driver", "C:\\Users\\everybody\\Desktop\\selenium\\library\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		
		// how to tell/display  the title of the page using selenium
		
		
	driver.get("http://google.com");
	
		
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.get("http://yahoo.com");
		driver.navigate().back();
		driver.close();// closes current browser
		driver.quit();// closes all browsers opended by selenium
	

}
}