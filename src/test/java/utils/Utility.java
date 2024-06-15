package utils;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;

public class Utility {
    public static int generateRandomNumber(int min, int max){
      return (int) Math.round(Math.random()*(max-min)+min);
    }

    public static void waitForElements(WebDriver webDriver, WebElement webElement, int timeunitSeconds){
        WebDriverWait wait = new WebDriverWait(webDriver, Duration.ofSeconds(timeunitSeconds));
        wait.until(ExpectedConditions.visibilityOf(webElement));
    }

    public static JSONObject loadJSONFile(String fileLocation) throws IOException, ParseException { // Read json file's data
        JSONParser jsonParser= new JSONParser();
        Object obj= jsonParser.parse(new FileReader(fileLocation));
        JSONObject jsonObject= (JSONObject) obj;
        return jsonObject;

    }
}
