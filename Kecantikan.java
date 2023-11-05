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
    public Kecantikan(String merk, int harga, boolean isOrganic) {
        // initialise instance variables
        super(merk, harga);
        this.isOrganic = isOrganic;
    }

    public boolean getIsOrganic() {
        return isOrganic;
    }

    public void setIsOrganic(boolean isOrganic) {
        this.isOrganic = isOrganic;
    }
}
