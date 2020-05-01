import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaAlertHandle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Downloads\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	    driver.get("https://rahulshettyacademy.com/AutomationPractice//");
	    driver.findElement(By.id("name")).sendKeys("Astha");
	    driver.findElement(By.id("alertbtn")).click();
	    System.out.println(driver.switchTo().alert().getText());
	    driver.switchTo().alert().accept();
	    driver.findElement(By.id("confirmbtn")).click();
	    System.out.println(driver.switchTo().alert().getText());
	    driver.switchTo().alert().dismiss();
	}

}
