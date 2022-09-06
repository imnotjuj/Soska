import java.util.Scanner;

public class prvocislo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Zadaj cislo");
        int prvocislo = scan.nextInt();
        if (pravda(prvocislo)){
            System.out.println("Je to prvocislo");
        } else {
            System.out.println("Nieje to prvocislo");
        }
    }
    public static boolean pravda(int prvocislo){
        for (int i = 2; i <= 1000000; i++){
            if(prvocislo % i == 0 && prvocislo != i){
                return false;
            } else if (i == 1000000 && prvocislo % i == 0){
                return true;
            }
        }
        return true;
    }
}
