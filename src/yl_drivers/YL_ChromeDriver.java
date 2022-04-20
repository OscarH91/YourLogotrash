package yl_drivers;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;

public class YL_ChromeDriver {
	
	private WebDriver driver;
	
	
	@BeforeClass
	public void setUp() {
	System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://automationpractice.com/index.php");
	//js = (JavascriptExecutor) driver;
	//vars = new HashMap<String, Object>();
	}

	@AfterClass
	public void tearDown() {
	//driver.quit();
	}
	
  @Test
  public void f() {
	  
  }
}
