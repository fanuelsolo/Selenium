
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class QAClickAcadmy {

public static void main(String[] args) {

System.setProperty("webdriver.chrome.driver", "C:\\Users\\everybody\\Desktop\\selenium\\library\\chromedriver.exe");

    WebDriver driver = new ChromeDriver();   
    //driver.get("http://www.qaclickacademy.com/");
   // driver.manage().window().maximize();
  

    driver.get("http://www.qaclickacademy.com/interview.php");
   // driver.findElement(By.xpath("//nav[@class='navbar-collapse collapse']/ul/li[4]")).click();
    

    //driver.findElement(By.xpath("//li[@id='tablist1-tab1']")).click();
    driver.findElement(By.xpath("//li[text()=' Appium ']")).click();
    

    System.out.println("Clicked on appium");
    
  driver.findElement(By.xpath("//div[@class='responsive-tabs responsive-tabs--enabled']/ul/li[2]")).click();
  System.out.println("clicked on selenium");
  driver.findElement(By.xpath("//div[@class='responsive-tabs responsive-tabs--enabled']/ul/li[3]")).click();
  System.out.println("clicked on sopaui");
  driver.findElement(By.xpath("//div[@class='responsive-tabs responsive-tabs--enabled']/ul/li[4]")).click();
  System.out.println("clicked on testing");
    /*driver.findElement(By.xpath("//li[@id='tablist1-tab1']/following-sibling::li[1]")).click();
    //driver.findElement(By.xpath("//li[@id='tablist1-tab2']")).click();

    System.out.println("clicked on selenium");

    driver.findElement(By.xpath("//li[@id='tablist1-tab1']/following-sibling::li[2]")).click();
   // driver.findElement(By.xpath("//li[@id='tablist1-tab3']")).click();

    System.out.println("clicked on soapUI");

    driver.findElement(By.xpath("//li[@id='tablist1-tab1']/following-sibling::li[3]")).click();
    //driver.findElement(By.xpath("//li[@id='tablist1-tab4']")).click();

    System.out.println("Clicked on testing");*/

}

}
