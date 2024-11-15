package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocateUsingIdLocator {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/login");
        driver.manage().window().maximize();
        // locating the username input using the ID locator
        WebElement userNameInput = driver.findElement(By.id("username"));
        userNameInput.sendKeys("Raed Eleyan");
        driver.quit();
    }
}
