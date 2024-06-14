package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class HomePage {

    public HomePage(WebDriver driver){

        PageFactory.initElements(driver, this);
    }



    }

