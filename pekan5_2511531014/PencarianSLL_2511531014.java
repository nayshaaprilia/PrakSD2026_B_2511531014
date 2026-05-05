package pekan5_2511531014;

public class PencarianSLL_2511531014 {

    static boolean searchKey(NodeSLL_2511531014 head, int key) {
        NodeSLL_2511531014 curr = head;

        while (curr != null) {
            if (curr.data_1014 == key)
                return true;
            curr = curr.next_1014;
        }

        return false;
    }

    public static void traversal(NodeSLL_2511531014 head) {
        NodeSLL_2511531014 curr = head;

        while (curr != null) {
            System.out.print(" " + curr.data_1014);
            curr = curr.next_1014;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        NodeSLL_2511531014 head = new NodeSLL_2511531014(14);
        head.next_1014 = new NodeSLL_2511531014(21);
        head.next_1014.next_1014 = new NodeSLL_2511531014(13);
        head.next_1014.next_1014.next_1014 = new NodeSLL_2511531014(30);
        head.next_1014.next_1014.next_1014.next_1014 = new NodeSLL_2511531014(10);

        System.out.print("Penelusuran SLL : ");
        traversal(head);

        int key = 30;
        System.out.print("cari data " + key + " = ");

        if (searchKey(head, key))
            System.out.println("ketemu");
        else
            System.out.println("tidak ada");
    }
}

