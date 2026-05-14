package TugasPekan6_2511531014;
import java.util.Scanner;
public class Musik_2511531014 {

	    Lagu_2511531014 head_1014 = null;
	    Lagu_2511531014 tail_1014 = null;

	    // tambah lagu di akhir
	    public void tambahLagu_1014(String judul_1014, String penyanyi_1014) {
	        Lagu_2511531014 laguBaru_1014 =
	                new Lagu_2511531014(judul_1014, penyanyi_1014);
	        // jika playlist kosong
	        if (head_1014 == null) {
	            head_1014 = laguBaru_1014;
	            tail_1014 = laguBaru_1014;
	        } else {
	            tail_1014.next_1014 = laguBaru_1014;
	            laguBaru_1014.prev_1014 = tail_1014;
	            tail_1014 = laguBaru_1014;
	        }
	        System.out.println("Lagu berhasil ditambahkan!");
	    }

	    // hapus lagu pertama
	    public void hapusLaguAwal_1014() {
	        if (head_1014 == null) {
	            System.out.println("Playlist kosong!");
	            return;
	        }
	        System.out.println("Lagu "
	                + head_1014.judul_1014
	                + " berhasil dihapus");
	        head_1014 = head_1014.next_1014;
	        if (head_1014 != null) {
	            head_1014.prev_1014 = null;
	        } else {
	            tail_1014 = null;
	        }
	    }

	    // tampil playlist maju
	    public void tampilMaju_1014() {
	        if (head_1014 == null) {
	            System.out.println("Playlist kosong!");
	            return;
	        }
	        Lagu_2511531014 curr_1014 = head_1014;
	        System.out.println("\n=== Playlist Maju ===");
	        while (curr_1014 != null) {
	            System.out.println(
	                    curr_1014.judul_1014
	                    + " - "
	                    + curr_1014.penyanyi_1014);
	            curr_1014 = curr_1014.next_1014;
	        }
	    }

	    // tampil playlist mundur
	    public void tampilMundur_1014() {
	        if (tail_1014 == null) {
	            System.out.println("Playlist kosong!");
	            return;
	        }
	        Lagu_2511531014 curr_1014 = tail_1014;
	        System.out.println("\n=== Playlist Mundur ===");
	        while (curr_1014 != null) {
	            System.out.println(
	                    curr_1014.judul_1014
	                    + " - "
	                    + curr_1014.penyanyi_1014);
	            curr_1014 = curr_1014.prev_1014;
	        }
	    }

	    // cari lagu
	    public void cariLagu_1014(String judulCari_1014) {
	        if (head_1014 == null) {
	            System.out.println("Playlist kosong!");
	            return;
	        }
	        Lagu_2511531014 curr_1014 = head_1014;
	        boolean ditemukan_1014 = false;
	        while (curr_1014 != null) {
	            if (curr_1014.judul_1014.equalsIgnoreCase(judulCari_1014)) {
	                System.out.println("Lagu ditemukan:");
	                System.out.println(
	                        curr_1014.judul_1014
	                        + " - "
	                        + curr_1014.penyanyi_1014);
	                ditemukan_1014 = true;
	                break;
	            }
	            curr_1014 = curr_1014.next_1014;
	        }
	        if (!ditemukan_1014) {
	            System.out.println("Lagu tidak ditemukan!");
	        }
	    }

	    // main program
	    public static void main(String[] args) {
	        Scanner input_1014 = new Scanner(System.in);
	        Musik_2511531014 playlist_1014 =
	                new Musik_2511531014();

	        int pilih_1014;
	        do {
	            System.out.println("\n=== Playlist Musik NIM: 2511531014 ===");
	            System.out.println("1. Tambah Lagu");
	            System.out.println("2. Hapus Lagu Pertama");
	            System.out.println("3. Lihat Playlist (Maju)");
	            System.out.println("4. Lihat Playlist (Mundur)");
	            System.out.println("5. Cari Lagu");
	            System.out.println("6. Keluar");
	            System.out.print("Pilihan: ");

	            pilih_1014 = input_1014.nextInt();
	            input_1014.nextLine();

	            switch (pilih_1014) {
	            
	                case 1:
	                    System.out.print("Judul Lagu: ");
	                    String judul_1014 = input_1014.nextLine();

	                    System.out.print("Penyanyi: ");
	                    String penyanyi_1014 = input_1014.nextLine();

	                    playlist_1014.tambahLagu_1014(judul_1014, penyanyi_1014);
	                    break;

	                case 2:
	                    playlist_1014.hapusLaguAwal_1014();
	                    break;

	                case 3:
	                    playlist_1014.tampilMaju_1014();
	                    break;

	                case 4:
	                    playlist_1014.tampilMundur_1014();
	                    break;

	                case 5:
	                    System.out.print("Masukkan judul lagu: ");
	                    String cari_1014 = input_1014.nextLine();
	                    playlist_1014.cariLagu_1014(cari_1014);
	                    break;

	                case 6:
	                    System.out.println("Program selesai");
	                    break;
	                default:

	                    System.out.println("Pilihan tidak valid!");
	            }

	        } while (pilih_1014 != 6);
	        input_1014.close();
	    }
	}

