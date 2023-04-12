package Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AdactinUsingTestNG {
	
	WebDriver driver;
	
@BeforeSuite
public void property() {
	
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Deepak\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");

}
@BeforeTest
public void driverlaunch() {
	
    driver = new ChromeDriver();

}
@BeforeClass

public void Browserlaunch() {
	
    driver.get("https://adactinhotelapp.com/index.php");
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    driver.manage().window().maximize();

}
@BeforeMethod

	public void Login() throws InterruptedException {
	
	WebElement Username = driver.findElement(By.xpath("//input[@id='username']"));
    Username.sendKeys("sandhyadeepz");
    
    WebElement Password = driver.findElement(By.xpath("//input[@id='password']"));
    Password.sendKeys("Sandhya19!");
    
    WebElement Login = driver.findElement(By.xpath("//input[@id='login']"));
    Login.click();
    
}

@Test
public void Details() throws InterruptedException {
	
	WebElement Location = driver.findElement(By.xpath("//select[@id='location']"));
    
    Select s = new Select(Location);
    s.selectByValue("New York");
    
    WebElement Hotels = driver.findElement(By.id("hotels"));
    
    Select s1 = new Select(Hotels);
    s1.selectByVisibleText("Hotel Sunshine");
    
    WebElement Roomtype = driver.findElement(By.id("room_type"));
    
    Select s2 = new Select(Roomtype);
    s2.selectByIndex(1);
    Thread.sleep(3000);

    
    WebElement RoomNos = driver.findElement(By.id("room_nos"));
    
    Select s3 = new Select(RoomNos);
    s3.selectByIndex(1);
    
    WebElement CheckIn = driver.findElement(By.id("datepick_in"));
    CheckIn.sendKeys("30/04/2023");
    
    WebElement Checkout = driver.findElement(By.id("datepick_out"));
    Checkout.sendKeys("01/05/2023");
    
    WebElement AdultRoom = driver.findElement(By.xpath("//select[@id='adult_room']"));
    
    Select s4 = new Select(AdultRoom);
    s4.selectByValue("1");
    Thread.sleep(3000);
    
    WebElement childRoom = driver.findElement(By.id("child_room"));
    
    Select s5 = new Select(childRoom);
    s5.selectByIndex(0);
    Thread.sleep(3000);

    
    WebElement Search = driver.findElement(By.id("Submit"));
    Search.click();
    
    WebElement Radiobtn = driver.findElement(By.xpath("//input[@id='radiobutton_0']"));
    Radiobtn.click();
    
    WebElement Continue = driver.findElement(By.xpath("//input[@id='continue']"));
    Continue.click();
    
    WebElement Firstname = driver.findElement(By.id("first_name"));
    Firstname.sendKeys("Sandhya");
    
    WebElement Lastname = driver.findElement(By.xpath("//input[@id='last_name']"));
    Lastname.sendKeys("Somalingam");
    
    WebElement Address = driver.findElement(By.id("address"));
    Address.sendKeys("Saligramam Vadapalani chennai 600093");
    
    WebElement cardNo = driver.findElement(By.id("cc_num"));
    cardNo.sendKeys("6056204340120214");
    
    WebElement cardType = driver.findElement(By.id("cc_type"));
    
    Select s6 = new Select(cardType);
    s6.selectByValue("VISA");
    
    WebElement ExpiryMonth = driver.findElement(By.id("cc_exp_month"));
    
    Select s7 = new Select(ExpiryMonth);
    s7.selectByValue("4");
    
    WebElement Expiryyear = driver.findElement(By.id("cc_exp_year"));
    
    Select s8 = new Select(Expiryyear);
    s8.selectByValue("2013");
    
    WebElement CVV = driver.findElement(By.id("cc_cvv"));
    CVV.sendKeys("793");
    
    WebElement Booknow = driver.findElement(By.id("book_now"));
    Booknow.click();
    
}
@AfterMethod
public void logout() {
	
	WebElement logout = driver.findElement(By.id("logout"));
    logout.click();
}

}


