/**
 * Write a description of class Produk here.
 *
 * @author Willy J.A. & Raihan F.
 * @version 5 nov 2023
 */
public class Produk
{
    // instance variables - replace the example below with your own
    private String merk;
    private int harga;

    /**
     * Constructor for objects of class Produk
     */
    public Produk(String merk, int harga)
    {
        this.merk = merk;
        this.harga = harga;
    }

     public String getMerk() {
        return merk;
     }

     public int getHarga() {
        return harga;
     }

     public void setMerk(String merk) {
        this.merk = merk;
     }

     public void setHarga(int harga) {
        this.harga = harga;
     }
}
