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
    public Konsumsi(String merk, int harga, int stokProduk, String jenis, String tglExpired) {
        // initialise instance variables
        super(merk, harga, stokProduk);
        this.jenis = jenis;
        this.tglExpired = tglExpired;
    }

    public String getJenis() {
        return jenis;
    }

    public String getTglExpired() {
        return tglExpired;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }

    public void setTglExpired(String tglExpired) {
        this.tglExpired = tglExpired;
    }
}
