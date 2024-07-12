package coreJava;

import java.text.SimpleDateFormat;
import java.util.Date;

public class dateclass {
    public static void main(String[] args) {
        Date d = new Date();

        SimpleDateFormat sdf = new SimpleDateFormat("M/d/yyyy");//way to print our customized method
        SimpleDateFormat sdf1 = new SimpleDateFormat("M/d/yyyy hh:mm:ss");
        System.out.println(sdf1.format(d));
        System.out.println(sdf.format(d));
        System.out.println(d.toString());//it will normal format
    }
}
