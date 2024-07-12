package coreJava;

public class this_keyword {

    int a =9;

    public int sedhu(){
        int a =8;
        int b = a+this.a;
        return b;
    }

    public static void main(String[] args) {
        this_keyword tk = new this_keyword();
       System.out.println(tk.sedhu());
    }
}
