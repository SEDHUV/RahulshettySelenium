package seleniunm4features;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.openqa.selenium.support.locators.RelativeLocator.*;

public class relative_locators {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/angularpractice/");
       WebElement NAME =  driver.findElement(By.cssSelector("[name='name']"));
      System.out.println(driver.findElement(with(By.tagName("label")).above(NAME)).getText());
      WebElement column = driver.findElement(By.cssSelector("form.ng-pristine"));
      //System.out.println(driver.findElement(with(By.cssSelector(".container")).above(column)).getText());
        WebElement column1 = driver.findElement(By.xpath("//h1[text()='Protractor Tutorial']"));
        System.out.println(driver.findElement(with(By.cssSelector("span")).below(column1)).getText());
        WebElement label = driver.findElement(By.className("form-check-label"));
        driver.findElement(with(By.id("exampleCheck1")).toLeftOf(label)).click();
        System.out.println(driver.findElement(with(By.id("exampleCheck1")).toLeftOf(label)).isSelected());
        WebElement employee = driver.findElement(By.id("inlineRadio2"));
       System.out.println(driver.findElement(with(By.cssSelector(".form-check-label")).toRightOf(employee)).getText());

    }
}
