import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckboxSelector {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Downloads\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	    driver.get("https://www.spicejet.com/");
	    driver.findElement(By.id("ctl00_mainContent_chk_SeniorCitizenDiscount")).click();
	    //driver.findElement(By.id("ctl00_mainContent_chk_SeniorCitizenDiscount")).isSelected();
	    System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());
	}

}
