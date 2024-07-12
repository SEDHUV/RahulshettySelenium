package coreJava;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class calendar {
    public static void main(String[] args) {
       Calendar cal =  Calendar.getInstance();
        SimpleDateFormat sdf1 = new SimpleDateFormat("M/d/yyyy hh:mm:ss");
        System.out.println(sdf1.format(cal.getTime())); //another way to get time using calendar class

        //lot of advantages using calendar class
        System.out.println(cal.get(Calendar.DAY_OF_WEEK_IN_MONTH));
        System.out.println(cal.get(Calendar.DAY_OF_WEEK));
    }
}
