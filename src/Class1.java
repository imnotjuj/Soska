import java.util.Random;

public class Class1 {
    public static void main(String[] args) {
        String t1 = "anna";
        String t2 = "";
//        for (int i = 1; i <= t1.length(); i++) {
//            t2 += t1.charAt(t1.length() - i);
//        }
//
//        if (t2.equals(t1)) {
//            System.out.println("JE palindrom");
//        } else {
//            System.out.println("Nieje palindrom");
//        }
        Random ran = new Random();
        boolean sest = false;
        int c;
        int c1 = 0;
        int hod = 0;
        int sestpocet = 0;

        while (!sest){
            c = ran.nextInt(6)+1;
            if (c==6){
                sestpocet++;
            }
            if (sestpocet == 100){
                sest = true;
            }
            hod++;
        }
        System.out.println("Na 100 6tiek sme potrebovali " + hod +  " hodov.");
    }
}
