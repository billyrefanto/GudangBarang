package GudangBarang;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;

public class Gudang {
    ArrayList<DataProduk> dataProduks = new ArrayList<>();

    //Method addProduct untuk menambahkan dataProduk
    public void addProduct(DataProduk product){
        dataProduks.add(product);
    }

    //Method removeAllProduct() berfungsi untuk menghapus semua data produk, mengunakan java collection clear
    public void removeAllProduct(){
        if (dataProduks.isEmpty()){
            System.out.println("Tidak ada produk!");
        }else{
            dataProduks.clear();
            System.out.println("Hapus semua produk berhasil!");
        }
    }
    //Method removeByIdProduct berfungsi untuk menghapus data produk mengunakan parameter idProduk
    public void removeByIdProduct(int idProduct){
        if (dataProduks.isEmpty()){
            System.out.println("Tidak ada produk!");
        }else {
            for (int i = 0; i < dataProduks.size() ; i++) {
                if (idProduct == dataProduks.get(i).idProduk){
                    dataProduks.remove(i);
                    System.out.println("ID Produk " + idProduct + " Berhasil Dihapus!");
                }
            }
        }
    }
    //Method showAllProduct() berfungsi untuk menampilkan semua data produk
    public void showAllProduct(){
        if (dataProduks.isEmpty()) {
            System.out.println("Tidak ada produk!");
        } else {
            for (DataProduk product : dataProduks) {
                product.Display();
            }
        }
    }
    //Method showProductFrozenFood() berfungsi untuk menampilkan data produk berdasarkan kategori produk frozen food
    public void showProductFrozenFood(){
        if (dataProduks.isEmpty()){
            System.out.println("Tidak ada produk!");
        }else {
            for (DataProduk product : dataProduks) {
                if (product.kategoriProduk.equals("Frozen Food"))
                    product.Display();
            }
        }
    }

    //Method showProductElectronic() berfungsi untuk menampilkan data produk berdasarkan kategori produk Electronic
    public void showProductElectronic(){
        if (dataProduks.isEmpty()){
            System.out.println("Tidak ada produk!");
        }else {
            for (DataProduk product : dataProduks) {
                if (product.kategoriProduk.equals("Electronic"))
                    product.Display();
            }
        }
    }

    //Method showProductFashion() berfungsi untuk menampilkan data produk berdasarkan kategori produk Fashion
    public void showProductFashion(){
        if (dataProduks.isEmpty()){
            System.out.println("Tidak ada produk!");
        }else {
            for (DataProduk product : dataProduks) {
                if (product.kategoriProduk.equals("Fashion"))
                    product.Display();
            }
        }
    }

    //Method showProductSnack() berfungsi untuk menampilkan data produk berdasarkan kategori produk Snack
    public void showProductSnack(){
        if (dataProduks.isEmpty()){
            System.out.println("Tidak ada produk!");
        }else {
            for (DataProduk product : dataProduks) {
                if (product.kategoriProduk.equals("Snack"))
                    product.Display();
            }
        }
    }

    //Method showBySortingNameProduct() berfungsi untuk menampilkan data produk berdasarkan urutan nama produk dari A-Z
    public void showBySortingNameProduct(){
        SortByName sortNamaProduk = new SortByName();
        if (dataProduks.isEmpty()){
            System.out.println("Tidak ada data koleksi!");
        }else{
            Collections.sort(dataProduks,sortNamaProduk);
            for (DataProduk listKoleksi : dataProduks) {
                listKoleksi.Display();
            }
        }

    }

    //Untuk mensorting data berdasarkan nama produk, dari A-Z
    static class SortByName implements Comparator<DataProduk> {
        @Override
        public int compare(DataProduk produk1, DataProduk produk2) {
            return produk1.getNamaProduk().compareTo(produk2.getNamaProduk());
        }
    }
    //Untuk memanggil data tanggal
    public String getTanggal() {
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        Date date = new Date();
        return dateFormat.format(date);
    }
}
