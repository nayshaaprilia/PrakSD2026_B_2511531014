package pekan5_2511531014;

public class HapusSLL_2511531014 {

    // fungsi untuk menghapus head
    public static NodeSLL_2511531014 deleteHead(NodeSLL_2511531014 head) {
        // jika SLL kosong
        if (head == null)
            return null;

        // pindahkan head ke node berikutnya
        head = head.next_1014;

        // return head baru
        return head;
    }

    // fungsi menghapus node terakhir SLL
    public static NodeSLL_2511531014 removeLastNode(NodeSLL_2511531014 head) {

        // jika list kosong
        if (head == null) {
            return null;
        }

        // jika hanya 1 node
        if (head.next_1014 == null) {
            return null;
        }

        // cari node ke-2 dari belakang
        NodeSLL_2511531014 secondLast = head;

        while (secondLast.next_1014.next_1014 != null) {
            secondLast = secondLast.next_1014;
        }

        // hapus node terakhir
        secondLast.next_1014 = null;

        return head;
    }
    
 // fungsi menghapus node di posisi tertentu
    public static NodeSLL_2511531014 deleteNode(NodeSLL_2511531014 head, int position) {
        NodeSLL_2511531014 temp = head;
        NodeSLL_2511531014 prev = null;

        // jika linked list kosong
        if (temp == null)
            return head;

        // kasus 1: hapus head
        if (position == 1) {
            head = temp.next_1014;
            return head;
        }

        // telusuri ke node yang mau dihapus
        for (int i = 1; temp != null && i < position; i++) {
            prev = temp;
            temp = temp.next_1014;
        }

        // jika node ditemukan
        if (temp != null) {
            prev.next_1014 = temp.next_1014;
        } else {
            System.out.println("Data tidak ada");
        }

        return head;
    }

    // fungsi mencetak SLL
    public static void printList(NodeSLL_2511531014 head) {
        NodeSLL_2511531014 curr = head;

        // handle kalau list kosong
        if (curr == null) {
            System.out.println("List kosong");
            return;
        }

        while (curr != null) {
            System.out.print(curr.data_1014);
            if (curr.next_1014 != null) {
                System.out.print("-->");
            }
            curr = curr.next_1014;
        }
        System.out.println();
    } 
    
 // kelas main
    public static void main(String[] args) {
        // buat SLL 1 -> 2 -> 3 -> 4 -> 5 -> 6 -> null
        NodeSLL_2511531014 head = new NodeSLL_2511531014(1);
        head.next_1014 = new NodeSLL_2511531014(2);
        head.next_1014.next_1014 = new NodeSLL_2511531014(3);
        head.next_1014.next_1014.next_1014 = new NodeSLL_2511531014(4);
        head.next_1014.next_1014.next_1014.next_1014 = new NodeSLL_2511531014(5);
        head.next_1014.next_1014.next_1014.next_1014.next_1014 = new NodeSLL_2511531014(6);

        // cetak list awal
        System.out.println("List awal: ");
        printList(head);

        // hapus head
        head = deleteHead(head);
        System.out.println("List setelah head dihapus: ");
        printList(head);

        // hapus node terakhir
        head = removeLastNode(head);
        System.out.println("List setelah simpul terakhir dihapus: ");
        printList(head);

        // hapus node di posisi 2
        int position = 2;
        head = deleteNode(head, position);
        System.out.println("List setelah posisi 2 dihapus: ");
        printList(head);
    }
}