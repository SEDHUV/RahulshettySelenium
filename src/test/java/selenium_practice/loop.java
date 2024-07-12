package selenium_practice;

public class loop {
    public static void main(String[] args) {
        int i =0;
        while (i<10){
            System.out.println(i);
            i++;
        }

        //1 2 3 4
       // 5 6 7
        //8 9
        //10
        int k =1;
        for (int l = 0; l < 4; l++) {

            for (int j = 1; j <=4-l ; j++) {
                System.out.print(k);
                System.out.print("\t");
                k++;
            }
            System.out.println("");

        }
//        1
//        2	3
//        4	5	6
//        7	8	9	10



        int y =1;
        for (int u = 1; u < 5; u++) {

            for (int o = 1; o <=u ; o++) {
                System.out.print(y);
                System.out.print("\t");
                y++;
            }
            System.out.println("");

        }

//        1
//         1 2
//         1 2 3
//            1 2 3 4



        for (int a = 1; a < 5; a++) {

            for (int b = 1; b <=a; b++) {
                System.out.print(b);
                System.out.print("\t");
                b++;
            }
            System.out.println("");

        }


//                3
//                6 9
//            12 15 18
        int e =1;
        for (int c = 1; c < 4; c++) {

            for (int d = 1; d <=c; d++) {
                System.out.print(e*3);
                System.out.print("\t");
                e++;
            }
            System.out.println("");

        }



    }
}
