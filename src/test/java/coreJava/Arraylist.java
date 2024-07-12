package coreJava;

import java.util.ArrayList;

public class Arraylist {
    public static void main(String[] args) {
        ArrayList<String> a = new ArrayList<String>();
        a.add("sedhu");
        a.add("haema");
        a.add(1,"jayanthi");
        System.out.println(a.get(0));
        System.out.println(a);
        System.out.println(a.contains("sedhu"));
        System.out.println(a.indexOf("haema"));
        System.out.println(a.isEmpty());
        System.out.println(a.size());

        // can accept duplicate values
        // ArraList,LinkedList,vector- Implementing List interface
        // array have fixed size where as arraylist can grow dynamicaly //
        // you can access and insert any value in any index
    }


}
