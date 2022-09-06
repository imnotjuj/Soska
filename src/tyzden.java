import java.util.Scanner;

public class tyzden {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Kolkaty je den?");
        int den = scan.nextInt();
        System.out.println(nazov(den));
    }
    public static String nazov(int den){
        switch (den) {
            case 1:
                return "Pondelok";
            case 2:
                return "Utorok";
            case 3:
                return "Streda";
            case 4:
                return "Stvrtok";
            case 5:
                return "Piatok";
            case 6:
                return "Sobota";
            case 7:
                return "Nedela";
            default:
                return "Zly vtup";
        }
    }
}
