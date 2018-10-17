package karthi2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



public class p2 {
		static {
		String key="webdriver.gecko.driver";
		String value="./driver/geckodriver.exe";
		System.setProperty(key, value);
		}
		public static void test(WebDriver driver) {
			 driver.get("http://www.facebook.com");
			 String title=driver.getTitle();
			 System.out.println(title);
			 driver.close();
		}
		public static void main(String[] args) {
			
		WebDriver driver= new FirefoxDriver();
		test(driver);
		driver.close();
		}







		
		
		// TODO Auto-generated method stub

	}

}
