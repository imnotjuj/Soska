import com.sun.imageio.plugins.jpeg.JPEGStreamMetadataFormat;

public class Class8 {
    public static void main(String[] args) {
        int pole [][] = new int [5][8];
        int pocitadlo = 0;
        for (int riadok = 0; riadok < pole.length; riadok++){
            for (int stlpec = 0; stlpec < pole[0].length; stlpec++){
                pocitadlo++;
                pole [riadok][stlpec] = pocitadlo;
                System.out.print(pole[riadok][stlpec] + " ");
            }
            System.out.println();
        }

    }
}
