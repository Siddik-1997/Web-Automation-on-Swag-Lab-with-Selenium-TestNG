package runner;
import org.json.simple.JSONObject;
import org.json.simple.parser.ParseException;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.CartPage;
import pages.LoginPage;
import utils.Setup;
import utils.Utility;

import java.io.IOException;

public class LoginTestRunner extends Setup {
    LoginPage loginPage;
    @Test(priority = 1, description = "Login with Invalid credentials")

    public void doInvalidLogin() throws IOException, ParseException {
        loginPage = new LoginPage(driver);
        JSONObject userObject = Utility.loadJSONFile("./src/test/resources/User.json");
        String userName= (String) userObject.get("userName");
        loginPage.doLogin(userName,"asdF1234");

        // Assertion
        String actualResult= driver.findElement(By.tagName("h3")).getText();
        String expectedResult="Epic sadface: Username and password do not match any user in this service";
        Assert.assertTrue(actualResult.contains(expectedResult));

    }
    @Test(priority = 2, description = "Login with Valid credentials")
    public void doLogin() throws IOException, ParseException {
        loginPage = new LoginPage(driver);
        JSONObject userObject = Utility.loadJSONFile("./src/test/resources/User.json");
        String userName= (String) userObject.get("userName");
        String password= (String) userObject.get("password");
        loginPage.clearField();
        loginPage.doLogin(userName,password);

        // Assertion
        String actualResult= driver.findElement(By.className("product_label")).getText();
        String expectedResult= "Products";
        Assert.assertEquals(actualResult,expectedResult);
    }
    @Test(priority = 3)
    public void doLogout(){
        loginPage= new LoginPage(driver);
        loginPage.doLogout();
    }

    }



