package runner;
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
    }


    }



