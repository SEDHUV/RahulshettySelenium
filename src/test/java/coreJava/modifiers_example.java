package coreJava;

public class modifiers_example extends public_private {



    public static void main(String[] args) {
        public_private pp = new public_private();
//        pp.Private(); //it will give error as it is private method
        pp.Protected();
    }

}
