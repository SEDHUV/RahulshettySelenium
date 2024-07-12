package testNg_rahulshetty;

import org.testng.annotations.*;

import java.awt.geom.PathIterator;

public class demo1 {

    @BeforeClass
    public void bclass(){

        System.out.println("before separate");
    }
    @Test(groups={"smoke"})
    public void section(){
      System.out.println("separate");

    }
//@Parameters({"url"})
    @Test
    public void exceptsmoke(String url){
        System.out.println(url);

    }
    @AfterClass
    public void aclass(){

        System.out.println("after separate");
    }
    @BeforeSuite
    public void bfsuite(){
    System.out.println("I'm the boss at the first");
        }

    @AfterSuite
    public void afsuite(){
        System.out.println("I'm the boss at the last");
    }
}
