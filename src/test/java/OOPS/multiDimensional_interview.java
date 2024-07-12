package OOPS;

public class multiDimensional_interview {
    //finding smallest number in multi dimensional array

    public static void main(String[] args) {
        int hema[][] = {{5,7,8,9},{6,9,2,10}};
        int mininum = hema[0][0]; // here just assuming that first might be small number

        for (int i = 0; i <2 ; i++) {
            for (int j = 0; j <4 ; j++) {
                if(hema[i][j]>mininum){ //comparing all other values with first parameter then finding smallest one
                    mininum = hema[i][j];
                }

            }
        }
        System.out.println(mininum);
    }
}
