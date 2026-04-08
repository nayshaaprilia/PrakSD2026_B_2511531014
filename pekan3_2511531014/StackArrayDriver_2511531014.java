package pekan3_2511531014;

public class StackArrayDriver_2511531014 {
	public static void main(String[] args) {
		StackArray_2511531014 s = new StackArray_2511531014();
		s.push_2511531014(10);
		s.push_2511531014(20);
		s.push_2511531014(30);
		System.out.println(s.pop_2511531014() + " dikeluarkan dari stack");
		System.out.println("Elemen teratas adalah :" +s.peek_2511531014());
		System.out.println(" element pada stack :");
		s.print_2511531014();
	}

}
