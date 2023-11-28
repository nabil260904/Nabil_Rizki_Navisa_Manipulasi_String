import java.util.Scanner;
import java.util.Date;
import java.text.SimpleDateFormat;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String nama = new String("citra mart");
        Date date = new Date();
        SimpleDateFormat dayFormat = new SimpleDateFormat("EEEE, dd/MM/yyyy");
        SimpleDateFormat timeFormat = new SimpleDateFormat("hh:mm:ss z");

        try {
            // Input data dari user
            System.out.println(nama.toUpperCase());
            System.out.println("Tanggal\t: " + dayFormat.format(date));
            System.out.println("Waktu\t: " + timeFormat.format(date));
            System.out.println("========================");

            // DATA PELANGGAN
            System.out.println("DATA PELANGGAN");
            System.out.println("---------------------");
            System.out.print("Nama Pelanggan : ");
            String namaPelanggan = scanner.nextLine();
            System.out.print("No. HP         : ");
            String noHP = scanner.nextLine();
            System.out.print("Alamat         : ");
            String alamat = scanner.nextLine();
            System.out.println("++++++++++++++++++++++++");

            // DATA PEMBELIAN BARANG
            System.out.println("DATA PEMBELIAN BARANG");
            System.out.println("----------------------------");
            System.out.print("Kode Barang    : ");
            int kodeBarang = scanner.nextInt();
            scanner.nextLine(); 
            System.out.print("Nama Barang    : ");
            String namaBarang = scanner.nextLine();
            System.out.print("Harga Barang   : ");
            double hargaBarang = scanner.nextDouble();
            System.out.print("Jumlah Beli    : ");
            int jumlahBeli = scanner.nextInt();
            double totalBayar = hargaBarang * jumlahBeli;
            System.out.println("TOTAL BAYAR    : " + totalBayar);
            System.out.println("++++++++++++++++++++++++");

            // Kasir
            System.out.print("Kasir          : ");
            String kasir = scanner.next();

            // menampilkan output struk output
            System.out.println("\n========================");
            System.out.println(nama.toUpperCase());
            System.out.println("Tanggal\t: " + dayFormat.format(date));
            System.out.println("Waktu\t: " + timeFormat.format(date));
            System.out.println("========================");
            System.out.println("DATA PELANGGAN");
            System.out.println("---------------------");
            System.out.println("Nama Pelanggan : " + namaPelanggan);
            System.out.println("No. HP         : " + noHP);
            System.out.println("Alamat         : " + alamat);
            System.out.println("++++++++++++++++++++++++");
            System.out.println("DATA PEMBELIAN BARANG");
            System.out.println("----------------------------");
            System.out.println("Kode Barang    : " + kodeBarang);
            System.out.println("Nama Barang    : " + namaBarang);
            System.out.println("Harga Barang   : " + hargaBarang);
            System.out.println("Jumlah Beli    : " + jumlahBeli);
            System.out.println("TOTAL BAYAR    : " + totalBayar);
            System.out.println("++++++++++++++++++++++++");
            System.out.println("Kasir          : " + kasir);

        } catch (Exception e) {
            System.out.println("Terjadi kesalahan: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
