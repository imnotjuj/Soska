import java.util.Scanner;

public class Class13 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Zadaj dve cisla");
        double c1 = scan.nextInt();
        double c2 = scan.nextInt();
        System.out.println("Zadaj operaciu: ");
        String operacia = scan.next();
        System.out.println(vypocitaj(c1,c2,operacia));
    }
    public static double sucet1(double c1, double c2){ return c1 +c2; }
    public static double odcitanie(double c1, double c2){ return c1 -c2; }
    public static double delenie(double c1, double c2){ return c1 /c2; }
    public static double nasobenie(double c1, double c2){return c1 *c2; }
    public static double vypocitaj (double c1, double c2, String operacia){
        switch (operacia) { case "+":
                return sucet1(c1, c2);
            case "-":
                return odcitanie(c1,c2);
            case "/":
                return delenie(c1,c2);
            case "*":
                return nasobenie(c1,c2);
            default:
                System.out.println("Zly vstup");
        }
        return 0;
    }
}