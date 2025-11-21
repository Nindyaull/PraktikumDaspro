package jobsheet8;

import java.util.Scanner;

public class Kuadrat22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (int i = 1; i <= 5; i++) {
            int total = 0;
            System.out.print("n = " + i + "-> jumlah kuadrat = ");
            for (int j = 1; j <= i; j++ ) {
                int kuadrat = j * j;
                total += kuadrat;

                if (j==i) {
                    System.out.print(kuadrat);
                } else {
                    System.out.print(kuadrat + " + ");
                }
            }
            System.out.println(" = " +total);
        }
    }
}
