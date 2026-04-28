package pekan4_2511531014;
import java.util.LinkedList;
import java.util.Queue;

public class QueueLinkedList_2511531014 {
	public static void main (String[] args) {
		Queue<Integer> q_1014 = new LinkedList<>();
		//tambah elemen (0, 1, 2, 3, 4,5) ke antrian
		for (int i = 0; i < 6; i++)
			q_1014.add(i);
		//menampilkan isi antrian
		System.out.println ("Elemen Antrian " + q_1014);
		//mengahpus kepala antrian
		int hapus = q_1014.remove();
		System.out.println ("Hapus Antrian " + hapus);
		System.out.println (q_1014);
		//melihat antrian terdepan
		int depan = q_1014.peek();
		System.out.println ("Kepala Antrian " + depan);
		
		int banyak = q_1014.size();
		System.out.println ("Size Antrian " + banyak);	
	}

}
