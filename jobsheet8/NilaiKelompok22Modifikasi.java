package jobsheet8;

import java.util.Scanner;

public class NilaiKelompok22Modifikasi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nilai;
        float totalNilai, rataNilai;
        int i = 1;

        float rataTertinggi = 0;
        int kelompokTerbaik = 0;

        while (i <= 6) {
            System.out.println("Kelompok " + i);
            totalNilai = 0;
            for (int j = 1; j<=5; j++) {
                System.out.print(" Nilai dari kelompok penilai " + j + ": ");
                nilai = sc.nextInt();
                totalNilai += nilai;
            }
            rataNilai = totalNilai / 5;
            System.out.println("Kelompok " + i + " nilai rata-rata : " + rataNilai);
            
            if (rataNilai > rataTertinggi) {
                rataTertinggi = rataNilai;
                kelompokTerbaik = i;
            }
            i++;
            System.out.println();
        }
        System.out.println("Kelompok dengan rata-rata tertinggi adalah kelompok : " + kelompokTerbaik + 
        " dengan nilai : " +rataTertinggi);
    }
}
