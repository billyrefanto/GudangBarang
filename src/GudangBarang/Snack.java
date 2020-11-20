package GudangBarang;

public class Snack extends DataProduk {
    private final String varian,tanggalKadaluarsa;

    public Snack(int idProduk, int stock, int barcode, String namaDistributor, String namaProduk, String status, String berat, String kategoriProduk, String tanggalDiterima, Double harga, String varian, String tanggalKadaluarsa) {
        super(idProduk, stock, barcode, namaDistributor, namaProduk, status, berat, kategoriProduk, tanggalDiterima, harga);
        this.varian = varian;
        this.tanggalKadaluarsa = tanggalKadaluarsa;
    }

    @Override
    protected void Display() {
        System.out.println(
                "\n[Data Produk Electronic]" +
                        "\nId Produk          :" + this.idProduk +
                        "\nNama Distributor   :" + this.namaDistributor +
                        "\nNama Produk        :" + this.namaProduk +
                        "\nNama Stock         :" + this.stock +
                        "\nStatus             :" + this.status +
                        "\nHarga              :" + this.harga +
                        "\nBarcode            :" + this.barcode +
                        "\nBerat              :" + this.berat +
                        "\nTanggal Diterima   :" + this.tanggalDiterima +
                        "\nVarian             :" + this.varian +
                        "\nTanggal Kadaluarsa :" + this.tanggalKadaluarsa

        );
    }
}
