import java.util.ArrayList;

/**
 * Write a description of class Minimarket here.
 *
 * @author Willy J.A. & Raihan F.
 * @version 5 nov 2023
 */
public class Minimarket {
    private String minimarketName;
    private ArrayList<Produk> productBought;
    private Pembeli pembeli;
    private double totalRevenue;
    private ArrayList<Pegawai> listPegawai;

    /**
     * Konstruktor untuk objek kelas Minimarket.
     * @param name Nama minimarket.
     */
    public Minimarket(String minimarketName, String namaPembeli, double wallet, String namaPegawai, double sallary) {
        this.minimarketName = minimarketName;
        this.pembeli = new Pembeli(namaPembeli, wallet);
        this.totalRevenue = 0;
    }

    public void addPegawai(Pegawai pegawai) {
        listPegawai.add(pegawai);
    }

    public void listPegawai() {
       System.out.println("List pegawai yang bekerja pada minimarket: "); 
       for (int i = 0; i < listPegawai.size(); i++) {
           listPegawai.get(i).displayInfo();
       }
    }
    
    /**
     * Add an item to the product list.
     * @param theItem The item to be added.
     */
    public void addItem(Produk product) {
        productBought.add(product);
    }

    /**
     * Print a list of all currently stored product bought
     */
    public void listProduct() {
        for(Produk product : productBought) {
            System.out.println(product.getMerk() + "   \t" + product.getHarga());
            System.out.println();   // empty line between product Bought
        }
    }
    
    public double totalPrices() {
        double totalHarga = 0;
        for(Produk product : productBought) {
            totalHarga += product.getHarga();
        }
        
        System.out.println("Total harga yang harus dibayarkan: " + totalHarga);
        return totalHarga;
    }

    public void buyProduct() {
        double totalHarga;

        System.out.println("Barang-barang yang akan dibeli: ");
        listProduct();
        totalHarga = totalPrices();
        System.out.println();

        if (pembeli.getBalance() < totalHarga) {
            System.out.println("Saldo anda kurang!\nTransaksi gagal");
        } else {
            System.out.println("Transaksi berhasil");
            
            pembeli.setBalance(pembeli.getBalance() - totalHarga);
            totalRevenue += totalHarga;
        }
        

    }


    /**
     * Metode untuk menampilkan informasi tentang minimarket, termasuk jumlah produk
     * dan total pendapatan.
     */
    public void showInfo() {
        System.out.println("Selamat datang di " + minimarketName);
        System.out.println("Produk yang tersedia: ");
        listProduct();
        System.out.println("Total pendapatan: Rp " + totalRevenue);
    }

}
