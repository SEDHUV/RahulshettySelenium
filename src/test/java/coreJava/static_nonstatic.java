package coreJava;

public class static_nonstatic {

    String name;//instant variables (changing based on object)
    String area;
    static String state = "bangalore"; //class variables or global (object have no effect on this)
    int i =0;//this variable will be set to default 0 for every new object
    static int j =0; // it will increment by 1 for every object as we used j++ in method as it takes last value

    //another way of declaring static variables
//    static {
//
//        j=0;
//        state = "bangalore";
//    }
    public static_nonstatic(String name , String area)//local variables scope only inside constructor
    {  this.area = area;
        this.name = name;
}
    public void getAddress(){
        System.out.println(i);
        System.out.println(j);
        j++;
        System.out.println(area+state);
    }

    public static void main(String[] args) {
        static_nonstatic sc = new static_nonstatic("subash","banerghatta");
        static_nonstatic sc1 = new static_nonstatic("vicky","whitefield");
        sc.getAddress();
        sc1.getAddress();
        System.out.println(static_nonstatic.state="pondy");//in runtime assigning values for static state
       System.out.println(sc.i=9 ); //in runtime assigning values for non-static i (we can set only by object creation whereas in static directly using classname)

    }

}
