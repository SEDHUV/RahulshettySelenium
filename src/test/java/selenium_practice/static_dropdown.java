package selenium_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.Optional;

public class static_dropdown {
    public static void main(String[] args) throws InterruptedException {
            WebDriver driver = new ChromeDriver();
            driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
            driver.manage().window().maximize();
            Thread.sleep(2000);
        WebElement static_dropdown=  driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
      // System.out.println(static_dropdown.getAttribute("id"));
        Select select = new Select(static_dropdown);
        select.selectByValue("USD");
        System.out.println(select.getFirstSelectedOption().getText());
        select.selectByIndex(1);
        System.out.println(select.getFirstSelectedOption().getText());
        select.selectByVisibleText("AED");
        System.out.println(select.getFirstSelectedOption().getText());
        Thread.sleep(2000);
        driver.quit();


    }
}
