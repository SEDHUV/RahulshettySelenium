package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class webtables {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("window.scrollBy(0,600)");
        System.out.println(driver.findElements(By.cssSelector(".left-align #product tr")).size());
        System.out.println(driver.findElements(By.cssSelector(".left-align #product th")).size());
        List<WebElement> row = driver.findElements(By.cssSelector(".left-align #product tr:nth-child(3) td"));
        for (WebElement rows:row
             ) {
           System.out.println(rows.getText());

        }



    }
}
