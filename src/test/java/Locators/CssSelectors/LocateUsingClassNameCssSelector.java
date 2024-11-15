package Locators.CssSelectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocateUsingClassNameCssSelector {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/login");
        // Approach #1: locating using the class name CSS selector.
        // WebElement loginButton = driver.findElement(By.cssSelector("button.radius"));

        // Approach #2: locating using the class name CSS selector.
        WebElement loginButton = driver.findElement(By.cssSelector(".radius"));
        loginButton.click();
        driver.quit();
    }
}
