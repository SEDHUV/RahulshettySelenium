package selenium_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class practice3 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
       String option =  driver.findElement(By.xpath("//label[@for='bmw']")).getText();
       System.out.println(option);
        driver.findElement(By.id("checkBoxOption1")).click();
        Select select = new Select(driver.findElement(By.id("dropdown-class-example")));
        select.selectByVisibleText(option);
        driver.findElement(By.name("enter-name")).sendKeys(option);
        driver.findElement(By.id("alertbtn")).click();
        String text = driver.switchTo().alert().getText();
        if (text.contains("Option1"))
            System.out.println("option1 is there");
        else
            System.out.println("test failed");



    }
}
