package runner;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;
import utils.Setup;

public class TestRunner extends Setup {
    LoginPage loginPage;
    HomePage homePage;
    @Test(priority = 1)
    public void doLogin(){
        loginPage = new LoginPage(driver);
        loginPage.doLogin("standard_user", "secret_sauce");

        // Assertion
        String actualResult= driver.findElement(By.className("product_label")).getText();
        String expectedResult= "Products";
        Assert.assertEquals(actualResult,expectedResult);
    }


    }



