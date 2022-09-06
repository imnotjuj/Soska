import java.util.Scanner;

public class sucet {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Zadaj dve cisla: ");
        int c1 = scan.nextInt();
        int c2 = scan.nextInt();
        System.out.println("Co si myslis: ");
        int c3 = scan.nextInt();
        if (pravda(c1,c2,c3)){
            System.out.println("Uhadol si");
        } else {
            System.out.println("Neuhadol si");
        }
    }
    public static boolean pravda(int c1, int c2, int c3){
        if (c1 + c2 == c3){
            return true;
        } else {
            return false;
        }
    }
}
