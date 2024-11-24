import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class SupermarketSystem {

    public static void main(String[] args) {
        // Menggunakan try-with-resources untuk Scanner
        try (Scanner scanner = new Scanner(System.in)) {

            // Login Section
            System.out.println("+-----------------------------------------------------+");
            System.out.println("                     Log in                           ");
            System.out.println("+-----------------------------------------------------+");
            
            System.out.print("Username: ");
            String username = scanner.nextLine();

            System.out.print("Password: ");
            String password = scanner.nextLine();

            System.out.print("Captcha (ketik '12345'): ");
            String captcha = scanner.nextLine();

            // Checking login credentials
            if (!"admin".equals(username) || !"password".equals(password) || !"12345".equals(captcha)) {
                System.out.println("Login gagal. Silakan ulangi.");
                return; // Mengakhiri program jika login gagal
            }

            System.out.println("Login berhasil!");
            System.out.println("+-----------------------------------------------------+");

            // Selamat Datang Section
            System.out.println("Selamat Datang di Supermarket Mega Store!");
            
            // Get current date and time
            Date now = new Date();
            SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
            System.out.println("Tanggal dan Waktu: " + sdf.format(now));
            System.out.println("+-----------------------------------------------------+");

            // Input Data Barang
            System.out.print("No. Faktur: ");
            String noFaktur = scanner.nextLine();

            System.out.print("Kode Barang: ");
            String kodeBarang = scanner.nextLine();

            System.out.print("Nama Barang: ");
            String namaBarang = scanner.nextLine();

            System.out.print("Harga Barang: ");
            double hargaBarang;
            try {
                hargaBarang = Double.parseDouble(scanner.nextLine()); // Mengonversi input String ke Double
            } catch (NumberFormatException e) {
                System.out.println("Error: Harga harus berupa angka.");
                return;
            }

            System.out.print("Jumlah Beli: ");
            int jumlahBeli;
            try {
                jumlahBeli = Integer.parseInt(scanner.nextLine()); // Mengonversi input String ke Integer
            } catch (NumberFormatException e) {
                System.out.println("Error: Jumlah beli harus berupa angka.");
                return;
            }

            double total = hargaBarang * jumlahBeli;

            // Menampilkan data transaksi
            System.out.println("+-----------------------------------------------------+");
            System.out.println("No. Faktur      : " + noFaktur);
            System.out.println("Kode Barang     : " + kodeBarang.toUpperCase()); // Contoh penggunaan String method
            System.out.println("Nama Barang     : " + namaBarang.trim()); // Menghapus spasi tidak perlu
            System.out.printf("Harga Barang    : Rp %.2f%n", hargaBarang);
            System.out.println("Jumlah Beli     : " + jumlahBeli);
            System.out.printf("TOTAL           : Rp %.2f%n", total);
            System.out.println("+-----------------------------------------------------+");

            // Input nama kasir
            System.out.print("Kasir: ");
            String namaKasir = scanner.nextLine();
            System.out.println("Kasir           : " + namaKasir.toUpperCase()); // Mengubah nama kasir menjadi huruf besar
            System.out.println("+-----------------------------------------------------+");

        } catch (Exception e) {
            System.out.println("Terjadi kesalahan: " + e.getMessage());
        }
    }
}
