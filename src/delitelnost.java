import java.util.Scanner;

public class delitelnost {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("napis dve cisla: ");
        int c1 = scan.nextInt();
        int c2 = scan.nextInt();
        if (delitelne(c1,c2)){
            System.out.println("Cislo je delitelne bez zvysku.");
        } else {
            System.out.println("Cislo nieje delitelne bez zvysku.");
        }
    }
    public static boolean delitelne(int c1,int c2){
        if (c1 % c2 == 0){
            return true;
        } else{
            return false;
        }
    }
}