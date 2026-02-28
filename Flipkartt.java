package All_actions_learn;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Flipkartt {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		
		driver.get("https://www.flipkart.com/");
		
      
        driver.findElement(By.name("q")).sendKeys("Bluetooth Speakers",Keys.ENTER);
        
		
		driver.findElement(By.xpath("//div[text()='Brand']")).click();
		Thread.sleep(2000);

		
		driver.findElement(By.xpath("//div[text()='boAt']")).click();
		Thread.sleep(2000);

		
		WebElement h = driver.findElement(By.xpath("//div[contains(text(),'4★ & above')]"));
		h.click();
		Thread.sleep(2000);
		
			
		WebElement s = driver.findElement(By.xpath("//div[contains(text(),'Price -- Low to High')]"));
		s.click();
		Thread.sleep(2000);
		
		
        WebElement firstProduct = driver.findElement(By.xpath("//a[@title=\"boAt Stone 110, 15 Hrs Playback,"
        		+ " TWS Connectivity, Compact Design 3 W Bluetooth Speaker\"]"));
        

        firstProduct.sendKeys(Keys.CONTROL, Keys.RETURN);
        
        
        Set<String> x = driver.getWindowHandles();

        System.out.println(x);

        Iterator<String> S = x.iterator();

        S.next();

        String windows2 = S.next();

        driver.switchTo().window(windows2);
        
        
        List<WebElement> offers = driver.findElements(By.xpath("//span[text()='Available offers']/ancestor::div//li"));

        System.out.println("Offers Count = " + offers.size());
        
        
        WebElement addtocart = driver.findElement(By.xpath("//div[contains(text(),'Add to cart')]"));
		addtocart.click();

        
		WebElement product = driver.findElement(By.xpath("//span[contains(text(),'Cart')]"));
	    product.click();
		
		
  }

}
