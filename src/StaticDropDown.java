import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class StaticDropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Downloads\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	    driver.get("https://www.spicejet.com/");
	    //driver.findElement(By.id("divpaxinfo")).click();
	    //driver.findElement(By.id("ctl00_mainContent_ddl_Adult")).sendKeys("4");
	    //Select s = new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Adult")));
	    //s.selectByValue("3");
	    //s.selectByVisibleText("2");
	    Select s = new Select(driver.findElement(By.name("ctl00$mainContent$DropDownListCurrency")));
	    s.selectByValue("AED");
		

	}

}

