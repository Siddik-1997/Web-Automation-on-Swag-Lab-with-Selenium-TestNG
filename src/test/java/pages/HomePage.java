package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class HomePage {

    public HomePage(WebDriver driver){

        PageFactory.initElements(driver, this);
    }



    public void testAssertion(String actual, String expected) throws InterruptedException {

        Assert.assertEquals(actual,expected);

    }

}
