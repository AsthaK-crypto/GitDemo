import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class locator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Downloads\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		//driver.get("https://login.salesforce.com/");
		//driver.findElement(By.id("username")).sendKeys("Hello");
		//driver.findElement(By.xpath("//*[@id='username']")).sendKeys("hello");;
		//driver.findElement(By.cssSelector("#username")).sendKeys("hello");;
		//driver.findElement(By.name("pw")).sendKeys("123");
		//driver.findElement(By.id("Login")).click();
		//System.out.println(driver.findElement(By.cssSelector("#error")).getText()); //get.text is used to extract the text from the UI
		
		driver.get("https://www.rediff.com/");
		driver.findElement(By.xpath("//a[contains(@class,'signin')]")).click();
		driver.findElement(By.cssSelector("input[type*='text']")).sendKeys("hello"); //used x path and css by regular expression
	}

}
