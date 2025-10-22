package jobsheet6;

import java.util.Scanner;

public class caseMethode1_22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // JUDUL TAMPILAN PERTAMA
        System.out.println("=== INPUT DATA MAHASISWA ===");
        System.out.print("Nama  : ");
        String masukkanNama = sc.nextLine();
        System.out.print("NIM   : ");
        long masukkanNIM = sc.nextLong();
        System.out.println();

        // INPUT NILAI PERTAMA
        System.out.println("--- Mata Kuliah 1: Algoritma dan Pemrograman ---");
        System.out.print("Nilai UTS     : ");
        double nilaiUTS = sc.nextDouble();
        System.out.print("Nilai UAS     : ");
        double nilaiUAS = sc.nextDouble();
        System.out.print("Nilai Tugas   : ");
        double nilaiTugas = sc.nextDouble();
        System.out.println();

        // INPUT NILAI KEDUA
        System.out.println("--- Mata Kuliah 2: Struktur Data ---");
        System.out.print("Nilai UTS     : ");
        double nilaiUTS2 = sc.nextDouble();
        System.out.print("Nilai UAS     : ");
        double nilaiUAS2 = sc.nextDouble();
        System.out.print("Nilai Tugas   : ");
        double nilaiTugas2 = sc.nextDouble();
        System.out.println();

        // JUDUL TAMPILAN KEDUA
        System.out.println("========== HASIL PENILAIAN AKADEMIK ==========");
        System.out.println("Nama  : " + masukkanNama);
        System.out.println("NIM   : " + masukkanNIM);
        System.out.println();

        // KOMPONEN PENILAIAN
        double nilaiAkhir1 = (nilaiUTS * 0.3) + (nilaiUAS * 0.4) + (nilaiTugas * 0.3);
        double nilaiAkhir2 = (nilaiUTS2 * 0.3) + (nilaiUAS2 * 0.4) + (nilaiTugas2 * 0.3);

        System.out.printf("%-25s %-5s %-5s %-7s %-13s %-12s %-10s%n",
                "Mata Kuliah", "UTS", "UAS", "Tugas", "Nilai Akhir", "Nilai Huruf", "Status");
        System.out.println("-----------------------------------------------------------------------------------------------");

        // PENENTUAN LULUS DAN TIDAK LULUS
        String nilaiHuruf1 = konversiHuruf(nilaiAkhir1);
        String status1 = (nilaiAkhir1 >= 60) ? "LULUS" : "TIDAK LULUS";
        System.out.printf("%-25s %-5.0f %-5.0f %-7.0f %-13.2f %-12s %-10s%n",
                "Algoritma Pemrograman", nilaiUTS, nilaiUAS, nilaiTugas, nilaiAkhir1, nilaiHuruf1, status1);

        String nilaiHuruf2 = konversiHuruf(nilaiAkhir2);
        String status2 = (nilaiAkhir2 >= 60) ? "LULUS" : "TIDAK LULUS";
        System.out.printf("%-25s %-5.0f %-5.0f %-7.0f %-13.2f %-12s %-10s%n",
                "Struktur Data", nilaiUTS2, nilaiUAS2, nilaiTugas2, nilaiAkhir2, nilaiHuruf2, status2);

        // RATA-RATA
        double rataRata = (nilaiAkhir1 + nilaiAkhir2) / 2;
        System.out.println("-----------------------------------------------------------------------------------------------");
        System.out.printf("Rata-Rata Nilai Akhir : %.2f%n", rataRata);

        // NESTED IF 
        if (status1.equals("LULUS") && status2.equals("LULUS")) {
            System.out.println("Status Semester : LULUS");
            if (rataRata >= 70) {
                System.out.println("Status Semester : LULUS");
            } else {
                System.out.println("Status Semester : TIDAK LULUS (Rata-Rata < 70)");
            }
        } else {
            System.out.println("Status Semester : TIDAK LULUS");
        }

        System.out.println("=============================================================");
        sc.close();
    }

    // IF ELSE UNTUK KONVERSI KE NILAI HURUF
    public static String konversiHuruf(double nilai) {  
        String huruf;

        if (nilai > 80 && nilai <= 100) {
                huruf = "A";
            } else if (nilai > 73 && nilai <= 80) {
                huruf = "B+";
            } else if (nilai > 65 && nilai <= 73) {
                huruf = "B";
            } else if (nilai > 60 && nilai <= 65) {
                huruf = "C+";
            } else if (nilai > 50 && nilai <= 60) {
                huruf = "C";
            } else if (nilai > 39 && nilai <= 50) {
                huruf = "D";
            } else {
                huruf = "E";
            }
            return huruf;
    }
}