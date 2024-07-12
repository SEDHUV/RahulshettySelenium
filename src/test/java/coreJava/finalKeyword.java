package coreJava;

final class finalKeyword { //we can't able to extends this class as parent class in other class

    public static void main(String[] args) {
        final int i =9;
//        i =90;//cannot assign variable to final variable

    }

    final void getData(){ //this method cannot be overidden
        System.out.println("data");
    }


}
