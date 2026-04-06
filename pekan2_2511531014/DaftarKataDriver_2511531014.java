package pekan2_2511531014;

public class DaftarKataDriver_2511531014 {
	  public static void main(String[] args) {
	        DaftarKata_2511531014 al = new DaftarKata_2511531014();

	        // Menambah elemen (akhir)
	        al.tambah_2511531014("Kami");
	        al.tambah_2511531014("Informatika");

	        // Menyisipkan elemen pada indeks 1
	        al.tambahPada_2511531014(1, "Mahasiswa");

	        // Cetak isi awal
	        System.out.println("Awal : " + al);

	        // Mengubah elemen (index 1)
	        al.ubahElemen_2511531014(1, "Departemen");
	        System.out.println("Setelah ubah: " + al);

	        // Menghapus elemen (hapus index 0)
	        String terhapus_2511531014 = al.hapusElemen_2511531014(0);
	        System.out.println("Terhapus : " + terhapus_2511531014);
	        System.out.println("Setelah hapus: " + al);

	        // Iterasi pada ArrayList (cetak setiap elemen)
	        System.out.print("Iterasi: ");
	        al.iterasiCetak_2511531014();
	        System.out.println();
	    }
	}


