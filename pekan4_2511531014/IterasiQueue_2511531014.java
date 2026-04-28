package pekan4_2511531014;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class IterasiQueue_2511531014 {
	public static void main (String args[])
	{
		Queue<String> q_1014 = new LinkedList<>();
		q_1014.add("Praktikum");
		q_1014.add("Struktur");
		q_1014.add("Data");
		q_1014.add("Algoritma");
		Iterator<String> iterator = q_1014.iterator();
		while (iterator.hasNext()) {
			System.out.print(iterator.next() + " ");
		}
		
	}

}
