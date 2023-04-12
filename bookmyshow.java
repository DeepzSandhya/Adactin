package Test;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class bookmyshow {
	
	public static void main(String[] args) throws InterruptedException, AWTException {
		
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\Deepak\\\\eclipse-workspace\\\\Selenium\\\\New\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://in.bookmyshow.com/explore/home/chennai");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		WebElement search = driver.findElement(By.xpath("//span[text()='Search for Movies, Events, Plays, Sports and Activities']"));
		search.click();
		
		WebElement searchtype = driver.findElement(By.xpath("//input[@class='sc-hCaUpS cLnzvB']"));
		searchtype.sendKeys("Tu jhooti main makar");
		
		Thread.sleep(3000);
		
		Robot r = new Robot();
		
		r.keyPress(KeyEvent.VK_PAGE_DOWN);
		r.keyRelease(KeyEvent.VK_PAGE_DOWN);
		
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		Thread.sleep(3000);
		
		WebElement Booktickets = driver.findElement(By.xpath("(//div[@class='styles__CtaText-sc-1vmod7e-2 bBLrVT'])[1]"));
		Booktickets.click();
		
		Thread.sleep(3000);
		
		WebElement showtime = driver.findElement(By.xpath("(//div[@class='showtime-pill-container _available'])[1]"));
		showtime.click();
		
		Thread.sleep(5000);
				
		WebElement accept = driver.findElement(By.xpath("(//div[text()='Accept'])[1]"));
		accept.click();

		WebElement seat = driver.findElement(By.xpath("//li[@id='pop_2']"));
		seat.click();
		
		
	}

}
