package Locators.CssSelectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocateUsingIDCssSelector {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.letskodeit.com/practice");
        // Approach #1: locating open tab button using the ID CSS selector.
        // WebElement openTabButton = driver.findElement(By.cssSelector("a#opentab"));

        // Approach #2: locating open tab button using the ID CSS selector.
        WebElement openTabButton = driver.findElement(By.cssSelector("#opentab"));
        openTabButton.click();
        driver.quit();
    }
}
