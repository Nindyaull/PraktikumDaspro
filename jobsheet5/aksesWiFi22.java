package jobsheet5;

import java.util.Scanner;

public class aksesWiFi22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== Layanan WiFi ===");
        System.out.print("Masukkan jenis pengguna (Dosen/Mahasiswa): ");
        String jenis_Pengguna = sc.nextLine();
        
        if (jenis_Pengguna.equalsIgnoreCase("Mahasiswa")) {
            System.out.print("Masukkan jumlah SKS: ");
            int jumlah_SKS = sc.nextInt();
            if (jumlah_SKS >= 12) {
                System.out.println("Akses WiFi diberikan (Mahasiswa Aktif)");
            } else {
                System.out.println("Akses ditolak, SKS kurang dari 12");
            }
        } else if (jenis_Pengguna.equalsIgnoreCase("Dosen")) {
            System.out.println("Akses WiFI diberikan (Dosen)");
        } else {
            System.out.println("Akses ditolak");
        }
    }
}
