package jobsheet5;

import java.util.Scanner;

public class sistemMasukPerpustakaan22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("=== Layanan Perpustakaan Polinema ===");
        System.out.print("Apakah anda membawa kartu mahasiswa? (true/false): ");
        boolean syarat_Masuk1 = sc.nextBoolean();
        System.out.print("Apakah anda sudah melakukan registrasi online? (true/false): ");
        boolean syarat_Masuk2 = sc.nextBoolean();

        if (syarat_Masuk1 && syarat_Masuk2) {
            System.out.println("Boleh masuk");
        } else {
            System.out.println("Tidak boleh masuk");
        }
    }
}
