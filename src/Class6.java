import jdk.nashorn.internal.scripts.JO;

import javax.swing.*;
import java.util.Random;
import java.util.Scanner;
import java.util.jar.JarOutputStream;

public class Class6 {
    public static void main(String[] args) {
        Random ran = new Random();
        Scanner scan = new Scanner(System.in);
//        int[] pole = new int[50];
//        for (int i = 0; i < pole.length; i++) {
//            pole[i] = ran.nextInt(10);
//            if (pole[i] == 7 || pole[i] == 8) {
//                pole[i] = 0;
//            }
//            if (pole[i] == 5) {
//                System.out.println(pole[i] + " sa nachadza na pozicii " + i);
//            } else {
//                System.out.println(pole[i]);
//            }
//        }
//
//        for (int j = pole.length - 1; j >= 0; j--) {
//            System.out.println(pole[j]);
//        }
//        char znak;
//        znak = scan.next().charAt(0);
//        boolean[] bpole = new boolean[14];
//        String[] spole = new String[14];
//        int sucet = 0;
//        for (int i = 0; i < 1000; i++) {
//            if (i % 5 == 0 || i % 3 == 0) {
//                sucet += i;
//            }
//
//            System.out.println("Sucet cisel ktore sa daju delit 3 a 5 je " + sucet);
//            int cislo1 = 0;
//            int cislo2 = 1;
//            int cislo3;
//            for (int o = 2; o <= 36; o++) {
//                cislo3 = cislo1 + cislo2;
//                cislo1 = cislo2;
//                cislo2 = cislo3;
//                if (cislo3 % 2 == 0) {
//                    sucet = cislo3 + sucet;
//                    System.out.println(cislo3);
//                }
//            }
//            System.out.println(sucet);
//            boolean najdene = false;
//            int i = 0;
//            while (!najdene) {
//                i++;
//                if (i % 2 == 0 && i % 3 == 0 && i % 4 == 0 && i % 5 == 0 && i % 6 == 0 && i % 7 == 0 && i % 8 == 0 && i % 9 == 0 && i % 11 == 0 && i % 12 == 0 && i % 13 == 0 && i % 14 == 0 && i % 15 == 0 && i % 16 == 0 && i % 17 == 0 && i % 18 == 0 && i % 19 == 0 && i % 20 == 0 && i % 10 == 0) {
//                    najdene = true;
//                    System.out.println(i);
//                }
//            }
//            String text = JOptionPane.showInputDialog("Zadaj cislo");
//            int cislo = -1;
//            boolean spravnyVstup = true;
//            try {
//                cislo = Integer.parseInt(text);
//            } catch (Exception e) {
//                spravnyVstup = false;
//                JOptionPane.showMessageDialog(null, "Zadal si zly vstup");
//            }
//            if (spravnyVstup) {
//                JOptionPane.showMessageDialog(null, cislo * 2);
//            }
            // v zatvorke je 1. komponent 2. otazka 3.nazov
            int rozhodnutie = JOptionPane.showConfirmDialog(null, "Urcite?");
            if (rozhodnutie == 0) {
                JOptionPane.showMessageDialog(null, "No ved preto");
            } else {
                JOptionPane.showConfirmDialog(null, "Si si isty?");
            }
        }
    }