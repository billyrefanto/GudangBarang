package GudangBarang;

public class Electronic extends DataProduk{
    private final int serialNumber;
    private final String garansi;

    public Electronic(int idProduk, int stock, int barcode, String namaDistributor, String namaProduk, String status, String berat, String kategoriProduk, String tanggalDiterima, Double harga, int serialNumber, String garansi) {
        super(idProduk, stock, barcode, namaDistributor, namaProduk, status, berat, kategoriProduk, tanggalDiterima, harga);
        this.serialNumber = serialNumber;
        this.garansi = garansi;
    }

    @Override
    public void Display(){
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
                        "\nSerial Number      :" + this.serialNumber +
                        "\nGaransi            :" + this.garansi
        );
    }
}
