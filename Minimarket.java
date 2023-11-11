
/**
 * Ini adalah kelas yang merepresentasikan sebuah minimarket.
 *
 * @author (Willy J.A & Raihan F)
 * @version (11 november 2023)
 */
public class Minimarket {
    private String name;
    private int totalProducts;
    private double totalRevenue;

    /**
     * Konstruktor untuk objek kelas Minimarket.
     * @param name Nama minimarket.
     */
    public Minimarket(String name) {
        this.name = name;
        this.totalProducts = 0;
        this.totalRevenue = 0.0;
    }

    /**
     * Metode untuk menambahkan produk ke minimarket dan menghitung pendapatan.
     * @param productName Nama produk yang ditambahkan.
     */
    public void addProduct(String productName) {
        double price = 0;

        // Tentukan harga berdasarkan jenis produk
        if (productName.equals("Kecantikan")) {
            price = 500000;
        } else if (productName.equals("Pembersih")) {
            price = 200000;
        } else if (productName.equals("Konsumsi")) {
            price = 700000;
        } else {
            System.out.println("Produk tidak dikenali: " + productName);
            return; // Keluar dari metode jika produk tidak dikenali
        }

        System.out.println("Menambahkan " + productName + " dengan harga " + price);
        totalProducts++;
        totalRevenue += price;
    }

    /**
     * Metode untuk menampilkan informasi tentang minimarket, termasuk jumlah produk
     * dan total pendapatan.
     */
    public void showInfo() {
        System.out.println("Selamat datang di " + name);
        System.out.println("Total produk yang tersedia: " + totalProducts);
        System.out.println("Total pendapatan: Rp " + totalRevenue);
    }

    public static void main(String[] args) {
        Minimarket minimarket = new Minimarket("Minimarket ABC");

        minimarket.addProduct("Kecantikan");
        minimarket.addProduct("Pembersih");
        minimarket.addProduct("Konsumsi");
        minimarket.addProduct("Barang Tidak Dikenali");

        minimarket.showInfo();

        Pegawai pegawai = new Pegawai("Raihan", 2000000);
        Pembeli pembeli = new Pembeli("Willy", 100000);

        pegawai.displayInfo();
        pembeli.displayInfo();
    }
}
