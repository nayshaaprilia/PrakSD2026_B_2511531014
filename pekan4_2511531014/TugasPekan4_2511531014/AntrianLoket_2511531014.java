package TugasPekan4_2511531014;

import java.util.Scanner;
import java.util.Stack;

public class AntrianLoket_2511531014 {

	    int max = 10;
	    String data[] = new String[max];
	    int front = 0;
	    int rear = -1;
	    int jumlah = 0;

	    // Tambah Antrian
	    void enqueue_1014(String isi) {
	        if (isFull_1014()) {
	            System.out.println("Antrian penuh!");
	        } else {
	            rear++;
	            data[rear] = isi;
	            jumlah++;
	            System.out.println("Data berhasil ditambah");
	        }
	    }

	    // Hapus Antrian
	    void dequeue_1014() {
	        if (isEmpty_1014()) {
	            System.out.println("Antrian kosong!");
	        } else {
	            System.out.println("Data keluar: " + data[front]);

	            for (int i = 0; i < rear; i++) {
	                data[i] = data[i + 1];
	            }

	            rear--;
	            jumlah--;
	        }
	    }

	    // Tampilkan Antrian
	    void display_1014() {
	        if (isEmpty_1014()) {
	            System.out.println("Antrian kosong!");
	        } else {
	            System.out.println("Isi antrian:");
	            for (int i = 0; i <= rear; i++) {
	                System.out.println((i + 1) + ". " + data[i]);
	            }
	        }
	    }

	    // cek kosong
	    boolean isEmpty_1014() {
	        return jumlah == 0;
	    }

	    // cek penuh
	    boolean isFull_1014() {
	        return jumlah == max;
	    }

	    // Reverse 
	    void reverse_1014() {
	        if (isEmpty_1014()) {
	            System.out.println("Antrian kosong!");
	        } else {
	            Stack<String> stack_1014 = new Stack<>();

	            for (int i = 0; i <= rear; i++) {
	                stack_1014.push(data[i]);
	            }

	            for (int i = 0; i <= rear; i++) {
	                data[i] = stack_1014.pop();
	            }

	            System.out.println("Antrian berhasil dibalik");
	        }
	    }

	    public static void main(String[] args) {

	        Scanner input = new Scanner(System.in);
	        AntrianLoket_2511531014 q_1014 = new AntrianLoket_2511531014();

	        int pilih;
	        String isi;

	        do {
	            System.out.println("\n=== PROGRAM ANTRIAN LOKET ===");
	            System.out.println("1. Tambah Antrian");
	            System.out.println("2. Hapus Antrian");
	            System.out.println("3. Tampilkan Antrian");
	            System.out.println("4. Reverse Antrian");
	            System.out.println("5. Keluar");
	            System.out.print("Pilih menu : ");
	            pilih = input.nextInt();
	            input.nextLine();

	            switch (pilih) {
	                case 1:
	                    System.out.print("Input data : ");
	                    isi = input.nextLine();
	                    q_1014.enqueue_1014(isi);
	                    break;

	                case 2:
	                    q_1014.dequeue_1014();
	                    break;

	                case 3:
	                    q_1014.display_1014();
	                    break;

	                case 4:
	                    q_1014.reverse_1014();
	                    break;

	                case 5:
	                    System.out.println("Program selesai");
	                    break;

	                default:
	                    System.out.println("Menu tidak tersedia");
	            }

	        } while (pilih != 5);
	    }
	}


