package ChromeDevtools;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.v122.network.Network;
import org.openqa.selenium.devtools.v122.network.model.Request;
import org.openqa.selenium.devtools.v122.network.model.Response;

import java.util.Optional;

public class request_Response {
    public static void main(String[] args) {
        ChromeDriver driver = new ChromeDriver();
        DevTools tools = driver.getDevTools();
        tools.createSession();
        tools.send(Network.enable(Optional.empty(),Optional.empty(),Optional.empty()));
        tools.addListener(Network.requestWillBeSent(),request->
                { Request req = request.getRequest();
//                System.out.println(req.getUrl());

                });

        tools.addListener(Network.responseReceived(),response->
        { Response req = response.getResponse();
//            System.out.println(req.getUrl());
//            System.out.println(req.getStatus());
            if(req.getStatus()>400){
                System.out.println(req.getUrl());
            }

        });

        driver.get("https://rahulshettyacademy.com/angularAppdemo/");
        driver.findElement(By.cssSelector("button[routerlink*='library']")).click();
    }
}
