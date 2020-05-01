import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicDropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Downloads\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	    driver.get("https://www.spicejet.com/");
	    driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
	    //driver.findElement(By.xpath("//a[@text='Amritsar (ATQ)']")).click();
	    driver.findElement(By.xpath("//a[@value='SXR']")).click();
	    
	  //Thread.sleep(2000);
	  //driver.findElement(By.xpath("(//a[@value='JAI'])[2]")).click(); ///[2] is used when there is 2 xpath found and we have to select second one
      //driver.findElement(By.cssSelector("a.ui-state-default.ui-state-highlight.ui-state-active")).click(); //validate calender for current date
	}

}
