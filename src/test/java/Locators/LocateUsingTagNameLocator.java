package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class LocateUsingTagNameLocator {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.letskodeit.com/practice");
        // locating <a> tags using the tag name locator.
        List<WebElement> a_tags = driver.findElements(By.tagName("a"));
        System.out.println("Number of <a> tags in the page are: " + a_tags.size());
        driver.quit();
    }
}
