package ChromeDevtools;

import org.apache.poi.sl.draw.geom.GuideIf;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.v122.emulation.Emulation;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class GeoLocation {
    public static void main(String[] args) throws InterruptedException {
        ChromeDriver driver = new ChromeDriver();
        DevTools devTools =  driver.getDevTools();
        devTools.createSession();
        //using selenium method
        devTools.send(Emulation.setGeolocationOverride(Optional.of(52.543), Optional.of(13.4501), Optional.of(1)));
        driver.get("https://mylocation.org/");
//        Thread.sleep(8000);

//        //using cdpcommand
//        Map<String,Object> coordinates = new HashMap<String,Object>();
//        coordinates.put("latitude",40);
//        coordinates.put("longitude",3);
//        coordinates.put("accuracy",1);
//        driver.executeCdpCommand("Emulation.setGeolocationOverride",coordinates);
//         driver.get("https://www.google.co.in/");
//      driver.findElement(By.name("q")).sendKeys("netflix", Keys.ENTER);
//        driver.findElement(By.partialLinkText("Netflix - Watch TV Shows Online")).click();
//        String text = driver.findElement(By.cssSelector(".default-ltr-cache-jpuyb8")).getText();
//        System.out.println(text);


//




    }
}
