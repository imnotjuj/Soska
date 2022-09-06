import com.sun.crypto.provider.BlowfishKeyGenerator;

import java.util.Random;
import java.util.Scanner;

public class Class9 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Random ran = new Random();

        char[][] pole2d = new char[3][3];
        for (int i = 0; i < 3; i++){
            for (int o = 0; o < 3; o++) {
                pole2d[i][o] = '-';
                System.out.print(pole2d[i][o] + "  ");
            }
            System.out.println();
        }
        for (int i = 0; i < 9; i++){
            System.out.print("Zadaj suradnice:");
            int suradnica = scan.nextInt();
            int suradnica2 = scan.nextInt();
            if (i % 2 == 0){
                pole2d[suradnica][suradnica2] = 'O';
            } else{
                pole2d[suradnica][suradnica2] = 'X';
            }
            for (int p = 0; p < 3; p++){
                for (int o = 0; o < 3; o++) {
                    System.out.print(pole2d[p][o] + "  ");
                }
                System.out.println();
            }
        }
    }
}
