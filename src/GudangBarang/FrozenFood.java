package GudangBarang;

public class FrozenFood extends DataProduk {
    private final String tanggalKadaluarsa,penyimpananKhusus,noReg;

    public FrozenFood(int idProduk, int stock, int barcode, String namaDistributor, String namaProduk, String status, String berat, String kategoriProduk, String tanggalDiterima, Double harga, String tanggalKadaluarsa, String penyimpananKhusus, String noReg) {
        super(idProduk, stock, barcode, namaDistributor, namaProduk, status, berat, kategoriProduk, tanggalDiterima, harga);
        this.tanggalKadaluarsa = tanggalKadaluarsa;
        this.penyimpananKhusus = penyimpananKhusus;
        this.noReg = noReg;
    }

    @Override
    protected void Display() {
        System.out.println(
                "\n[Data Produk Frozen Food]" +
                        "\nId Produk          :" + this.idProduk +
                        "\nNama Distributor   :" + this.namaDistributor +
                        "\nNama Produk        :" + this.namaProduk +
                        "\nNama Stock         :" + this.stock +
                        "\nStatus             :" + this.status +
                        "\nHarga              :" + this.harga +
                        "\nBarcode            :" + this.barcode +
                        "\nBerat              :" + this.berat +
                        "\nTanggal Diterima   :" + this.tanggalDiterima +
                        "\nTanggal Kadaluarsa :" + this.tanggalKadaluarsa +
                        "\nPenyimpanan Khusus :" + this.penyimpananKhusus +
                        "\nNomer Registrasi   :" + this.noReg

        );
    }
}
