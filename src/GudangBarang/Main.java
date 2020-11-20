package GudangBarang;

import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    static Gudang gudang = new Gudang();

    public static void main(String[] args) {
        int idProduk, stock, barcode, serialNumber, menu;
        String namaDistributor, namaProduk, status, berat, kategoriProduk, tanggalDiterima, tanggalKadaluarsa, penyimpananKhusus, noReg, garansi, jenisFashion, ukuran, bahan, warna, model;
        double harga;
        do {
            System.out.println(
                    "==============[Pilih Menu]=================\n" +
                            "Gudang Barang \n" +
                            "1. Tambah Produk \n" +
                            "2. Menampilkan Semua produk \n" +
                            "3. Menampikan Berdasarkan kategori\n" +
                            "4. Menampilkan Berdasarkan Urutan Nama\n" +
                            "5. Hapus Semua Produk" +
                            "6. Keluar\n" +
                            "===========================================\n"
            );
            System.out.print("Menu Ke - ");
            menu = scanner.nextInt();
            switch (menu) {
                case 1:
                    System.out.println("Masukan data berikut.");
                    System.out.println("ID Produk    : ");
                    idProduk = scanner.nextInt();
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    gudang.removeAllProduct();
                    break;
                default:
                    System.exit(0);
                    System.out.println("Keluar!");
            }
        } while (true);

    }
}
