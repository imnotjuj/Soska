import java.util.Scanner;

public class mocnina {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("napis cislo");
        for (int i = 1; i <=100 ; i++){
            System.out.print(nasobenie(i) + " ");
        }
    }
    public static int nasobenie(int i){
        return i * i * i;
    }
}



