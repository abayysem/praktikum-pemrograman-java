/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author USER
 */
import java.util.Scanner;

public class GameZoneRentalPS {

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        String transaksi;

        do {
            transaksi();

            System.out.print("\nTransaksi Baru (Y/T): ");
            transaksi = input.nextLine().trim();

        } while (transaksi.equalsIgnoreCase("Y"));

        System.out.println("Terima kasih!");
        input.close();
    }

    public static void transaksi() {
        System.out.println("====================================");
        System.out.println("        GAMEZONE RENTAL PS");
        System.out.println("====================================");

        System.out.print("Nama Pelanggan : ");
        String nama = input.nextLine();

        System.out.println("1. PlayStation 4 - Rp8000/jam");
        System.out.println("2. PlayStation 5 - Rp12000/jam");

        int pilihan;
        do {
            System.out.print("Pilihan         : ");
            pilihan = Integer.parseInt(input.nextLine());

            if (pilihan != 1 && pilihan != 2) {
                System.out.println("Pilih angka 1 atau 2!");
            }
        } while (pilihan != 1 && pilihan != 2);

        String konsol;
        int harga;

        if (pilihan == 1) {
            konsol = "PlayStation 4";
            harga = 8000;
        } else {
            konsol = "PlayStation 5";
            harga = 12000;
        }

        int durasi;
        do {
            System.out.print("Lama Bermain    : ");
            durasi = Integer.parseInt(input.nextLine());

            if (durasi <= 0) {
                System.out.println("Durasi harus lebih dari 0!");
            }
        } while (durasi <= 0);

        int biayaSewa = harga * durasi;
        int diskon = 0;

        if (durasi >= 3) {
            diskon = biayaSewa * 10 / 100;
        }

        System.out.print("Tambah Minuman (Y/T): ");
        String jawaban = input.nextLine().trim();

        int biayaMinuman = 0;
        if (jawaban.equalsIgnoreCase("Y")) {
            biayaMinuman = 5000;
        }

        int totalBayar = biayaSewa - diskon + biayaMinuman;

        System.out.println("\n------------------------------------");
        System.out.println("           STRUK GAMEZONE");
        System.out.println("------------------------------------");
        System.out.println("Pelanggan       : " + nama);
        System.out.println("Konsol          : " + konsol);
        System.out.println("Durasi          : " + durasi + " jam");
        System.out.println("Biaya Sewa      : Rp" + biayaSewa);
        System.out.println("Diskon (10%)    : Rp" + diskon);
        System.out.println("Minuman         : Rp" + biayaMinuman);
        System.out.println("TOTAL BAYAR     : Rp" + totalBayar);
        System.out.println("====================================");
    }
}
