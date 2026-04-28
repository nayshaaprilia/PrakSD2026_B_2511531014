package pekan4_2511531014;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;


public class ReverseData_2511531014 {
	public static void main (String[] args) {
		Queue<Integer> q_1014 = new LinkedList<Integer> ();
		q_1014.add(1);
		q_1014.add(2);
		q_1014.add(2);  //[1, 2, 3]
		System.out.println("sebelum reverse" + q_1014);
		Stack<Integer> s_1014 = new Stack<Integer> ();
		while(!q_1014.isEmpty()) { //Q->S
			s_1014.push(q_1014.remove());
		}
		while(!s_1014.isEmpty()) { //S->Q
			q_1014.add(s_1014.pop());
		}
		System.out.println("sesudah reverse= " + q_1014); //[3, 2, 1]
	}
	}

