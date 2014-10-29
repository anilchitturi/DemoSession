package inheritance;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test1 extends Driver {

	 private static WebDriver driver = null;
	 
	    public static void main(String[] args) throws InterruptedException {
	    	
//	   Driver dv = new Driver();
//	   driver= dv.driverInstance("firefox");
 	  driver= driverInstance("firefox");

	   System.out.println("printin obejcet driver " +driver);

     // And now use this to visit Google
     driver.get("http://www.google.com");
     driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
     
     Thread.sleep(3000);

     // Find the text input element by its name
     WebElement element = driver.findElement(By.name("q"));

     // Enter something to search for
     element.sendKeys("Cheese!");

     // Now submit the form. WebDriver will find the form for us from the element
     element.submit();

     // Check the title of the page
     System.out.println("Page title is: " + driver.getTitle());

     driver.quit();
	}


}
