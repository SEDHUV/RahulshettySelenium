package OOPS;

public class Cisco_arrays_interview {

        //finding large number in the smallest number column

        public static void main(String[] args) {
            int hema[][] = {{5, 7, 8, 9}, {6, 9, 2, 10}};
            int mininum = hema[0][0]; //here just assuming that first might be small number
            int mincolumn = 0;

            for (int i = 0; i < 2; i++) {
                for (int j = 0; j < 4; j++) {
                    if (hema[i][j] < mininum) { //comparing all other values with first parameter then finding smallest one
                        mininum = hema[i][j];
                        mincolumn = j;
                    }

                }
            }

            int maximum = hema[0][mincolumn];
            int k = 0;
            while (k < 2) {
                if (hema[k][mincolumn] > maximum) {
                    maximum = hema[k][mincolumn];
                }
                k++;
            }
            System.out.println(mininum);
            System.out.println(mincolumn);
            System.out.println(maximum);


        }
    }

