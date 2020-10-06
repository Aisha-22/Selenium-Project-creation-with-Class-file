import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.FirefoxDriver.FirefoxDriver;

public class testCase2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//selenium code-
		
				//Create Driver object for Firefox Browser
				
				/*Class name= ChromeDriver;
				
				x driver=new x();*/
				
				//invoke .exe file first
		//gecko driver
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\aishia\\Downloads\\geckodriver.exe");
		
				WebDriver driver=new FirefoxDriver();
				
				
				driver.get("http://google.com");
				System.out.println(driver.getTitle());

	}

}
