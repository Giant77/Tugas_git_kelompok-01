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


    /**
     * Konstruktor untuk objek kelas Minimarket.
     * @param name Nama minimarket.
     */
    public Minimarket(String minimarketName, String name, double wallet) {
        this.minimarketName = minimarketName;
        this.pembeli = new Pembeli(name, wallet);
        this.totalRevenue = 0;
    }

    /**
     * Add an item to the database.
     * @param theItem The item to be added.
     */
    public void addItem(Produk product) {
        productBought.add(product);
    }

    /**
     * Print a list of all currently stored product Bought to the
     * text terminal.
     */
    public double list() {
        double totalHarga = 0;
        for(Produk product : productBought) {
            System.out.println(product.getMerk() + "   \t" + product.getHarga());
            System.out.println();   // empty line between product Bought

            totalHarga += product.getHarga();
        }

        System.out.println("Total harga yang harus dibayarkan: " + totalHarga);
        return totalHarga;
    }

    public void buyProduct() {
        double totalHarga;

        System.out.println("Barang-barang yang akan dibeli: ");
        totalHarga = list();
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
        list();
        System.out.println("Total pendapatan: Rp " + totalRevenue);
    }

}
