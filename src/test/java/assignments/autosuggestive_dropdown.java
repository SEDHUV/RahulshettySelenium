package assignments;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class autosuggestive_dropdown {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        WebElement auto = driver.findElement(By.id("autocomplete"));
        auto.click();
        auto.sendKeys("ind");
        Thread.sleep(3000);
        auto.sendKeys(Keys.DOWN);
        auto.sendKeys(Keys.DOWN);
        //1st method
       // System.out.println(driver.findElement(By.id("autocomplete")).getAttribute("value"));
        //2nd method
        JavascriptExecutor js = (JavascriptExecutor)driver;
        // Issue command to extract the text using javascriptexecutor
        String text = js.executeScript("return document.getElementById('autocomplete').value").toString();
        System.out.println(text);


    }
}
