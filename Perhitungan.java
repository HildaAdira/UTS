//Hilaria Iwung
//227064516036
package perhitungan;

import java.util.Scanner;

public class Perhitungan {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
     
        int pin = 1234; // PIN ATM
        int maxAttempts = 3; // Maksimum percobaan memasukkan PIN
        int attempts = 0; // Jumlah percobaan saat ini
        
        
        System.out.println("Selamat datang di ATM XYZ");
        
        while (attempts < maxAttempts) {
            System.out.print("Masukkan PIN Anda: ");
            int enteredPin = scanner.nextInt();
            
            // Percabangan if-else untuk memeriksa kebenaran PIN yang dimasukkan
            if (enteredPin == pin) {
                System.out.println("PIN yang Anda masukkan benar");
                System.out.println("Menu ATM:");
                System.out.println("1. Cek Saldo");
                System.out.println("2. Tarik Tunai");
                System.out.println("3. Transfer");
                System.out.println("4. Keluar");
                
                System.out.print("Masukkan pilihan menu: ");
                int menuChoice = scanner.nextInt();
                
                // Percabangan if-else untuk memproses pilihan menu pengguna
                if (menuChoice == 1) {
                    System.out.println("Saldo Anda: Rp100.000");
                } else if (menuChoice == 2) {
                    System.out.println("Anda berhasil menarik tunai");
                } else if (menuChoice == 3) {
                    System.out.println("Anda berhasil melakukan transfer");
                } else if (menuChoice == 4) {
                    System.out.println("Terima kasih. Sampai jumpa!");
                    break;
                } else {
                    System.out.println("Pilihan menu tidak valid");
                }
            } else {
                System.out.println("PIN yang Anda masukkan salah");
                attempts++;
            }
        }
        
        if (attempts == maxAttempts) {
            System.out.println("Anda telah melebihi batas maksimum percobaan");
            System.out.println("Kartu ATM Anda diblokir");
        }
    }
}

    

