import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestiveDropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Downloads\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	    driver.get("https://www.yatra.com//");
	    WebElement source=driver.findElement(By.id("BE_flight_origin_city"));
	    source.clear();
	    source.sendKeys("PAT");
	    Thread.sleep(2000);
	    source.sendKeys(Keys.ENTER);
	    WebElement destination=driver.findElement(By.id("BE_flight_arrival_city"));
	    destination.clear();
	    destination.sendKeys("BLR");
	    Thread.sleep(2000);
	    destination.sendKeys(Keys.ENTER); 

	    
	    
	    
	    
	    
	}

}
