import org.openqa.selenium.WebDriver;
import org.openqa.selenium.InternetExplorerDriver.InternetExplorerDriver;

public class testCase3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//selenium code-
		
		//Create Driver object for InternetExplorerDriver Browser
		
		/*Class name= ChromeDriver;
		
		x driver=new x();*/
		
		//invoke .exe file first
//gecko driver

System.setProperty("webdriver.ie.driver", "C:\\Users\\aishia\\Downloads\\MicrosoftWebDriver.exe");

		WebDriver driver=new InternetExplorerDriver();
		
		
		driver.get("http://google.com");
		System.out.println(driver.getTitle());


	}

}
