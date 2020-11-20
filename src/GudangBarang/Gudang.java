package GudangBarang;

import java.util.ArrayList;
import java.util.Comparator;

public class Gudang {
    ArrayList<DataProduk> dataProduks = new ArrayList<>();
    public void addKoleksi(DataProduk product){
        dataProduks.add(product);
    }
    public void removeAllProduct(){
        if (dataProduks.isEmpty()){
            System.out.println("Tidak ada produk!");
        }else{
            dataProduks.clear();
        }
    }

    public void showAllDataKoleksi(){
        if (dataProduks.isEmpty()) {
            System.out.println("Tidak ada produk!");
        } else {
            for (DataProduk product : dataProduks) {
                product.Display();
            }
        }
    }


    static class SortByName implements Comparator<DataProduk> {
        @Override
        public int compare(DataProduk produk1, DataProduk produk2) {
            return produk1.getNamaProduk().compareTo(produk2.getNamaProduk());
        }

    }
}
