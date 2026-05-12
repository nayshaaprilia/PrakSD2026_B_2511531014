package pekan6_2511531014;

public class PenelusuranDLL_2511531014 {
	    // fungsi penelusuran maju
	    static void forwardTraversal(NodeDLL_2511531014 head_1014) {
	        // memulai penelusuran dari head
	        NodeDLL_2511531014 curr_1014 = head_1014;
	        // lanjutkan sampai akhir
	        while (curr_1014 != null) {
	            // print data
	            System.out.print(curr_1014.data_1014 + " <-> ");
	            // pindah ke node berikutnya
	            curr_1014 = curr_1014.next_1014;
	        }
	        // print spasi
	        System.out.println();
	    }
	    // fungsi penelusuran mundur
	    static void backwardTraversal(NodeDLL_2511531014 tail_1014) {
	        // mulai dari akhir
	        NodeDLL_2511531014 curr_1014 = tail_1014;
	        // lanjut sampai head
	        while (curr_1014 != null) {
	            // cetak data
	            System.out.print(curr_1014.data_1014 + " <-> ");
	            // pindah ke node sebelumnya
	            curr_1014 = curr_1014.prev_1014;
	        }
	        // cetak spasi
	        System.out.println();
	    }

public static void main(String[] args) {

    // cetak DLL
    NodeDLL_2511531014 head_1014 = new NodeDLL_2511531014(1);
    NodeDLL_2511531014 second_1014 = new NodeDLL_2511531014(2);
    NodeDLL_2511531014 third_1014 = new NodeDLL_2511531014(3);

    head_1014.next_1014 = second_1014;
    second_1014.prev_1014 = head_1014;

    second_1014.next_1014 = third_1014;
    third_1014.prev_1014 = second_1014;

    System.out.println("Penelusuran Maju 2511531014 :");
    forwardTraversal(head_1014);

    System.out.println("Penelusuran Mundur 2511531014 :");
    backwardTraversal(third_1014);
}
}
