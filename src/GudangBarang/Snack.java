package GudangBarang;

public class Snack extends DataProduk { // menambahkan extends DataProduk pada class FrozenFood
    private final String varian,tanggalKadaluarsa; //deklarasi variabel

    //Constructor Snack
    public Snack(int idProduk, int stock, int barcode, String namaDistributor, String namaProduk, String status, String berat, String kategoriProduk, String tanggalDiterima, int harga, String varian, String tanggalKadaluarsa) {
        super(idProduk, stock, barcode, namaDistributor, namaProduk, status, berat, kategoriProduk, tanggalDiterima, harga); //pewarisan dari class DataProduk
        this.varian = varian;
        this.tanggalKadaluarsa = tanggalKadaluarsa;
    }

    //Method display data
    @Override
    protected void Display() {
        System.out.println(
                "\n[Data Produk Electronic]" +
                        "\nId Produk          :" + this.idProduk +
                        "\nNama Distributor   :" + this.namaDistributor +
                        "\nNama Produk        :" + this.namaProduk +
                        "\nStock              :" + this.stock +
                        "\nStatus             :" + this.status +
                        "\nHarga              :" + "Rp." +this.harga + ",-"+
                        "\nBarcode            :" + this.barcode +
                        "\nBerat              :" + this.berat +
                        "\nTanggal Diterima   :" + this.tanggalDiterima +
                        "\nVarian             :" + this.varian +
                        "\nTanggal Kadaluarsa :" + this.tanggalKadaluarsa

        );
    }
}
