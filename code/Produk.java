/**
 * Write a description of class Produk here.
 *
 * @author Willy J.A. & Raihan F.
 * @version 5 nov 2023
 */
public class Produk
{
    // instance variables - replace the example below with your own
    private int produkId; // to-do implements array list or hash map
    private String merk;
    private int harga;
    private int stokProduk;

    /**
     * Constructor for objects of class Produk
     */
   public Produk(int produkId, String merk, int harga, int stokProduk) {
      this.produkId = produkId;
      this.merk = merk;
      this.harga = harga;
      this.stokProduk = stokProduk;
   }

   /**
    * Mengembalikan merek dari produk yang dijual
    * @return nama merek
    */
   public String getMerk() {
      return merk;
   }

   /**
    * Mengembalikan harga jual per pc dari produk
    * @return harga jual
    */
   public int getHarga() {
      return harga;
   }

   /**
    * Mengembalikan id dari produk
    * @return
    */
   public int 
   getId() {
      return produkId;
   }

   /**
    * Mengembalikan stok produk yang tersedia
    * @return stok tersedia
    */
   public int getStokProduk() {
      return stokProduk;
   }

   /**
    * Mengubah merek dari produk yang dijual 
    * @param merk
    */
   public void setMerk(String merk) {
      this.merk = merk;
   }

   /**
    * Mengupdate harga produk yang dijual
    * @param harga
    */
   public void updateHarga(int harga) {
      this.harga = harga;
   }

   /**
    * Mengupdate stok produk yang tersedia
    * @param stokProduk
    */
   public void setStok(int produkId, int stokProduk) {
      this.stokProduk = stokProduk;    // to-do only set on certain id
   }

   // to-do update produk hanya pada id tertentu
   public void updateStok(int produkId, int jumlahProdukDibeli) {
      this.stokProduk -= 3;
   }
}
