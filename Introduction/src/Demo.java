import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//selenium code-
		
		//Create Driver object for Chrome Browser
		
		/*Class name= ChromeDriver;
		
		x driver=new x();*/
		
		//invoke .exe file first
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\aishia\\Downloads\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://google.com");
		System.out.println(driver.getTitle());

	}

}
