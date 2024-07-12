import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import javax.xml.namespace.QName;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class seleniumintro {

    public static void main(String[] args) throws InterruptedException {
//        WebDriver driver = new ChromeDriver();
//        driver.get("https://www.amazon.in/");
//        driver.manage().window().maximize();
//        System.out.println(driver.getTitle());
//        Thread.sleep(2000);
//        driver.close();
//        int[] arr = new int[2];
//        arr[0] = 7;
//        arr[1] = 5;
//        for (int web:arr) {
//
//       System.out.println(web); }


        //retrieving array using for each loop
        String[] name={"sedhu","jp","haema"};
        for (String s:name) {
            System.out.println(s);
        }
        int[] arr = {2,3,27,9};
        for (int i = 0; i < arr.length ; i++) {
            System.out.println(arr[i]);
        }
        //retrieving array using fori method
        for (int i = 0; i < arr.length; i++) {
           if(arr[i]%2==0){
               System.out.println(arr[i]);
           break;}
           else
               System.out.println(arr[i]+"-"+"no number found");
        }
        //arraylist
        ArrayList<Integer> sh = new ArrayList<Integer>();
        sh.add(45);
        sh.add(900);
        sh.add(4);

//retrieving array using fori method
        for (int i = 0; i < sh.size() ; i++) {
            if (sh.get(i)>100)
                System.out.println(sh.get(i));

        }
        //retrieving array using for each loop
        for (int s:sh) {
            System.out.println(s);

        }
        sh.remove(1);
        System.out.println(sh.get(1));

        //normal array to arraylist
       List<String> namearraylist =  Arrays.asList(name);
      System.out.println(namearraylist.get(0));

      //splitting strings
      String s ="sedhu good boy";
      //String[] splittedstring = s.split(" ");
        String[] splittedstring=  s.split("good");//it will remove good and split strings into two
        System.out.println(splittedstring[0]);//it will print sedhu
      System.out.println(splittedstring[1]);//it will print  boy
      System.out.println(splittedstring[1].trim());//it will remove the extra space before boy
System.out.println(s.length());
        //printing each letters from string in normal order
        for(int i =0;i<s.length();i++){
           System.out.println(s.charAt(i));
        }
        //printing each letters from string in reverse order
        for(int i =s.length()-1;i>=0;i--){
            System.out.println(s.charAt(i));
        }

   }

}
