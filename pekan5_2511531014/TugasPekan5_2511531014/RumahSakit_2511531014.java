package TugasPekan5_2511531014;
import java.util.Scanner;
public class RumahSakit_2511531014 {
	    Pasien_2511531014 head_1014;
	    int counter_1014 = 1;

	    // Insert (Tambah pasien)
	    public void insert_1014(String nama, String keluhan) {
	        Pasien_2511531014 baru = new Pasien_2511531014(nama, keluhan, counter_1014++);

	        if (head_1014 == null) {
	            head_1014 = baru;
	        } else {
	            Pasien_2511531014 temp = head_1014;
	            while (temp.next_1014 != null) {
	                temp = temp.next_1014;
	            }
	            temp.next_1014 = baru;
	        }

	        System.out.println("Pasien berhasil didaftarkan! Nomor Antrian: " + baru.nomorAntrian_1014);
	    }

	    // Delete Head (Panggil pasien)
	    public void deleteHead_1014() {
	        if (head_1014 == null) {
	            System.out.println("Antrian kosong!");
	        } else {
	            System.out.println("Memanggil pasien: " + head_1014.namaPasien_1014);
	            head_1014 = head_1014.next_1014;
	        }
	    }

	    // Display (Tampilkan Antrian)
	    public void display_1014() {
	        if (head_1014 == null) {
	            System.out.println("Antrian kosong!");
	            return;
	        }

	        Pasien_2511531014 temp = head_1014;
	        while (temp != null) {
	            System.out.println("No: " + temp.nomorAntrian_1014 +
	                               " | Nama: " + temp.namaPasien_1014 +
	                               " | Keluhan: " + temp.keluhan_1014);
	            temp = temp.next_1014;
	        }
	    }

	    // Search (Cari Pasien)
	    public void search_1014(String nama) {
	        Pasien_2511531014 temp = head_1014;
	        while (temp != null) {
	            if (temp.namaPasien_1014.equalsIgnoreCase(nama)) {
	                System.out.println("Pasien ditemukan!");
	                System.out.println("No: " + temp.nomorAntrian_1014 +
	                                   " | Keluhan: " + temp.keluhan_1014);
	                return;
	            }
	            temp = temp.next_1014;
	        }
	        System.out.println("Pasien tidak ditemukan!");
	    }

	    // Status antrian
	    public void status_1014() {
	        if (head_1014 == null) {
	            System.out.println("Antrian kosong!");
	        } else {
	            int jumlah = 0;
	            Pasien_2511531014 temp = head_1014;
	            while (temp != null) {
	                jumlah++;
	                temp = temp.next_1014;
	            }
	            System.out.println("Jumlah pasien: " + jumlah);
	            System.out.println("Pasien terdepan: " + head_1014.namaPasien_1014);
	        }
	    }

	    
	    //Kelas Main
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        RumahSakit_2511531014 rs = new RumahSakit_2511531014();

        int pilihan;

        do {
            System.out.println("\n=== ANTRIAN RUMAH SAKIT ===");
            System.out.println("1. Daftarkan Pasien");
            System.out.println("2. Panggil Pasien");
            System.out.println("3. Tampilkan Antrian");
            System.out.println("4. Cari Pasien");
            System.out.println("5. Status Antrian");
            System.out.println("6. Keluar");
            System.out.print("Pilihan: ");
            pilihan = input.nextInt();
            input.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.print("Nama: ");
                    String nama = input.nextLine();
                    System.out.print("Keluhan: ");
                    String keluhan = input.nextLine();
                    rs.insert_1014(nama, keluhan);
                    break;

                case 2:
                    rs.deleteHead_1014();
                    break;

                case 3:
                    rs.display_1014();
                    break;

                case 4:
                    System.out.print("Cari nama: ");
                    String cari = input.nextLine();
                    rs.search_1014(cari);
                    break;

                case 5:
                    rs.status_1014();
                    break;

                case 6:
                    System.out.println("Keluar...");
                    break;

                default:
                    System.out.println("Pilihan tidak valid!");
            }
        } while (pilihan != 6);
    }
}
