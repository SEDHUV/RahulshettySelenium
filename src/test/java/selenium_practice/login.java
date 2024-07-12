package selenium_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;

import java.time.Duration;

public class login {
    public static void main(String[] args) throws InterruptedException {
        //WebDriver driver = new ChromeDriver();
        WebDriver driver = new EdgeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        String password = getDriver(driver);
        System.out.println(password);
        driver.get("https://rahulshettyacademy.com/locatorspractice/");
        driver.manage().window().maximize();
        String username ="Sedhu";
        driver.findElement(By.id("inputUsername")).sendKeys(username);
        //Thread.sleep(2000);
        driver.findElement(By.name("inputPassword")).sendKeys(password);
        driver.findElement(By.id("chkboxOne")).click();
        driver.findElement(By.id("chkboxTwo")).click();
        driver.findElement(By.className("signInBtn")).click();
        Thread.sleep(2000);
        String name = driver.findElement(By.xpath("//div[@class=\"login-container\"]/h2")).getText();
        Assert.assertEquals(name,"Hello"+" "+username+",");
        String successful_msg =  driver.findElement(By.cssSelector("div[class='login-container'] p")).getText();
        System.out.println(successful_msg);
        Assert.assertEquals(successful_msg,"You are successfully logged in.");
        driver.findElement(By.xpath("//*[text()=\"Log Out\"]")).click();
        driver.quit();
    }

    public static String getDriver(WebDriver driver) throws InterruptedException {
        driver.get("https://rahulshettyacademy.com/locatorspractice/");
        driver.findElement(By.partialLinkText("Forgot")).click();
        Thread.sleep(2000);
        driver.findElement(By.className("reset-pwd-btn")).click();
        String infomsg = driver.findElement(By.className("infoMsg")).getText();
        //Please use temporary password 'rahulshettyacademy' to Login.
        String[] passwordsplit = infomsg.split("'");
        for (int i = 0; i < passwordsplit.length; i++) {

            System.out.println(passwordsplit[i]);
        }

        String password = passwordsplit[1].trim();//here we are directly taking passordsplit[1]'s 0th index instead of creating separate variable
        return password;

    }
}
