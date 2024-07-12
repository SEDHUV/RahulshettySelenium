package selenium_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.util.List;

public class calendars {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        String year ="2001";
        String month = "7";
        String day = "14";
        String[] date = {month,day,year};
        driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
        driver.findElement(By.cssSelector(".react-date-picker__calendar-button__icon.react-date-picker__button__icon")).click();
        driver.findElement(By.className("react-calendar__navigation__label__labelText")).click();
        driver.findElement(By.className("react-calendar__navigation__label__labelText")).click();
        driver.findElement(By.cssSelector(".react-calendar__navigation__arrow:nth-child(2)")).click();
        driver.findElement(By.cssSelector(".react-calendar__navigation__arrow:nth-child(2)")).click();
        driver.findElement(By.xpath("//button[text()='"+year+"']")).click();
        driver.findElements(By.cssSelector(".react-calendar__year-view__months__month")).get(Integer.parseInt(month)-1).click();
        driver.findElement(By.xpath("//abbr[normalize-space()='"+day+"']")).click();
       List<WebElement> selected_date =  driver.findElements(By.cssSelector(".react-date-picker__inputGroup__input"));
       for (int i=0;i<selected_date.size();i++){

           System.out.println(selected_date.get(i).getAttribute("value"));
           Assert.assertEquals(selected_date.get(i).getAttribute("value"),date[i]);

       }

        driver.quit();



    }
}
