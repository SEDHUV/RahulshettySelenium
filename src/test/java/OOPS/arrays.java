package OOPS;

public class arrays {


    public static void main(String[] args) {
        int a[] = new int[2];
        a[0]= 1;
        a[1]= 2;
       // System.out.println(a[0]);

        int b[]= {1,2,3,4,5,6};
       // System.out.println(b[4]);
        for (int i=0;i<b.length;i++){
            //System.out.println(b[i]);

        }

        int c[][] = new int[1][2];
        c[0][0] = 1;
        c[0][1] = 2;
        //System.out.println(c[0][1]);

        int d[][] = {{1,2,3},{4,5,6}};
        //System.out.println(d[1][2]);
        for (int i = 0; i <2 ; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(d[i][j]);
                System.out.print("\t");

            }
            System.out.println("");
        }



    }
}
