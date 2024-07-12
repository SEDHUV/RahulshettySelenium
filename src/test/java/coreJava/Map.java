package coreJava;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Map {
    public static void main(String[] args) {
        HashMap<Integer,String> hm = new HashMap<Integer,String>();
        hm.put(0,"sedhu8");
        hm.put(1,"haema");
        hm.put(2,"vanitha");
        System.out.println(hm.get(1));
        hm.remove(0);
        System.out.println(hm.size());
       Set sn =  hm.entrySet();
        Iterator i = sn.iterator();

        while (i.hasNext()){

           java.util.Map.Entry me = (java.util.Map.Entry)i.next(); //we need to print key separate and value separate for that casting to Map.Entry
                                                                    //if you print i.next alone it will throw error as in the set it stores key and value both so iterator confuse so casting to Map.Entry we can able to get key and value without error
           System.out.println(me.getKey() +" "+me.getValue());
        }


        //In java another collection is there-> HashTable
       // hashtable and hashmap both are same but only these following 3 differences
        //1.hashmap - concurrency and not thread safe( it means many programs simultaneously can access this object)
        //whereas in hashtable - non-concurrency and thread safe (only one program access at a time with this object, other programs need to wait until it completes)
//2.hashmap accept one null key and many null values but hashtable won't allow null key and null values
        //3.in hashmap you can iterate objects through iterator but in hashtable it was enumerator

    }
}
