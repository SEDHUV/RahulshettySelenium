package selenium_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class autosuggestive_dropdown {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
        //driver.manage().window().maximize();
        driver.findElement(By.id("autosuggest")).sendKeys("aus");
        Thread.sleep(2000);

        List<WebElement> options = driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));
        for (WebElement option:options) {
            String op = option.getText();
            System.out.println(op);
            if(op.equalsIgnoreCase("austria"))
            {
                Actions actions = new Actions(driver);
                actions.moveToElement(option).click().build().perform();

                break;}

        }
        Thread.sleep(2000);
        driver.quit();
    }
}
