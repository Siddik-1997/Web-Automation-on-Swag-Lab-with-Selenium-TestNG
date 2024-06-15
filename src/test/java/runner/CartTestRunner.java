package runner;

import org.json.simple.JSONObject;
import org.json.simple.parser.ParseException;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.CartPage;
import pages.LoginPage;
import utils.Setup;
import utils.Utility;

import java.io.IOException;

public class CartTestRunner extends Setup {
    CartPage cartPage;
    LoginPage loginPage;
    @BeforeTest
    public void doLogin() throws IOException, ParseException {
        loginPage = new LoginPage(driver);
        JSONObject userObject = Utility.loadJSONFile("./src/test/resources/User.json");
        String userName= (String) userObject.get("userName");
        String password= (String) userObject.get("password");
        loginPage.clearField();
        loginPage.doLogin(userName,password);
    }
    @Test(priority = 1)
    public void addTOCart() throws InterruptedException, IOException, ParseException {
        Thread.sleep(500);
        cartPage=new CartPage(driver);
        cartPage.addItem();
        cartPage.checkout();

        //Assertion
        String actualText=driver.findElement(By.className("complete-header")).getText();
        String expectedResult="THANK YOU FOR YOUR ORDER";
        Assert.assertTrue(actualText.contains(expectedResult));

    }
}
