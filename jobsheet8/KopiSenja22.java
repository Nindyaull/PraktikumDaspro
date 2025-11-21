package jobsheet8;

import java.util.Scanner;

public class KopiSenja22 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int cabang, jumlahPelanggan, totalSemuaPelanggan = 0, jumlahPesanan, pesanan, totalSemuaPesanan = 0;

    int i = 1, j = 1;

    System.out.print("Jumlah Cabang Kafe: ");
    cabang = sc.nextInt();

    System.out.println("\n----- Input Penjualan Per Cabang -----");

    do {
        System.out.println("\n--- Cabang " + i + " ---");

        System.out.print("Jumlah Pelanggan: ");
        jumlahPelanggan = sc.nextInt();

        jumlahPesanan = 0;

        for (j = 1; j <= jumlahPelanggan; j++) {
            System.out.print("Pelanggan " + j + " memesan berapa item? ");
            pesanan = sc.nextInt();
            jumlahPesanan += pesanan;
        }

        System.out.println("Cabang " + i + ": ");
        System.out.println("- Pelanggan: " + jumlahPelanggan + " Orang");
        System.out.println("- Item Terjual: " + jumlahPesanan + " Item");

        totalSemuaPelanggan += jumlahPelanggan;
        totalSemuaPesanan += jumlahPesanan;

        i++;

    } while (i <= cabang);

    System.out.println("\n====== Total Seluruh Cabang ======");
    System.out.println("Pelanggan : " + totalSemuaPelanggan + " Orang");
    System.out.println("Item Terjual : " + totalSemuaPesanan + " Item");

    sc.close();
    }   
}
