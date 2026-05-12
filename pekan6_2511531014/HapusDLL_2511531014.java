package pekan6_2511531014;

public class HapusDLL_2511531014 {
	    // fungsi menghapus node awal
	    public static NodeDLL_2511531014 delHead_1014(NodeDLL_2511531014 head_1014) {
	        if (head_1014 == null) {
	            return null;     }
	        NodeDLL_2511531014 temp_1014 = head_1014;
	        head_1014 = head_1014.next_1014;
	        if (head_1014 != null) {
	            head_1014.prev_1014 = null;    }
	        return head_1014;  
	        }
	    // fungsi menghapus di akhir
	    public static NodeDLL_2511531014 delLast_1014(NodeDLL_2511531014 head_1014) {
	        if (head_1014 == null) {
	            return null; }
	        if (head_1014.next_1014 == null) {
	            return null; }
	        NodeDLL_2511531014 curr_1014 = head_1014;
	        while (curr_1014.next_1014 != null) {
	            curr_1014 = curr_1014.next_1014; 
	            }
	        // update pointer previous node
	        if (curr_1014.prev_1014 != null) {
	            curr_1014.prev_1014.next_1014 = null; }
	        return head_1014;
	    }
	 // fungsi menghapus node pada posisi tertentu
	    public static NodeDLL_2511531014 delPos_1014(NodeDLL_2511531014 head_1014, int pos_1014) {
	        // jika DLL kosong
	        if (head_1014 == null) {
	            return head_1014; }
	        NodeDLL_2511531014 curr_1014 = head_1014;
	        // telusuri sampai ke node yang akan dihapus
	        for (int i = 1; curr_1014 != null && i < pos_1014; ++i) {
	            curr_1014 = curr_1014.next_1014;
	        }
	        // jika posisi tidak ditemukan
	        if (curr_1014 == null) {
	            return head_1014;
	        }
	        // update pointer
	        if (curr_1014.prev_1014 != null) {
	            curr_1014.prev_1014.next_1014 = curr_1014.next_1014;
	        }
	        if (curr_1014.next_1014 != null) {
	            curr_1014.next_1014.prev_1014 = curr_1014.prev_1014;
	        }
	        // jika yang dihapus head
	        if (head_1014 == curr_1014) {
	            head_1014 = curr_1014.next_1014;
	        }
             return head_1014;
	    }
	    // fungsi mencetak DLL
	    public static void printList(NodeDLL_2511531014 head_1014) {
	        NodeDLL_2511531014 curr_1014 = head_1014;
	        while (curr_1014 != null) {
	            System.out.print(curr_1014.data_1014 + " <-> ");
	            curr_1014 = curr_1014.next_1014;
	        }
	        System.out.println();
	    }

	    public static void main(String[] args) {
	        // buat sebuah DLL
	        NodeDLL_2511531014 head_1014 = new NodeDLL_2511531014(1);
	        head_1014.next_1014 = new NodeDLL_2511531014(2);
	        head_1014.next_1014.prev_1014 = head_1014;
	        head_1014.next_1014.next_1014 = new NodeDLL_2511531014(3);
	        head_1014.next_1014.next_1014.prev_1014 = head_1014.next_1014;
	        head_1014.next_1014.next_1014.next_1014 = new NodeDLL_2511531014(4);
	        head_1014.next_1014.next_1014.next_1014.prev_1014 = head_1014.next_1014.next_1014;
	        head_1014.next_1014.next_1014.next_1014.next_1014 = new NodeDLL_2511531014(5);
	        head_1014.next_1014.next_1014.next_1014.next_1014.prev_1014 = head_1014.next_1014.next_1014.next_1014;

	        System.out.print("DLL Awal: ");
	        printList(head_1014);

	        System.out.print("Setelah head dihapus: ");
	        head_1014 = delHead_1014(head_1014);
	        printList(head_1014);

	        System.out.print("Setelah node terakhir dihapus: ");
	        head_1014 = delLast_1014(head_1014);
	        printList(head_1014);

	        System.out.print("menghapus node ke 2: ");
	        head_1014 = delPos_1014(head_1014, 2);

	        printList(head_1014);
	    }

	}

