import java.util.Random;

public class Class11 {
    public static void main(String[] args) {
        int [][] pole1 = {{5,9},{6,2}};
        int [][] pole2 = {{3,0},{1,4}};
        int [][] pole3 = new int[1][1];
        for (int i = 0; i < 2; i++){
            for (int o = 0; o <2; o++){
                pole3 [i][o] = pole1[i][o] + pole2[i][o];
            }
        }
        for (int riadok = 0; riadok < 3; riadok++){
            for (int stlpec = 0; stlpec < 3; stlpec++){
                System.out.print(pole3[riadok][stlpec] + " ");
            }
            System.out.println();
        }
    }
}
