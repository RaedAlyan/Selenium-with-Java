package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocateUsingClassNameLocator {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/login");
        // locating login button using the class name locator.
        WebElement loginButton = driver.findElement(By.className("radius"));
        loginButton.click();
        driver.quit();
    }
}
