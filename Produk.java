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
    private int stokProduk;

    /**
     * Constructor for objects of class Produk
     */
   public Produk(String merk, int harga, int stokProduk) {
      this.merk = merk;
      this.harga = harga;
      this.stokProduk = stokProduk;
   }

   public String getMerk() {
      return merk;
   }

   public int getHarga() {
      return harga;
   }

   public int getStokProduk() {
      return stokProduk;
   }

   public void setMerk(String merk) {
      this.merk = merk;
   }

   public void setHarga(int harga) {
      this.harga = harga;
   }

   public void updateStok(int stokProduk) {
      this.stokProduk = stokProduk;
   }
}
