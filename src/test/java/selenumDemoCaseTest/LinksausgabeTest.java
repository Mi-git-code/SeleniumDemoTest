package selenumDemoCaseTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LinksausgabeTest {
	
	private WebDriver driver;
	private String baseurl;
	
	@BeforeMethod
	public void setup() {
		
		
		//System.setProperty("webdriver.chome.driver", "./driver/chromedriver.exe");
		
		System.setProperty("webdriver.msedge.driver", "./driver/msedgedriver.exe");
		
		driver = new EdgeDriver();
		//driver = new ChromeDriver();
		
		//baseurl = "https://www.wikipedia.org/";
		
		//baseurl = "https://www.google.de/";
		
		baseurl = "https://www.blumenshop.de/blumenlexikon";
		
       //driver.get(baseurl);
		
		
	}
	
	@Test
	public void alleLinksAusgabe() {
		
	
		
		driver.get(baseurl);
		
		driver.findElement(By.linkText("Home")).click();
		
		driver.findElement(By.xpath("//a[@href='/blumenstrauss-verschicken/herbststrauss.html']")).click();
		
	List<WebElement> linksliste = driver.findElements(By.tagName("a"));
		for(WebElement links : linksliste) {
			System.out.println(links.getAttribute("href"));
		}
		
	}
	
	@AfterMethod
	public void teardown() throws InterruptedException {
		Thread.sleep(2000);
		//driver.quit();
	}

}
