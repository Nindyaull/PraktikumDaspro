package jobsheet9;

import java.util.Scanner;

public class Pemesanan22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jumlahMakanan, jumlahMinuman;
        int total = 0;

        System.out.print("Masukkan jumlah pesanan: ");
        jumlahMakanan = sc.nextInt();
        String menuMakanan[] = new String[jumlahMakanan];
        int hargaMakanan[] = new int[jumlahMakanan];

        System.out.println("List menu makanan:");
        for (int i = 0; i < jumlahMakanan; i++) {
            System.out.print((i+1) + ". ");
            sc.nextLine();
            menuMakanan[i] = sc.nextLine();
            System.out.print("Harga menu: ");
            hargaMakanan[i] = sc.nextInt();
        }

        System.out.println("--------------------------------");
        System.out.print("Masukkan jumlah pesanan: ");
        jumlahMinuman = sc.nextInt();
        String menuMinuman[] = new String[jumlahMinuman];
        int hargaMinuman[] = new int[jumlahMinuman];

        System.out.println("List menu minuman:");
        for (int i = 0; i < jumlahMinuman; i++) {
            System.out.print((i+1) + ". ");
            sc.nextLine();
            menuMinuman[i] = sc.nextLine();
            System.out.print("Harga menu: ");
            hargaMinuman[i] = sc.nextInt();
        }

        System.out.println("\n=======================================\n");
        System.out.println("Daftar pesanan yang telah diinput: ");
        System.out.println("\n--- makanan ---");
        for (int i = 0; i < jumlahMakanan; i++) {
            System.out.println((i+1) + ". " + menuMakanan[i] + " = Rp" + hargaMakanan[i]);
            total += hargaMakanan[i];
        }
        System.out.println("\n--- minuman ---");
        for (int i = 0; i < jumlahMinuman; i++) {
            System.out.println((i+1) + ". " + menuMinuman[i] + " = Rp" + hargaMinuman[i]);
            total += hargaMinuman[i];
        }
        System.out.println("\nTotal dari pesanan: Rp" +total);
        System.out.println();
    }
}
