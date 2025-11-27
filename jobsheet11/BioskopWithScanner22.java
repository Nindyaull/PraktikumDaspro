package jobsheet11;

import java.util.Scanner;

public class BioskopWithScanner22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int baris, kolom, menu;
        String nama;
        String[][] penonton = new String[4][2];
        char[][] kursi = new char[4][2];

        while (true) {
            System.out.println("\n--- MENU BIOSKOP ---");
            System.out.println("1. Input data penonton");
            System.out.println("2. Tampilkan daftar penonton");
            System.out.println("3. Exit");
            System.out.print("Pilih menu: ");
            menu = sc.nextInt();
            sc.nextLine();

            if (menu == 1) {
                System.out.print("Masukkan nama: ");
                nama = sc.nextLine();
                System.out.print("Masukkan baris: ");
                baris = sc.nextInt();
                System.out.print("Masukkan kolom: ");
                kolom = sc.nextInt();
                sc.nextLine();

                if (baris < 1 || baris > 4 || kolom < 1 || kolom > 2) {
                    System.out.println("Nomor baris/kolom kursi tidak tersedia :(");
                    continue;
                }

                if (kursi[baris-1][kolom-1] == 'x') {   //pakai char karena kodenya 'x', kalau String pakai "x"
                    System.out.println("Kursi sudah terisi, mohon pilih kursi lain.");
                    continue;
                } else {
                    kursi[baris-1][kolom-1] = 'x';
                    System.out.println("Kursi berhasil dipesan!");
                }

                penonton[baris-1][kolom-1] = nama;

                System.out.println("Data penonton disimpan");

            } else if (menu == 2) {
                System.out.println("\n--- DAFTAR PENONTON ---");

                for (int i = 0; i < penonton.length; i++) {
                    for (int j = 0; j < penonton[i].length; j++) {
                        String isi = penonton[i][j];
                        if (penonton[i][j] == null) {
                            System.out.print("*** \t");
                        } else {
                            System.out.print(isi + "\t");
                        }
                    }
                    System.out.println();
                }
            } else if (menu == 3) {
                System.out.println("Program selesai, terimakasihh >_<");
                break;
            } else {
                System.out.println("Menu tidak valid!");
            }


            // System.out.print("Input penonton lainnya? (y/n): ");
            // next = sc.nextLine();

            // if (next.equalsIgnoreCase("n")) {
            //     break;
            // }
            
        }
    }
    
}
