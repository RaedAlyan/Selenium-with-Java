package Locators.XPath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocateUsingXPathFunctions {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.letskodeit.com/practice");
        // locating using starts-with() function
        // WebElement inputElement = driver.findElement(By.xpath("//input[starts-with(@placeholder, \"Start\")]"));

        // locating using contains() function
        WebElement inputElement = driver.findElement(By.xpath("//input[contains(@placeholder, \"Typing\")]"));
        inputElement.sendKeys("Raed");

        // locating using text() function
        WebElement openWindowButton = driver.findElement(By.xpath("//button[text()=\"Open Window\"]"));
        openWindowButton.click();
        driver.quit();
    }
}
