package jobsheet9;

import java.util.Scanner;

public class KelolaNilai22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jumlah;
        double rataRata;
        double total = 0;
        int tinggi, rendah;

        System.out.print("Jumlah nilai mahasiswa yang diinput: ");
        jumlah = sc.nextInt();
        int nilaiMHS[] = new int[jumlah];

        for (int i = 0; i < jumlah; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-"+(i+1)+" : ");
            nilaiMHS[i] = sc.nextInt();
        }
        System.out.println();

        System.out.println("Tampilan nilai mahasiswa yang sudah diinput: ");
        tinggi = nilaiMHS[0];
        rendah = nilaiMHS[0];

        for (int i = 0; i < jumlah; i++) {
            System.out.println("Nilai mahasiswa ke-"+(i+1)+" adalah " +nilaiMHS[i]);
            total += nilaiMHS[i];
            if (tinggi < nilaiMHS[i]) {
                tinggi = nilaiMHS[i];
            } else if (rendah > nilaiMHS[i]) {
                rendah = nilaiMHS[i];
            }
        }
        
        rataRata = total / nilaiMHS.length;
        System.out.println("Nilai tertinggi adalah: " +tinggi);
        System.out.println("Nilai terendah adalah: " +rendah);
        System.out.println("Rata-rata nilai = " +rataRata);
        
    }
    
}
