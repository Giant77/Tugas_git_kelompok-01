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
    public Pembersih(String merk, int harga, boolean isEcoFriendly, String aroma){
        // initialise instance variables
        super(merk, harga);
        this.isEcoFriendly = isEcoFriendly;
        this.aroma = aroma;
    }

    public boolean getIsEcoFriendly() {
        return isEcoFriendly;
    }

    public String getAroma() {
        return aroma;
    }

    public void setIsEcoFriendly(boolean isEcoFriendly) {
        this.isEcoFriendly = isEcoFriendly;
    }

    public void setAroma(String aroma) {
        this.aroma = aroma;
    }
}
