package jobsheet6;

import java.util.Scanner;

public class caseMethod1_modifikasi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // JUDUL TAMPILAN PERTAMA
        System.out.println("=== INPUT DATA MAHASISWA ===");
        System.out.print("Nama  : ");
        String masukkanNama = sc.nextLine();
        System.out.print("NIM   : ");
        String masukkanNIM = sc.nextLine();
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

        // INPUT NILAI KETIGA
        System.out.println("--- Mata kuliah 3: Percabangan (If else) ---");
        System.out.print("Nilai UTS      : ");
        double nilaiUTS3 = sc.nextDouble();
        System.out.print("Nilai UAS      : ");
        double nilaiUAS3 = sc.nextDouble();
        System.out.print("Nilai Tugas  : ");
        double nilaiTugas3 = sc.nextDouble();
        System.out.println();

        // JUDUL TAMPILAN KEDUA
        System.out.println("========== HASIL PENILAIAN AKADEMIK ==========");
        System.out.println("Nama  : " + masukkanNama);
        System.out.println("NIM   : " + masukkanNIM);
        System.out.println();

        // KOMPONEN PENILAIAN
        double nilaiAkhir1 = (nilaiUTS * 0.3) + (nilaiUAS * 0.4) + (nilaiTugas * 0.3);
        double nilaiAkhir2 = (nilaiUTS2 * 0.3) + (nilaiUAS2 * 0.4) + (nilaiTugas2 * 0.3);
        double nilaiAkhir3 = (nilaiUTS3 * 0.3) +  (nilaiUAS3 * 0.4) + (nilaiTugas3 * 0.3);

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

        String nilaiHuruf3 = konversiHuruf(nilaiAkhir3);
        String status3 = (nilaiAkhir3 >= 60) ? "LULUS" : "TIDAK LULUS";
        System.out.printf("%-25s %-5.0f %-5.0f %-7.0f %-13.2f %-12s %-10s%n", 
                "Percabangan (If else)", nilaiUTS3, nilaiUAS3, nilaiTugas3, nilaiAkhir3, nilaiHuruf3, status3);

        // RATA-RATA
        double rataRata = (nilaiAkhir1 + nilaiAkhir2 + nilaiAkhir3) / 3;
        System.out.println("-----------------------------------------------------------------------------------------------");
        System.out.printf("Rata-Rata Nilai Akhir : %.2f%n", rataRata);

        // NESTED IF 
        if (rataRata >= 70) {
            System.out.println("Status Semester : LULUS");
        } else {
            if (rataRata >= 60) {
                System.out.println("Status Semester : PERBAIKAN");
            } else {
                System.out.println("Status Semester : TIDAK LULUS (Rata-rata < 70)");
            }
        }

        System.out.println("=============================================================");
        sc.close();
    }

    // IF ELSE UNTUK KONVERSI KE NILAI HURUF
    public static String konversiHuruf(double nilai) {
        if (nilai >= 85) return "A";
        else if (nilai >= 80) return "B+";
        else if (nilai >= 75) return "B";
        else if (nilai >= 70) return "C+";
        else if (nilai >= 65) return "C";
        else if (nilai >= 60) return "D";
        else return "E";

        // pakai return karena method ini funsinya untuk mengembalikan nilai, sedangkan method yang memakai void tidak sedang mengembalikan nilai
    }
}
