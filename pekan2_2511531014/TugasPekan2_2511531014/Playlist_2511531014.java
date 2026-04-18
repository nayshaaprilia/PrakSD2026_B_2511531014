package TugasPekan2_2511531014;
import java.util.*;

public class Playlist_2511531014 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in); // Untuk input user
        ArrayList<Musik_2511531014> playlist = new ArrayList<>(); 
        // ArrayList yang digunakan untuk menyimpan data dr class Musik_2511531014

        int pilihan; // Variabel menu pilihan

        do {
            // Tampilan menu
            System.out.println("\n=== Playlist Musik NIM 2511531014 ===");
            System.out.println("1. Tambah Lagu");
            System.out.println("2. Lihat Playlist");
            System.out.println("3. Hapus Lagu");
            System.out.println("4. Keluar");
            System.out.print("Pilihan: ");
            pilihan = input.nextInt();
            input.nextLine();

            switch (pilihan) {

                case 1:
                    // Input data lagu
                    System.out.print("Masukkan Judul: ");
                    String judul = input.nextLine();

                    System.out.print("Masukkan Penyanyi: ");
                    String penyanyi = input.nextLine();

                    System.out.print("Masukkan Durasi (detik): ");
                    int durasi = input.nextInt();

                    // Menambahkan data ke ArrayList
                    playlist.add(new Musik_2511531014(judul, penyanyi, durasi));

                    System.out.println("Data berhasil ditambahkan!");
                    break;

                case 2:
                    // Menampilkan isi playlist
                    if (playlist.isEmpty()) {
                        System.out.println("Playlist kosong!");
                    } else {
                        for (int i = 0; i < playlist.size(); i++) {
                            Musik_2511531014 m = playlist.get(i);

                            System.out.println(i + ". " 
                                + m.getJudul() + " - " 
                                + m.getPenyanyi() + " (" 
                                + m.getDurasi() + " detik)");
                        }
                    }
                    break;

                case 3:
                    // Menghapus lagu berdasarkan index
                    System.out.print("Masukkan index lagu: ");
                    int index = input.nextInt();

                    if (index >= 0 && index < playlist.size()) {
                        playlist.remove(index);
                        System.out.println("Lagu berhasil dihapus!");
                    } else {
                        System.out.println("Index tidak valid!");
                    }
                    break;

                case 4:
                    // Keluar program
                    System.out.println("Keluar dari Playlist");
                    break;

                default:
                    System.out.println("Pilihan musik tidak ada!");
            }

        } while (pilihan != 4); // Loop sampai pilih keluar
    }
}