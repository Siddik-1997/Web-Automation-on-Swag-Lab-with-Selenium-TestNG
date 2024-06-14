package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class Utility {
    public static int generateRandomNumber(int min, int max){
      return (int) Math.round(Math.random()*(max-min)+min);
    }

    public static void waitForElements(WebDriver webDriver, WebElement webElement, int timeunitSeconds){
        WebDriverWait wait = new WebDriverWait(webDriver, Duration.ofSeconds(timeunitSeconds));
        wait.until(ExpectedConditions.visibilityOf(webElement));
    }
}
