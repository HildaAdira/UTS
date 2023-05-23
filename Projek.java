//Hilaria Iwung
//227064516036
package projek;

import java.util.Scanner;

public class Projek {

    public static void main(String[] args) {
       
      
        Scanner input = new Scanner(System.in);
        
        // Judul program dan informasi konser
        System.out.println("## COLDPLAY MUSIC of SPHERES ##");
        System.out.println("========== WORLD TOUR ==========");
        System.out.println("GELORA BUNG KARNO STADIUM JAKARTA");
        System.out.println();
        
        // Kategori tiket yang tersedia
        System.out.println("Kategori tiket yang tersedia:");
        System.out.println("1. Category 1 (Rp5.000.000)");
        System.out.println("2. Category 2 (Rp4.000.000)");
        System.out.println("3. Category 3 (Rp3.250.000)");
        System.out.println("4. Category 4 (Rp2.500.000)");
        System.out.println();
        
        // Input jumlah tiket dan kategori
        System.out.print("Pilih kategori tiket (1-4): ");
        int kategori = input.nextInt();
        System.out.print("Masukkan jumlah tiket yang ingin dibeli: ");
        int jumlahTiket = input.nextInt();
        
        // Menghitung total harga tiket
        int hargaTiket = 0;
        switch (kategori) {
            case 1:
                hargaTiket = 5000000;
                break;
            case 2:
                hargaTiket = 4000000;
                break;
            case 3:
                hargaTiket = 3250000;
                break;
            case 4:
                hargaTiket = 2500000;
                break;
            default:
                System.out.println("Kategori tiket tidak valid!");
                return;
        }
        int totalHarga = hargaTiket * jumlahTiket;
        
        // Invoice pembelian
        System.out.println("=============================================");
        System.out.println("                INVOICE PEMBELIAN              ");
        System.out.println("=============================================");
        System.out.println("Kategori Tiket: Category " + kategori);
        System.out.println("Jumlah Tiket  : " + jumlahTiket);
        System.out.println("Harga Tiket   : Rp" + totalHarga);
        System.out.println("=============================================");
        System.out.println();
        
        // Pembayaran
        System.out.print("Masukkan jumlah uang yang akan dibayarkan: Rp");
        int jumlahUang = input.nextInt();
        
        // Menghitung kembalian
        int kembalian = jumlahUang - totalHarga;
        
        // Menampilkan kembalian
        System.out.println("Kembalian     : Rp" + kembalian);
        System.out.println("=============================================");
    }
}
    


