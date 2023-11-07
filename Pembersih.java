/**
 * Write a description of class Pembersih here.
 *
 * @author Willy J.A. & Raihan F.
 * @version 5 nov 2023
 */
public class Pembersih extends Produk{
    // instance variables - replace the example below with your own
    private boolean isEcoFriendly;
    private String aroma;

    /**
     * Constructor for objects of class Pembersih
     */
    public Pembersih(String merk, int harga, int stokProduk, boolean isEcoFriendly, String aroma){
        // initialise instance variables
        super(merk, harga, stokProduk);
        this.isEcoFriendly = isEcoFriendly;
        this.aroma = aroma;
    }

    /**
     * Mengembalikan apakah produk ramah lingkungan
     * @return 
     */
    public boolean getIsEcoFriendly() {
        return isEcoFriendly;
    }

    /**
     * Mengembalikan aroma dari produk
     * @return
     */
    public String getAroma() {
        return aroma;
    }

    /**
     * Mengupdate apakah produk ramah lingkungan
     * @param isEcoFriendly
     */
    public void setIsEcoFriendly(boolean isEcoFriendly) {
        this.isEcoFriendly = isEcoFriendly;
    }

    /**
     * Mengupdate aroma dari produk
     * @param aroma
     */
    public void setAroma(String aroma) {
        this.aroma = aroma;
    }
}
