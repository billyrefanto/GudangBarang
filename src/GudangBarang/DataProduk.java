package GudangBarang;

public abstract class DataProduk {
    protected int idProduk,stock,barcode,harga;
    protected String namaDistributor, namaProduk,status,berat,kategoriProduk,tanggalDiterima;

    public DataProduk(int idProduk, int stock, int barcode, String namaDistributor, String namaProduk, String status, String berat, String kategoriProduk, String tanggalDiterima, int harga) {
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

    public int getIdProduk() {
        return idProduk;
    }

    public String getNamaProduk() {
        return namaProduk;
    }

    protected abstract void Display();
}
