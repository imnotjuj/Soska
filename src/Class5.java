import java.util.Random;
import java.util.Scanner;

public class Class5 {
    public static void main(String[] args) {
        ////        Scanner scanner = new Scanner(System.in);
////
////        System.out.println("cislo ?");
////        int a = scanner.nextInt();
////        int cislo= 0;
////        int []pole = new int[100];
        Random ran = new Random();
        Scanner scan = new Scanner(System.in);
////        for (int index = 0; index < pole.length;index++) {
////            pole[index] = rand.nextInt(10) + 1;
////            if (pole[index] == a) {
////                cislo++;
////
////            }
////        }
////        for (int i = 0; i < pole.length;i++){
////            System.out.println(pole[i]);
////
////        }
//        int n = 0;
//
//
//        for (int j = 0; j <10; j++){
//            for (int b = 0; b <10; b++){
//
//                int c = rand.nextInt(10)+1;
//
//                System.out.print(c+" ");
//                 n = n+c ;
//
//            }
//            System.out.println(" ");
//        }
//        System.out.println("dokopy"+n);
//
//
//            }
//
//
//        }
//        3
//        double []pole = new double[5];
//        for (int i = 0; i <6;i++){
//        pole [i]= rand.nextDouble();
//        System.out.println(pole[i]);
//    }
        double [] teploty = {12.3, 8.3,4.6,3.1,9.4,18.5};
//        int hladanecislo = 7;
//        boolean pravda = false;
//        for (int i = 1; i < pole.length; i++) {
//            if (hladanecislo == pole[i]) {
//                pravda = true;
//            }
//        }
//            if (!pravda){
//                System.out.println(hladanecislo + " nieje v poli");
//            } else{
//                System.out.println(hladanecislo + " je v poli");
//            }
        double min = 0;
        for (int i = 0; i < teploty.length; i++){
            if (min>teploty[i]){
                min = teploty[i];
            }
        }
        System.out.println(min);

    }
}
