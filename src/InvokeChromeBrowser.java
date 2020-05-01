import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InvokeChromeBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Downloads\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.google.com/");  //extracting the url or hit url on the browser
		driver.get("https://www.yahoo.com");
		//System.out.println(driver.getTitle());  // validate if the page title is correct
		//System.out.println(driver.getPageSource());  //used to get the page source in console
		//System.out.println(driver.getCurrentUrl());   //validate if u r landed on correct URL
		driver.navigate().back();
		driver.close(); //it closes current browser
		driver.quit();  // it closes all the browser opened by the script
		
	}

}
