package selenumDemoCaseTest;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LetskodeitSeiteTesten {
	
	private WebDriver driver;
	
	private String url;
	
	@BeforeClass
	public void setup() {
		
		System.setProperty("webdriver.msedge.driver", "./driver.msedgedriver.exe");
		//System.setProperty("webdriver.msedge.driver", "./driver/msedgedriver.exe");
		
		driver = new EdgeDriver();
		url = "https://www.letskodeit.com/practice";
		driver.get(url);
		driver.manage().window().maximize();
		
	}
	
	                    //Test1: Radio-Button testen
	
	//Radiobutton, Checkbox, und Selectprodukt kann man Assert.assertTrue(element.isSelected()); verwenden.
	
	@Test(priority = 1)
	public void radioButtonclick() throws InterruptedException {
	
		
		WebElement radiobutton1 = driver.findElement(By.id("hondaradio"));
		radiobutton1.click();
		Assert.assertTrue(radiobutton1.isSelected());
		Thread.sleep(1000);
		
		WebElement radiobutton2 = driver.findElement(By.id("bmwradio"));
		radiobutton2.click();
		Assert.assertTrue(radiobutton2.isSelected());
		Thread.sleep(1000);
		
		WebElement radiobutton3 = driver.findElement(By.id("benzradio"));
		radiobutton3.click();
		Assert.assertTrue(radiobutton3.isSelected());
		Thread.sleep(1000);
		
		/*
		 * ohne Assert
		 * 
		 * driver.findElement(By.id("hondaradio")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("bmwradio")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("benzradio")).click();*/
		
		
		
	}
	
	                    //Test 2: Checkbox testen
	
	@Test (priority = 2)
	public void checkboxclick() throws InterruptedException {
		
		WebElement check1 = driver.findElement(By.id("bmwcheck"));
		check1.click();
		Assert.assertTrue(check1.isSelected());
		Thread.sleep(1000);
		
		WebElement check2 = driver.findElement(By.id("hondacheck"));
		check2.click();
		Assert.assertTrue(check2.isSelected());
		Thread.sleep(1000);
		
		WebElement check3 = driver.findElement(By.id("benzcheck"));
		check3.click();
		Assert.assertTrue(check3.isSelected());
		Thread.sleep(1000);
	}
	
	
	                       //Test 3: Produktauswahl testen (Honda-Car)
	
	@Test (priority = 3)
	public void selectprodukt() throws InterruptedException {
		
		WebElement cars = driver.findElement(By.xpath("//option[@value ='honda']")); 
		cars.click();
		Thread.sleep(1000);
		
		Assert.assertTrue(cars.isSelected());
		
	/*	
	 * oder code so schreiben ohne Assert
	 * 
	 * WebElement cars = driver.findElement(By.id("carselect")); 
		new Select(cars).selectByIndex(2);
		Thread.sleep(2000);
		new Select(cars).selectByIndex(0);
		Thread.sleep(2000);
		new Select(cars).selectByIndex(1);
		*/
		
	/*
	 * ohne Assert!
	 * 
	 * WebElement cars = driver.findElement(By.id("carselect")); 
		Select honda = new Select(cars); 
		honda.selectByIndex(2);
		Thread.sleep(2000);
		*/
	}
	
	             
	                      //Test 4: Produktauswahl testen (Benz-Car)
	
	@Test(priority = 4)
	public void benzselect() throws InterruptedException {
		
		WebElement cars = driver.findElement(By.xpath("//option[@value ='benz']")); 
		cars.click();
		Thread.sleep(1000);
		
		Assert.assertTrue(cars.isSelected());
		
	/*	
	 * oder code so schreiben ohne Assert!
	 * 
	 *  WebElement cars = driver.findElement(By.id("carselect")); 
	    Select benz = new Select(cars); 
		benz.selectByIndex(1);
		Thread.sleep(2000);
		*/
	
	}
	
	
	                      //Test 5: Produktauswahl testen (BMW-Car)
	
	@Test(priority = 5)
	public void bmwselect() throws InterruptedException {
		
		WebElement cars = driver.findElement(By.xpath("//option[@value ='bmw']")); 
		cars.click();
		Thread.sleep(1000);
		Assert.assertTrue(cars.isSelected());
		
		
	/*	
	 * ohne Assert!
	 * 
	 * WebElement cars = driver.findElement(By.id("carselect")); 
		Select bmw = new Select(cars); 
		bmw.selectByIndex(0);
		*/
	}
	
	
	                     //Test 6: Produktauswahl testen (Orange-Obst)
		
	@Test (priority = 6)
	public void orangeselect() throws InterruptedException {
		
		WebElement multiprod = driver.findElement(By.xpath("//option[@value='orange']"));
		multiprod.click();
		Thread.sleep(1000);
		Assert.assertTrue(multiprod.isSelected());
	}
	
	                  
	     
	
	
	                       //Test 8: Produktauswahl testen (Apple-Obst)
	
	@Test(priority = 8)
public void appleselect() throws InterruptedException {
		
		WebElement multiprod = driver.findElement(By.xpath("//option[@value='apple']"));
		multiprod.click();
		Thread.sleep(1000);
		Assert.assertTrue(multiprod.isSelected());
	}
	
	
	
	                          //Test 9: Produktauswahl testen (Peach-Obst)
	@Test(priority = 9)
public void peachselect() throws InterruptedException {
		
		WebElement multiprod = driver.findElement(By.xpath("//option[@value='peach']"));
		multiprod.click();
		
		Thread.sleep(1000);
		Assert.assertTrue(multiprod.isSelected());
	}
	
	
	
	                            //Test 10: Word in Suchfeld Schreiben
	@Test (priority = 10)
	public void wordsuche() throws InterruptedException {
		
		driver.findElement(By.id("autosuggest")).sendKeys("API ");
		
		Thread.sleep(2000);
	}
	

			
	
	
	@Test(priority = 11)
	public void anderelinkauf() throws InterruptedException {
		
		/*WebElement linkoffen = driver.findElement(By.id("openwindow"));
		linkoffen.click();
		Thread.sleep(1000);*/
		
		/*WebElement linkoffen1 = driver.findElement(By.id("opentab"));
		linkoffen1.click();
		Thread.sleep(1000);*/
	}
		
	
	
	                                //Test 11: Element Aktivieren und Deaktivieren testen
	@Test(priority = 12)
	public void buttonaktiv() throws InterruptedException {
		
         WebElement Feld = driver.findElement(By.id("enabled-example-input"));
         Feld.sendKeys("Software");

           WebElement desaktive = driver.findElement(By.id("disabled-button"));
           desaktive.click();
            Assert.assertTrue(desaktive.isEnabled());
        	Thread.sleep(3000);

			WebElement aktive = driver.findElement(By.id("enabled-button"));
			aktive.click();
			Assert.assertTrue(aktive.isEnabled());
			
	}
	
	
	
	@Test(priority = 13)
public void namesende() throws InterruptedException {
	boolean name = true;
	WebElement Name = driver.findElement(By.id("name"));
	Name.sendKeys("Nono");
	driver.findElement(By.id("alertbtn")).click();
	
	/*driver.findElement(By.id("confirmbtn")).click();
	*/
		
	}
	
		
	/*
	@Test(priority = 15)
	public void seiteneuladen() { //muss später gemacht werden. siehe den Class: Sieteladen in projekt setuto
		
		/*WebElement move = driver.findElement(By.id("mousehover"));
		Actions action = new Actions (driver);
		action.moveToElement(move);
		action.click().build().perform();/
		
		//WebElement neuladen = driver.findElement(By.linkText("Reload"));
		//neuladen.click();
	}
	
	*/
	
	@AfterClass
	public void teardown() throws InterruptedException {
		Thread.sleep(2000);
		driver.close();
		
	}

}
