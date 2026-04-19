package TugasPekan3_2511531014;
import java.util.Scanner;
import java.util.Stack;

public class Browser_2511531014 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Stack<Website_2511531014> history = new Stack<>();
        int pilihan;
        do {
            // Menu pilihan program browser
            System.out.println("\n=== BROWSER HISTORY 2511531014 ===");
            System.out.println("1. Kunjungi Website (Push)");
            System.out.println("2. Tombol Back (Pop)");
            System.out.println("3. Lihat Halaman Aktif (Peek)");
            System.out.println("4. Keluar");
            System.out.print("Pilihan: ");
            pilihan = input.nextInt();
            input.nextLine();

            switch (pilihan) {
                case 1:
                    // Push → menambahkan website ke tumpukan atau stack
                    System.out.print("Masukkan Judul Website: ");
                    String judul = input.nextLine();

                    System.out.print("Masukkan URL: ");
                    String url = input.nextLine();

                    history.push(new Website_2511531014(judul, url));

                    System.out.println("Berhasil mengunjungi website!");
                    break;
                case 2:
                    // Pop → menghapus data terakhir dikunjungi
                    if (!history.isEmpty()) {
                        Website_2511531014 w = history.pop();
                        System.out.println("Kembali dari: " + w.getJudul());
                    } else {
                        System.out.println("History kosong!");
                    }
                    break;
                case 3:
                    // Peek → melihat data paling atas atau yang sedang di kunjungi tanpa menghapus
                    if (!history.isEmpty()) {
                        Website_2511531014 w = history.peek();
                        System.out.println("Halaman aktif:");
                        System.out.println(w.getJudul() + " - " + w.getUrl());
                    } else {
                        System.out.println("Tidak ada halaman!");
                    }
                    break;
                case 4:
                    System.out.println("Keluar Halaman.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
            }
        } while (pilihan != 4);
    }
}