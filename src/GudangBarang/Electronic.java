package GudangBarang;

public class Electronic extends DataProduk{ // menambahkan extends DataProduk pada class FrozenFood
    //Deklarasi variabel
    private final int serialNumber;
    private final String garansi;

    //Constructor Electronic
    public Electronic(int idProduk, int stock, int barcode, String namaDistributor, String namaProduk, String status, String berat, String kategoriProduk, String tanggalDiterima, int harga, int serialNumber, String garansi) {
        super(idProduk, stock, barcode, namaDistributor, namaProduk, status, berat, kategoriProduk, tanggalDiterima, harga); //pewarisan dari class DataProduk
        this.serialNumber = serialNumber;
        this.garansi = garansi;
    }

    //Method display data
    @Override
    public void Display(){
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
                        "\nSerial Number      :" + this.serialNumber +
                        "\nGaransi            :" + this.garansi
        );
    }
}
