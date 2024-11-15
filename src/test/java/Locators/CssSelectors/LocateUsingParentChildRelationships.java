package Locators.CssSelectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class LocateUsingParentChildRelationships {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.letskodeit.com/practice");
        // ancestor-descendant: locating all descendants input nodes of the div node.
        List<WebElement> inputElements = driver.findElements(By.cssSelector("div[id='radio-btn-example'] input"));
        System.out.println("number of input elements: " + inputElements.size());

        // Parent > Child: locating all direct children of the div node.
        List<WebElement> labelElements = driver.findElements(By.cssSelector("div[id='radio-btn-example'] > fieldset > label "));
        System.out.println("number of label elements: " + labelElements.size());
        driver.quit();
    }
}
