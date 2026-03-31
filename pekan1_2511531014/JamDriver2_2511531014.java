package pekan1_2511531014;

	import java.util.Scanner;

	public class JamDriver2_2511531014 {
	    public static void main(String[] args) {
	        Scanner input = new Scanner(System.in);

	        System.out.println("\n=== Program Driver Objek Jam ===");

	        // 1. Input Jam Pertama
	        System.out.println("\n--- Input jam_2511531014 1 ---");
	        jam_2511531014 j1 = buatjam_2511531014DariInput(input);

	        // 2. Input Jam Kedua
	        System.out.println("\n--- Input jam_2511531014 2 ---");
	        jam_2511531014 j2 = buatjam_2511531014DariInput(input);

	        // 3. Menampilkan Data
	        System.out.println("\n--- Hasil Operasi ---");
	        System.out.println(" jam_2511531014 1 (String)       : " + j1.toString());
	        System.out.println(" jam_2511531014 2 (String)       : " + j2.toString());
	        System.out.println(" jam_2511531014 1 dalam detik    : " + j1.toSecond());
	        System.out.println(" jam_2511531014 2 dalam detik    : " + j2.toSecond());
	        
	        //4. O[erasi relasional (perbandingan)
	        int perbandingan = j1.compareTo (j2);
	        if (perbandingan > 0) {
	        	System.out.println("Status    : jam_2511531014 1 lebih lambat (setelah) jam_2511531014 2");
	        } else if (perbandingan < 0) {
	        	System.out.println("Status    : jam_2511531014 1 lebih awal (sebelum) jam_2511531014 2");
	        } else {
	        	System.out.println("Status    : jam_2511531014 1 dan) jam_2511531014 2 sama persis");
	        }
	        
	        //5.Operasi Aritmatika
	        System.out.println("Durasi (J1 ke J2)  :" +jam_2511531014.durasiDetik(j1, j2) + "detik");
	        
	        jam_2511531014 jNext = j1.nextSecond();
	        System.out.println("jam_2511531014 1 Detik Berikutnya:" + jNext);
	        
	        jam_2511531014 jPrev = j1.prevSecond();
	        System.out.println("jam_2511531014 1 Detik Sebelumnya:" + jPrev);
	        
	       //6.Operasi Penjumlahan jam_2511531014
	        jam_2511531014 jHasilPlus = j1.plus(j2);
	        System.out.println("Hasil J1 + J2      :" + jHasilPlus);
	        
	        input.close();
	        System.out.println("\nProgram Selesai.");
	    }

		/**
		 * Prosedur pembantu untuk melakukan input dan validasi secara berulang
		 * sampai user memasukkan angka yang benar (0..23, 0..59).
		 */
		private static jam_2511531014 buatjam_2511531014DariInput(Scanner sc) {
		    int h, m, s;

		    while (true) {
		        System.out.print("Masukkan Jam (0-23)   : ");
		        h = sc.nextInt();
		        System.out.print("Masukkan Menit (0-59) : ");
		        m = sc.nextInt();
		        System.out.print("Masukkan Detik (0-59) : ");
		        s = sc.nextInt();

		        // Memanggil method static isValid dari kelas jam_2511531014
		        if (jam_2511531014.isValid(h, m, s)) {
		            return new jam_2511531014(h, m, s);
		        } else {
		            System.out.println("[Error] Input tidak valid! Silakan ulangi.\n");
		        }
		    }
		}
	}

