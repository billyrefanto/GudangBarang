package GudangBarang;

public abstract class DataProduk {
    protected int idProduk,stock,barcode;
    protected String namaDistributor, namaProduk,status,berat,kategoriProduk,tanggalDiterima;
    protected Double harga;

    public DataProduk(int idProduk, int stock, int barcode, String namaDistributor, String namaProduk, String status, String berat, String kategoriProduk, String tanggalDiterima, Double harga) {
        this.idProduk = idProduk;
        this.stock = stock;
        this.barcode = barcode;
        this.namaDistributor = namaDistributor;
        this.namaProduk = namaProduk;
        this.status = status;
        this.berat = berat;
        this.kategoriProduk = kategoriProduk;
        this.tanggalDiterima = tanggalDiterima;
        this.harga = harga;
    }

    public String getNamaProduk() {
        return namaProduk;
    }

    protected abstract void Display();
}
