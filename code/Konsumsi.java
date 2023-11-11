/**
 * Write a description of class Konsumsi here.
 *
 * @author Willy J.A. & Raihan F.
 * @version 5 nov 2023
 */
public class Konsumsi extends Produk {
    // instance variables - replace the example below with your own
    private String jenis;   // Jenis produk (kerupuk, soft drinks, makanan beku, dll)
    private  String tglExpired;

    /**
     * Constructor for objects of class Konsumsi
     */
    public Konsumsi(int produkId, String merk, int harga, int stokProduk, String jenis, String tglExpired) {
        // initialise instance variables
        super(produkId, merk, harga, stokProduk);
        this.jenis = jenis;
        this.tglExpired = tglExpired;
    }

    /**
     * Mengembalikan jenis dari produk konsumsi
     * @return jenis produk
     */
    public String getJenis() {
        return jenis;
    }

    /**
     * Mengembalikan tanggal produk akan expired
     * @return tanggal expired
     */
    public String getTglExpired() {
        return tglExpired;
    }

    /**
     * Mengatur kembali 
     * @param jenis
     */
    public void setJenis(String jenis) {
        this.jenis = jenis;
    }

    /**
     * mengubah tanggal produk akan expired
     * @param tglExpired
     */
    public void setTglExpired(String tglExpired) {
        this.tglExpired = tglExpired;
    }
}
