/**
 * Write a description of class Pembeli here.
 *
 * @author Willy J.A. & Raihan F.
 * @version 5 nov 2023
 */
public class Pembeli extends Person {
    private double balance;

    /**
     * Konstruktor untuk objek kelas Pembeli.
     * @param name Nama pembeli.
     * @param balance Saldo pembeli.
     */
    public Pembeli(String name, double balance) {
        super(name);
        this.balance = balance;
    }

    /**
     * Metode untuk mengambil saldo pembeli.
     * @return Saldo pembeli.
     */
    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
    /**
     * Metode untuk menampilkan informasi pembeli.
     */
    @Override
    public void displayInfo() {
        System.out.println("Pembeli: " + getName());
        System.out.println("Saldo: Rp " + getBalance());
    }
}
