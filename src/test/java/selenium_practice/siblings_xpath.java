package selenium_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class siblings_xpath {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        driver.manage().window().maximize();
    WebElement login =  driver.findElement(By.xpath("//header/div/button[1]/following-sibling::button[1]"));
       System.out.println(login.getText());
        Thread.sleep(2000);
        driver.quit();
    }
}
