package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocateUsingLinkTextLocator {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.letskodeit.com/practice");
        // locating open tab button using the link text locator.
        WebElement openTabButton = driver.findElement(By.linkText("Open Tab"));
        openTabButton.click();
        driver.quit();
    }
}
