package selenium_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.util.List;

public class javascript_window_scroll {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        JavascriptExecutor js = (JavascriptExecutor)driver;
        //for window scrolling use window.scrollBy(0,500)
        //in developer tools use console and hit window.scrollBy(0,500) to check javascript commands
        js.executeScript("window.scrollBy(0,500)");
        Thread.sleep(3000);
        //this command used to scroll in specific webelement
        js.executeScript("document.querySelector('.tableFixHead').scrollTop=5000");
        List<WebElement> num = driver.findElements(By.cssSelector("#product:nth-child(1) td:nth-child(4)"));
        int sum = 0;
        for (int i =0; i< num.size();i++){
            sum = sum + Integer.parseInt(num.get(i).getText());
        }
        System.out.println(sum);
       String total_amount =  driver.findElement(By.cssSelector(".totalAmount")).getText().split(":")[1].trim();
       System.out.println(total_amount);
        Assert.assertEquals(sum,Integer.parseInt(total_amount));
        driver.quit();
    }

}
