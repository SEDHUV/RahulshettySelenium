package OOPS;

public class increment2 extends superclass{
int b;

public increment2(int f){
    super(f); // because we extended superclass(parent) it will invoke parent constructor
    //and it should write in the first
    this.b=f; //this class refers to current class variables
}
    public int increase(){
        b=b+1;
        return b;
    }
}
