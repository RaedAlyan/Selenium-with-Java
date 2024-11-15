package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocateUsingNameAttributeLocator {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/login");
        // locating username input using the name attribute locator
        WebElement userNameInput = driver.findElement(By.name("username"));
        userNameInput.sendKeys("Raed Eleyan");
        driver.quit();
    }
}
