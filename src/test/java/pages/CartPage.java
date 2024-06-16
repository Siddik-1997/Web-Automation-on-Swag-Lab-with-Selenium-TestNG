package pages;

import com.github.javafaker.Faker;
import org.json.simple.parser.ParseException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Utility;

import java.io.IOException;
import java.util.List;

public class CartPage {

    @FindBy(className = "btn_inventory")
    List<WebElement> addToCart;
    @FindBy(className = "svg-inline--fa")
    WebElement cartIcon;
    @FindBy(className = "checkout_button")
    WebElement checkoutButton;
    @FindBy(className = "form_input")
    List<WebElement> formInput;
    @FindBy(className = "btn_primary")
    WebElement btnContinue;
    @FindBy(className = "btn_action")
    WebElement btnFinish;

    WebDriver driver;

    public CartPage(WebDriver driver){

        PageFactory.initElements(driver, this);
    }

    public void addItem() throws InterruptedException {
        addToCart.get(0).click();
        addToCart.get(3).click();
        addToCart.get(5).click();
    }

    public void checkout() throws IOException, ParseException, InterruptedException {
        Faker faker= new Faker();
        String fName=faker.name().firstName();
        String lName=faker.name().lastName();
        String postalCode=faker.address().zipCode();

        cartIcon.click();
        checkoutButton.click();
        formInput.get(0).sendKeys(fName);
        formInput.get(1).sendKeys(lName);
        formInput.get(2).sendKeys(postalCode);
        Thread.sleep(500);
        Utility.addJsonArray(fName,lName,postalCode);
        Thread.sleep(300);
        btnContinue.click();
        btnFinish.click();
    }

    }

