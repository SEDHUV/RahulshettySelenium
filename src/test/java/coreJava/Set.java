package coreJava;

import java.util.HashSet;
import java.util.Iterator;

public class Set {

    public static void main(String[] args) {
        HashSet<String> hs = new HashSet<String>();
        hs.add("haema");
        hs.add("haema");//will not accept duplicate values
        hs.add("vanitha");
        System.out.println(hs);
        System.out.println(hs.isEmpty());
        System.out.println(hs.remove("haema"));
        System.out.println(hs.size());
        Iterator<String> i = hs.iterator();
        while (i.hasNext()){
            System.out.println(i.next());
        }
        //it is not in sequential order
        //hashset, treeset, linkedhashset implements set interface

    }
}
