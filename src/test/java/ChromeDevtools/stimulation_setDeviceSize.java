package ChromeDevtools;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.v122.emulation.Emulation;

import java.util.Optional;

public class stimulation_setDeviceSize {
    public static void main(String[] args) throws InterruptedException {
        ChromeDriver driver = new ChromeDriver();
       DevTools devTools =  driver.getDevTools();
       devTools.createSession();
       devTools.send(Emulation.setDeviceMetricsOverride(600,1000,50,true, Optional.empty(),Optional.empty(),Optional.empty(),Optional.empty(),Optional.empty(),Optional.empty(),Optional.empty(),Optional.empty(),Optional.empty(),Optional.empty()));
   driver.get("https://rahulshettyacademy.com/angularAppdemo/");
   driver.findElement(By.cssSelector(".navbar-toggler-icon")).click();
   Thread.sleep(3000);
   driver.findElement(By.linkText("Library")).click();

    }
}
