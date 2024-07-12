package ChromeDevtools;

import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.v122.network.Network;
import org.openqa.selenium.devtools.v122.network.model.ConnectionType;

import java.util.Optional;

public class networkEmulation {
    public static void main(String[] args) {
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        DevTools devTools =  driver.getDevTools();
        devTools.createSession();
        devTools.send(Network.enable(Optional.empty(),Optional.empty(),Optional.empty()));
        devTools.send(Network.emulateNetworkConditions(true,3000,20000,100000, Optional.of(ConnectionType.WIFI)));
        devTools.addListener(Network.loadingFailed(),property->{
            System.out.println(property.getErrorText());
        });
        long start = System.currentTimeMillis();
        driver.get("https://rahulshettyacademy.com/angularAppdemo/");
        driver.findElement(By.cssSelector("a[routerlink*='products']")).click();
        long end = System.currentTimeMillis();
        System.out.println(end-start);
    }

}
