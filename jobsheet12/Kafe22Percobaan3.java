package jobsheet12;

import java.util.Scanner;

public class Kafe22Percobaan3 {
    // public static void Menu(String namaPelanggan, boolean isMember) {
    //     System.out.println("Selamat datang, " + namaPelanggan + "!");
        
    //     if (isMember) {
    //         System.out.println("Anda adalah member");
    //     }
    //     System.out.println("===== MENU RESTO KAFE =====");
    //     System.out.println("1. Kopi Hitam - Rp 15,000");
    //     System.out.println("2. Cappucino - Rp 20,000");
    //     System.out.println("3. Latte - Rp 22,000");
    //     System.out.println("4. Teh Tarik - Rp 12,000");
    //     System.out.println("5. Roti Bakar - Rp 10,000");
    //     System.out.println("6. Mie Goreng - Rp 18,000");
    //     System.out.println("===========================");
    //     System.out.println("Silakan pilih menu yang Anda inginkan");
    // }
    public static int hitungTotalHarga22(int pilihanMenu, int banyakItem, String kodePromo) {
        int[] hargaItems = {15000, 20000, 22000, 12000, 10000, 18000};
        
        int hargaTotal = hargaItems[pilihanMenu - 1] * banyakItem;
        int diskon = 0;
    
        if (kodePromo.equals("DISKON50")) {
            diskon = hargaTotal * 50/100;
            System.out.println("Anda mendapatkan diskon 50%: " + diskon);
        } else if (kodePromo.equals("DISKON30")) {
            diskon = hargaTotal * 30/100;
            System.out.println("Anda mendapatkan diskon 30%: " + diskon);
        } else {
            System.out.println("Kode invalid");
        }
        return hargaTotal - diskon;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nMasukkan nomor menu yang ingin Anda pesan: ");
        int pilihanMenu = sc.nextInt();
        System.out.print("Masukkan jumlah item yang ingin dipesan: ");
        int banyakItem = sc.nextInt();
        sc.nextLine();
        System.out.print("Masukkan kode promo: ");
        String kodePromo = sc.nextLine();

        int totalHarga = hitungTotalHarga22(pilihanMenu, banyakItem, kodePromo); 

        System.out.println("Total harga untuk pesanan Anda: Rp" + totalHarga);
    }
    
}
