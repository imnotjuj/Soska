import java.util.Scanner;

public class Class2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Zadaj cislo pre vypocet faktorialu: ");
//        int faktorial = scan.nextInt();
//        for (int i = faktorial - 1; i >= 1; i-- ){
//            faktorial *= i;
//        }
//        System.out.printf("faktorial: %d ", faktorial);
        System.out.println("Zadaj prve cislo: ");
        int c1 = scan.nextInt();
        System.out.println("Zadaj druhe cislo: ");
        int c2 = scan.nextInt();
        int nsd = c2;
        boolean pes = false;
        while (!pes){
            if (c1 % nsd == 0 && c2 % nsd == 0){
                pes = true;
                System.out.println("nsd je "+nsd);
            } else {
                nsd--;
            }
        }
    }
}
