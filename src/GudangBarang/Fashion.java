package GudangBarang;

public class Fashion extends DataProduk {
    private final String jenisFashion,ukuran,bahan,warna,model;

    public Fashion(int idProduk, int stock, int barcode, String namaDistributor, String namaProduk, String status, String berat, String kategoriProduk, String tanggalDiterima, int harga, String jenisFashion, String ukuran, String bahan, String warna, String model) {
        super(idProduk, stock, barcode, namaDistributor, namaProduk, status, berat, kategoriProduk, tanggalDiterima, harga);
        this.jenisFashion = jenisFashion;
        this.ukuran = ukuran;
        this.bahan = bahan;
        this.warna = warna;
        this.model = model;
    }

    @Override
    protected void Display() {
        System.out.println(
                "\n[Data Produk Fashion]" +
                        "\nId Produk          :" + this.idProduk +
                        "\nNama Distributor   :" + this.namaDistributor +
                        "\nNama Produk        :" + this.namaProduk +
                        "\nStock              :" + this.stock +
                        "\nStatus             :" + this.status +
                        "\nHarga              :" + "Rp." +this.harga + ",-"+
                        "\nBarcode            :" + this.barcode +
                        "\nBerat              :" + this.berat +
                        "\nTanggal Diterima   :" + this.tanggalDiterima +
                        "\nJenis Fashion      :" + this.jenisFashion +
                        "\nUkuran             :" + this.ukuran +
                        "\nBahan              :" + this.bahan +
                        "\nWarna              :" + this.warna +
                        "\nModel              :" + this.model
        );
    }
}
