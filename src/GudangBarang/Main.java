package GudangBarang;

import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in); //Scanner
    static Gudang gudang = new Gudang(); //inisialisasi class Gudang

    public static void main(String[] args) {

        int idProduk = 3, stock, barcode, serialNumber, menu, kategori,harga;
        String namaDistributor, namaProduk, status, berat, tanggalDiterima, tanggalKadaluarsa, penyimpananKhusus, noReg, garansi, jenisFashion, ukuran, bahan, warna, model, kategoriProduk, tanggalSekarang,varian;
        tanggalSekarang = gudang.getTanggal();
        productDummy();
        do {
            System.out.println(
                    "==============[Pilih Menu]=================\n" +
                            "Gudang Barang \n" +
                            "1. Tambah Produk \n" +
                            "2. Menampilkan Semua produk \n" +
                            "3. Menampikan Berdasarkan kategori\n" +
                            "4. Menampilkan Berdasarkan Urutan Nama\n" +
                            "5. Hapus Semua Produk\n" +
                            "6. Hapus Berdasarkan ID Produk\n" +
                            "7. Keluar\n" +
                            "===========================================\n"
            );
            System.out.print("Menu Ke - ");
            menu = scanner.nextInt();
            switch (menu) {
                case 1:
                    idProduk++;
                    tanggalDiterima = tanggalSekarang;
                    System.out.println("Masukan data berikut.");
                    System.out.println("Stock            : ");
                    stock = scanner.nextInt();
                    System.out.println("Barcode          : ");
                    barcode = scanner.nextInt();
                    System.out.println("Nama Distributor : ");
                    namaDistributor = scanner.next();
                    System.out.println("Nama Produk      : ");
                    namaProduk = scanner.next();
                    System.out.println("Status           : ");
                    status = scanner.next();
                    System.out.println("Berat (gram)     : ");
                    berat = scanner.next();
                    System.out.print("Harga            :\n" +
                            "Rp. ");
                    harga = scanner.nextInt();
                    System.out.print(
                            "Kategori Produk  :\n" +
                                    "1. Frozen Food \n" +
                                    "2. Electronic \n" +
                                    "3. Fashion\n" +
                                    "4. Snack\n" +
                                    "Masukan kategori : "
                    );
                    kategori = scanner.nextInt();
                    if (kategori == 1) {
                        kategoriProduk = "Frozen Food";
                        System.out.println("Kategori Produk " + kategoriProduk);
                        System.out.println("Tanggal Kadaluarsa     : ");
                        tanggalKadaluarsa = scanner.next();
                        System.out.print("Penyimpanan Khusus [Ya/Tidak]\n" +
                                "Masukan pilihan : ");
                        penyimpananKhusus = scanner.next();
                        System.out.print("No Registrasi\n" +
                                "1. BPOM\n" +
                                "2. P-IRT\n" +
                                "3. Halal MUI\n" +
                                "Nomer Registrasi ");
                        noReg = scanner.next();
                        gudang.addProduct(new FrozenFood(idProduk, stock, barcode, namaDistributor, namaProduk, status, berat, kategoriProduk, tanggalDiterima, harga, tanggalKadaluarsa, penyimpananKhusus, noReg));
                        System.out.println("Data Produk " + kategoriProduk + " Berhasil Ditambah!");
                    } else if (kategori == 2) {
                        kategoriProduk = "Electronic";
                        System.out.println("Serial Number : ");
                        serialNumber = scanner.nextInt();
                        System.out.println("Tanggal Garansi :");
                        garansi = scanner.next();
                        gudang.addProduct(new Electronic(idProduk, stock, barcode, namaDistributor, namaProduk, status, berat, kategoriProduk, tanggalDiterima, harga,serialNumber,garansi));
                        System.out.println("Data Produk " + kategoriProduk + " Berhasil Ditambah!");
                    } else if (kategori == 3) {
                        kategoriProduk = "Fashion";
                        System.out.print("Jenis Fashion\n" +
                                "1. Baju\n" +
                                "2. Celana\n" +
                                "3. Sepatu\n" +
                                "4. Topi\n" +
                                "5. Aksesoris\n" +
                                        "Masukan jenis fashion : "
                                );
                        jenisFashion = scanner.next();
                        System.out.print("Ukuran [Angka/Huruf]\n" +
                                "Masukan ukuran     :  ");
                        ukuran = scanner.next();
                        System.out.println("Bahan   :" );
                        bahan = scanner.next();
                        System.out.println("Warna   : ");
                        warna = scanner.next();
                        System.out.println("Model   :");
                        model = scanner.next();
                        gudang.addProduct(new Fashion(idProduk, stock, barcode, namaDistributor, namaProduk, status, berat, kategoriProduk, tanggalDiterima, harga,jenisFashion,ukuran,bahan,warna,model));
                        System.out.println("Data Produk " + kategoriProduk + " Berhasil Ditambah!");
                    } else if (kategori == 4) {
                        kategoriProduk = "Snack";
                        System.out.println("Varian             :");
                        varian = scanner.next();
                        System.out.println("Tanggal Kadaluarsa :");
                        tanggalKadaluarsa = scanner.next();
                        gudang.addProduct(new Snack(idProduk, stock, barcode, namaDistributor, namaProduk, status, berat, kategoriProduk, tanggalDiterima, harga,varian,tanggalKadaluarsa));
                        System.out.println("Data Produk " + kategoriProduk + " Berhasil Ditambah!");
                    } else {
                        System.out.println("Masukan Kategori Produk");
                    }
                    break;
                case 2:
                    gudang.showAllProduct();
                    break;
                case 3:
                    System.out.print(
                            "Daftar Kategori Produk\n" +
                                    "1. Frozen Food \n" +
                                    "2. Electronic \n" +
                                    "3. Fashion\n" +
                                    "4. Snack\n" +
                                    "Angka kategori -  "
                    );
                    kategori = scanner.nextInt();
                    if (kategori == 1) {
                        gudang.showProductFrozenFood();
                    } else if (kategori == 2){
                        gudang.showProductElectronic();
                    }else if (kategori == 3){
                        gudang.showProductFashion();
                    }else if (kategori == 4){
                        gudang.showProductSnack();
                    }else{
                        System.out.println();
                        System.out.println("Angka - " + kategori + " tidak tersedia.\n" +
                                "Silahkan pilih angka 1-4");
                    }
                    break;
                case 4:
                    gudang.showBySortingNameProduct();
                    break;
                case 5:
                    gudang.removeAllProduct();
                    break;
                case 6:
                    System.out.println("Masukan Id Produk : ");
                    idProduk = scanner.nextInt();
                    gudang.removeByIdProduct(idProduk);
                    System.out.println("ID Produk " + idProduk + " Berhasil Dihapus!");
                    break;
                default:
                    System.out.println("Keluar!");
                    System.exit(0);
            }
        } while (true);

    }


    public static void productDummy() {
        gudang.addProduct(new Electronic(1,200,123124,"Terang","Mouse", "Baru","250","Electronic","11/11/2020", 17500,87766556,"Distributor"));
        gudang.addProduct(new FrozenFood(2,100,435345,"Alfaria","Indomie","Ada","200","Frozen Food","11/11/2020",2500,"10/11/2022","Ya","BPOM"));
    }
}
