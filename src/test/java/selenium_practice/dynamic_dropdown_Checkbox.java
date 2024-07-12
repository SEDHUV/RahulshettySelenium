package selenium_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;

public class dynamic_dropdown_Checkbox {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
        driver.manage().window().maximize();
        Assert.assertFalse(driver.findElement(By.cssSelector("input[name*='SeniorCitizenDiscount']")).isSelected());
       // System.out.println(driver.findElement(By.cssSelector("input[name*='SeniorCitizenDiscount']")).isSelected());
        driver.findElement(By.cssSelector("input[name*='SeniorCitizenDiscount']")).click();
       System.out.println(driver.findElement(By.cssSelector("input[name*='SeniorCitizenDiscount']")).isSelected());
        driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
       // driver.findElement(By.xpath("//a[@value=\"AMD\"]")).click();
       // Thread.sleep(2000);
       // driver.findElement(By.xpath("(//a[@value=\"MAA\"])[2]")).click();


        //using parent and child xpath(alternate)//if u have same xpath instances in many places use parent xpath before them
        driver.findElement(By.xpath("(//div[@id=\"glsctl00_mainContent_ddl_originStation1_CTNR\"]//a[@value=\"MAA\"])")).click();
Thread.sleep(2000);
driver.findElement(By.xpath("(//div[@id=\"glsctl00_mainContent_ddl_destinationStation1_CTNR\"]//a[@value=\"IXB\"])")).click();
  driver.findElement(By.cssSelector("a.ui-state-default.ui-state-highlight")).click();
  System.out.println(driver.findElement(By.name("ctl00$mainContent$view_date1")).getAttribute("value"));
  driver.quit(); }

}
