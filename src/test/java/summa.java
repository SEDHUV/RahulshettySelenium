public class summa {
    public static void main(String[] args) {
        int[][] d = {{1,4,5},{5,7,8}};
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j <3 ; j++) {
                System.out.print(d[i][j]);
                System.out.print("\t");
            }
            System.out.println("");
        }
        System.out.println(d.length);
    }
}
