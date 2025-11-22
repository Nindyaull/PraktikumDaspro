package jobsheet9;

import java.util.Scanner;

public class SearchingKafe22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String key;
        int hasil = 0;
        
        String menu[] = {"Nasi Goreng", "Mie Goreng", "Roti Bakar", 
                        "Kentang Goreng", "Teh Tarik", "Cappucino", "Chocolate Ice"};
        
        // array-for each
        System.out.println("Menu yang tersedia: ");
        for (String a : menu) {
            System.out.println("- " +a);
        }

        System.out.print("Masukkan menu yang ingin dicari: ");
        key = sc.nextLine();

        for (int i = 0; i < menu.length; i++) {
            if (key.equalsIgnoreCase(menu[i])) {
                hasil = i+1;
                System.out.println("Menu " + key + " tersedia, berada di urutan ke-" +hasil);
                break;
            }
        }

        if (hasil == 0) {
            System.out.println("Menu yang diinginkan tidak ditemukan");
        }
        System.out.println();
    }
}
