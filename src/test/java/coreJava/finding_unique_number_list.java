package coreJava;

import java.util.ArrayList;

public class finding_unique_number_list {
    public static void main(String[] args) {
        int a[] = {1,2,3,5,5,3,2,9,9,6,1,6,7};
        ArrayList<Integer> ab = new ArrayList<Integer>();
        for (int i = 0; i < a.length; i++) {
            int k =0;
            if(!ab.contains(a[i])){
                ab.add(a[i]);
                k++;
                for (int j = i+1; j < a.length; j++) {

                    if(a[i]==a[j]){
                        k++;
                    }

                }
//                System.out.println(a[i]);
//                System.out.println(k);
                if(k==1){
                    System.out.println(a[i]+"is a unique number");
                }}
        }
    }
}
