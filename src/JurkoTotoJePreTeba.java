import java.util.Scanner;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;
import java.util.Scanner;

public class JurkoTotoJePreTeba {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Zadaj stranu stvorca: ");
        int a = scanner.nextInt();
        int obvod1 = vratObvodStvorca(a);
        System.out.print("Zadaj stranu stvorca: ");
        int a2 = scanner.nextInt();
        int obvod2 = vratObvodStvorca(a2);


        System.out.println("Sucet obvodov oboch stvorcov je " + (obvod1 + obvod2));
    }

    public static void ObvodStvorca(int strana) {
        System.out.println("Obvod je " + (4 * strana));
    }

    public static int vratObvodStvorca(int strana) {
        return 4 * strana;
    }
    public static void ObsahStvorca(int strana) {
        System.out.println("Obsah je " + (strana * strana));
    }
    public static int vratObsahStvorca(int strana) {
        return strana * strana;
    }
    public static void obvodKruhu(int polomer){
        System.out.println("Obvod je" + (4 * polomer * Math.PI));
    }
    public static double vratObvodKruhu(int polomer){
        return 4 * polomer * Math.PI;
    }
    public static void obsahKruhu(int polomer){
        System.out.println("Obsah je" + (polomer * polomer * Math.PI));
    }
    public static double vratObsahKruhu(int polomer){
        return polomer * polomer * Math.PI;
    }
    public static void obvodObdlznika(int stranaA, int stranaB) {
        System.out.println("Obvod je " + (2 * stranaA + 2 * stranaB));
    }
    public static int vratObvodObdlznika(int stranaA, int stranaB) {
        return 2 * stranaA + 2 * stranaB;
    }
    public static void obsahObdlznika(int stranaA, int stranaB) {
        System.out.println("Obsah je " + (stranaA * stranaB));
    }
    public static int vratObsahbdlznika(int stranaA, int stranaB) {
        return stranaA * stranaB;
    }



}
