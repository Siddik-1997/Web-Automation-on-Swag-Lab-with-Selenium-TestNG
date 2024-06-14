package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

import java.time.Duration;

public class Setup {

 public WebDriver driver;
 @BeforeTest
 public void setUp(){
     driver = new ChromeDriver();
     driver.manage().window().maximize();
     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
     driver.get("https://www.saucedemo.com/v1/");
 }

 public void driverClose(){
     driver.quit();
 }

}