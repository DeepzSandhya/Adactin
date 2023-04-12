package Test;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import main.Baseclass;

public class Nyka extends Baseclass {
	
	public static void main(String[] args) throws InterruptedException {
		
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\Deepak\\eclipse-workspace\\Selenium\\New\\chromedriver.exe");

		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.nykaa.com/sp/new-customers/new-customers?utm_content=ads&utm_source=GooglePaid&utm_medium=search&utm_campaign=Search_Nykaa_NCA&gclid=EAIaIQobChMIg9e94Izo_QIVmAsrCh3KhgDuEAAYASAAEgKsQfD_BwE");
		driver.manage().window().maximize();
		
		Actions a = new Actions(driver);
		
		WebElement Makeup = driver.findElement(By.xpath("(//a[text()='makeup'])[2]"));
		a.clickAndHold(Makeup).perform();
		
		WebElement Face = driver.findElement(By.xpath("//a[text()='Face Primer']"));
		Face.click();
		
		Thread.sleep(3000);
		
		Set<String> windowhandles=driver.getWindowHandles();
		for(String WH: windowhandles) {
			
			String s = driver.switchTo().window(WH).getTitle();
			System.out.println(s);
		}
		
		WebElement Lakme = driver.findElement(By.xpath("//div[text()='Lakme Absolute Blur Perfect Makeup Primer']"));
		a.clickAndHold(Lakme).perform();
		Thread.sleep(3000);

		
		WebElement ATB = driver.findElement(By.xpath("//span[@class='btn-text'][1]"));
		ATB.click();
		Thread.sleep(3000);
		
		WebElement ATBclick = driver.findElement(By.xpath("//button[@class='css-g4vs13']"));
		ATBclick.click();
		Thread.sleep(3000);
		
		WebElement fram = driver.findElement(By.xpath("//iframe[@class='css-acpm4k']"));
        driver.switchTo().frame(fram);	
		Thread.sleep(3000);
        
        WebElement productproceed = driver.findElement(By.xpath("//div[@class='css-15vhhhd e25lf6d4']"));
        productproceed.click();
		Thread.sleep(5000);
		
		WebElement contguest = driver.findElement(By.xpath("//button[text()='Continue as guest']"));
		contguest.click();
		Thread.sleep(5000);
		
		WebElement pincode = driver.findElement(By.xpath("//input[@placeholder='Pincode']"));
	    pincode.sendKeys("600093");
	    Thread.sleep(6000);
	    
//	    WebElement city = driver.findElement(By.xpath("//input[@placeholder='City']"));
//	    city.sendKeys("chennai");
//	    Thread.sleep(3000);
//	    
//	    WebElement State = driver.findElement(By.xpath("//input[@placeholder='State']"));
//	    State.sendKeys("Tamil Nadu");
//	    Thread.sleep(3000);
	    
		WebElement HNO = driver.findElement(By.xpath("//input[@placeholder='House/ Flat/ Office No.']"));
		HNO.sendKeys("NO:2");
		Thread.sleep(3000);
		
		WebElement Area = driver.findElement(By.xpath("//textarea[@placeholder='Road Name/ Area /Colony']"));
		Area.sendKeys("Saligaram");
		Thread.sleep(3000);
		
		WebElement Name = driver.findElement(By.xpath("//input[@placeholder='Name']"));
		Name.sendKeys("Sandhya");
		Thread.sleep(3000);

		WebElement PHNO = driver.findElement(By.xpath("//input[@placeholder='Phone']"));
		PHNO.sendKeys("7305749676");
		Thread.sleep(3000);
		
		WebElement Emailid = driver.findElement(By.xpath("//input[@placeholder='Email ID']"));
		Emailid.sendKeys("sandhyadeepz19@gmail.com");
		Thread.sleep(3000);

		WebElement shipTo = driver.findElement(By.xpath("//button[text()='Ship to this address']"));
		shipTo.click();
	}

}
