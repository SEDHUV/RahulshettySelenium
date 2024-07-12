package selenium_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class locators_practice {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://rahulshettyacademy.com/locatorspractice/");
        driver.manage().window().maximize();
        driver.findElement(By.id("inputUsername")).sendKeys("Sedhu");
        //Thread.sleep(2000);
        driver.findElement(By.name("inputPassword")).sendKeys("pass");
        driver.findElement(By.className("signInBtn")).click();
        //Thread.sleep(5000);
        //driver.findElement(By.xpath("//a[@href=\"#\"][contains(text(),'Forgot your password?')]")).click();
        driver.findElement(By.partialLinkText("Forgot")).click();
        Thread.sleep(2000);
        driver.findElement(By.className("reset-pwd-btn")).click();
String infomsg = driver.findElement(By.className("infoMsg")).getText();
System.out.println(infomsg);
//Thread.sleep(1000);
if(infomsg.contains("rahulshettyacademy")){
    driver.findElement(By.className("go-to-login-btn")).click();
}
else
    System.out.println("test failed");

//Thread.sleep(3000);
        driver.findElement(By.id("inputUsername")).sendKeys("Sedhu");
        //Thread.sleep(2000);
        driver.findElement(By.name("inputPassword")).sendKeys("rahulshettyacademy");
        driver.findElement(By.id("chkboxOne")).click();
        driver.findElement(By.id("chkboxTwo")).click();
        driver.findElement(By.className("signInBtn")).click();
        Thread.sleep(2000);
       String successful_msg =  driver.findElement(By.cssSelector("div[class='login-container'] p")).getText();
       if(successful_msg.contains("You are successfully logged in."))
           System.out.println("login test passed");
        //Thread.sleep(3000);
        driver.findElement(By.cssSelector(".logout-btn")).click();
        Thread.sleep(1000);
driver.close();
    }

}
