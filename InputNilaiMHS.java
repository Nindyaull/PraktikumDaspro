import java.util.Scanner;

public class InputNilaiMHS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jumlah, i;
        int total = 0;
        int max, min;

     System.out.print("Masukkan jumlah nilai mahasiswa: ");
        jumlah = sc.nextInt();
        int[] nilai = new int[jumlah];
     System.out.println("Masukkan nilai mahasiswa:");
    
    for (i = 0; i < jumlah; i++) { 
            System.out.print("Nilai ke-" + (i + 1) + ": ");
            nilai[i] = sc.nextInt();
            total = total + nilai[i]; 
        }
        
        max = nilai[0];
        min = nilai[0];
        
        for (i = 0; i < jumlah; i++) {
            if (nilai[i] > max) {
                max = nilai[i];
            }
            if (nilai[i] < min) {
                min = nilai[i];
            }
        }
        double rata = (double) total / jumlah;
        System.out.println("Daftar Nilai Mahasiswa");
        for (i = 0; i < jumlah; i++) {
            System.out.println("Nilai ke-" + (i + 1) + ": " + nilai[i]);
        }
        System.out.println("Hasil Perhitungan");
        System.out.println("Total nilai : " +total);
        System.out.println("Rata-rata   : " + rata);
        System.out.println("Tertinggi   : " + max);
        System.out.println("Terendah    : " + min);

       sc.close();
  }
}

