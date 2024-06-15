package runner;
import org.json.simple.JSONObject;
import org.json.simple.parser.ParseException;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;
import utils.Setup;
import utils.Utility;

import java.io.IOException;

public class TestRunner extends Setup {
    LoginPage loginPage;
    HomePage homePage;
    @Test(priority = 1)
    public void doLogin() throws IOException, ParseException {
        loginPage = new LoginPage(driver);
        JSONObject userObject = Utility.loadJSONFile("./src/test/resources/User.json");
        String userName= (String) userObject.get("userName");
        String password= (String) userObject.get("password");
        loginPage.doLogin(userName,password);

        // Assertion
        String actualResult= driver.findElement(By.className("product_label")).getText();
        String expectedResult= "Products";
        Assert.assertEquals(actualResult,expectedResult);
    }


    }



