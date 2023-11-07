/**
 * Write a description of class Kecantikan here.
 *
 * @author Willy J.A. & Raihan F.
 * @version 5 nov 2023
 */
public class Kecantikan extends Produk {
    // instance variables - replace the example below with your own
    private boolean isOrganic;

    /**
     * Constructor for objects of class Kecantikan
     */
    public Kecantikan(String merk, int harga, int stokProduk, boolean isOrganic) {
        // initialise instance variables
        super(merk, harga, stokProduk);
        this.isOrganic = isOrganic;
    }

    /**
     * Mengembalikan apakah produk terbuat dari bahan alami
     * @return
     */
    public boolean getIsOrganic() {
        return isOrganic;
    }

    /**
     * Mengupdate apakah produk telah menggunakan bahan alami
     * @param isOrganic
     */
    public void setIsOrganic(boolean isOrganic) {
        this.isOrganic = isOrganic;
    }
}
