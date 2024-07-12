package selenium_practice;

import com.google.j2objc.annotations.Weak;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import java.time.Duration;
import java.util.function.Function;

public class fluentWait {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.seleniumeasy.com/dynamic-data-loading-demo.html");
        driver.findElement(By.id("save")).click();
        //waiting for text to display
        Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(30))
                .pollingEvery(Duration.ofSeconds(4)).ignoring(NoSuchElementException.class);

        WebElement foo = wait.until(new Function<WebDriver, WebElement>() {

            public WebElement apply(WebDriver driver) {
                if(driver.findElement(By.xpath("//div[@id='loading']/img")).isDisplayed())
                {
                    return driver.findElement(By.xpath("//div[@id='loading']/img"));
                }else
                return null;
            }
        });
System.out.println(driver.findElement(By.xpath("//div[@id='loading']/img")).getAttribute("src"));
    }
}
