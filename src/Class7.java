public class Class7 {
    public static void main(String[] args) {
//        int cislo = 0;
//        for (int i  = 2; i <=Integer.MAX_VALUE; i++){
//            System.out.print(i);
//        }
        int[][] pole = new int [3][3];
        pole[0][0] = 5;
        System.out.println(pole[0][0]);
        for (int riadok = 0; riadok < 3; riadok++){
            for (int stlpec = 0; stlpec < 3; stlpec++){
                pole[riadok][stlpec] = riadok;
            }
        }
        for (int riadok = 0; riadok < 3; riadok++){
            for (int stlpec = 0; stlpec < 3; stlpec++){
                System.out.print(pole[riadok][stlpec] + " ");
            }
            System.out.println();
        }
        int [][] pole2 = {
                {1,2,3},
                {4,5,6},
                {7,8,9}};
        System.out.println(pole2 [2][2]);

    }
}
