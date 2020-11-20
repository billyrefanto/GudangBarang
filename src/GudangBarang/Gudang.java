package GudangBarang;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;

public class Gudang {
    ArrayList<DataProduk> dataProduks = new ArrayList<>();
    public void addProduct(DataProduk product){
        dataProduks.add(product);
    }
    public void removeAllProduct(){
        if (dataProduks.isEmpty()){
            System.out.println("Tidak ada produk!");
        }else{
            dataProduks.clear();
            System.out.println("Hapus semua produk berhasil!");
        }
    }

    public void removeByIdProduct(int idProduct){
        if (dataProduks.isEmpty()){
            System.out.println("Tidak ada produk!");
        }else {
            for (int i = 0; i < dataProduks.size() ; i++) {
                if (idProduct == dataProduks.get(i).idProduk){
                    dataProduks.remove(i);
                }

            }
        }
    }

    public void showAllProduct(){
        if (dataProduks.isEmpty()) {
            System.out.println("Tidak ada produk!");
        } else {
            for (DataProduk product : dataProduks) {
                product.Display();
            }
        }
    }

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

    public void showBySortingNameProduct(){
        SortByName sortJudul = new SortByName();
        if (dataProduks.isEmpty()){
            System.out.println("Tidak ada data koleksi!");
        }else{
            Collections.sort(dataProduks,sortJudul);
            for (DataProduk listKoleksi : dataProduks) {
                listKoleksi.Display();
            }
        }

    }

    static class SortByName implements Comparator<DataProduk> {
        @Override
        public int compare(DataProduk produk1, DataProduk produk2) {
            return produk1.getNamaProduk().compareTo(produk2.getNamaProduk());
        }

    }
    public String getTanggal() {
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        Date date = new Date();
        return dateFormat.format(date);
    }
}
