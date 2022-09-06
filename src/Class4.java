import java.util.Random;
import java.util.Scanner;

public class Class4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random ran = new Random();
//        int a = 1;
//        int b = 2;
//        int c = 3;
//        int d = 4;
//        int e = 5;
        //mozme tu ulozit viacej cisel
        int [] pole = new int[10];
//        pole[0] = 5;
//        pole[1] = 6;
//        System.out.println(pole[0]);
//        System.out.println(pole[1]);
//
//        pole[1] = 1;
//        System.out.println(pole[1]);
//        pole [0] = "pes";
//        pole [1] = "macka";
//        pole [2] = "tojevelka";
//        pole [3] = "nahanacka";
//        for (int i = 0; i < pole.length; i++){
////            System.out.println(pole[i]);
//        }
        System.out.println("Ake cislo chces pocitat?");
        int cislo = scan.nextInt();
        int pocet = 0;
        for (int i = 0; i < pole.length; i++){
            pole [i] = ran.nextInt(6)+1;
            if (pole[i] == cislo){
                pocet++;
            }
        }

        for (int i = 0; i < pole.length; i++) {
            System.out.println(pole[i]);
        }
        System.out.println("Tvoje cislo padlo " + pocet + " krat");
    }
}
