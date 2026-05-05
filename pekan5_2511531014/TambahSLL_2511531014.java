package pekan5_2511531014;

public class TambahSLL_2511531014 {

    public static NodeSLL_2511531014 insertAtFront(NodeSLL_2511531014 head, int value) {
        NodeSLL_2511531014 newnode_1014 = new NodeSLL_2511531014(value);
        newnode_1014.next_1014 = head;
        return newnode_1014;
    }

    // fungsi menambahkan node di akhir SLL
    public static NodeSLL_2511531014 insertAtEnd(NodeSLL_2511531014 head, int value) {
        NodeSLL_2511531014 newNode_1014 = new NodeSLL_2511531014(value);

        if (head == null) {
            return newNode_1014;
        }

        NodeSLL_2511531014 last = head;

        while (last.next_1014 != null) {
            last = last.next_1014;
        }

        last.next_1014 = newNode_1014;
        return head;
    }

    static NodeSLL_2511531014 GetNode(int data_1014) {
        return new NodeSLL_2511531014(data_1014);
    }

    static NodeSLL_2511531014 insertPos(NodeSLL_2511531014 headNode, int position, int value) {
        NodeSLL_2511531014 head = headNode;

        if (position < 1) {
            System.out.print("Invalid position");
            return head;
        }

        if (position == 1) {
            NodeSLL_2511531014 newnode_1014 = new NodeSLL_2511531014(value);
            newnode_1014.next_1014 = head;
            return newnode_1014;
        } else {
            while (position-- != 0 && headNode != null) {
                if (position == 1) {
                    NodeSLL_2511531014 newnode_1014 = GetNode(value);
                    newnode_1014.next_1014 = headNode.next_1014;
                    headNode.next_1014 = newnode_1014;
                    break;
                }
                headNode = headNode.next_1014;
            }

            if (position != 1) {
                System.out.print("Posisi di luar jangkauan");
            }

            return head;
        }
    }

    public static void printList(NodeSLL_2511531014 head) {
        NodeSLL_2511531014 curr = head;

        while (curr != null) {
            System.out.print(curr.data_1014);
            if (curr.next_1014 != null) {
                System.out.print("-->");
            }
            curr = curr.next_1014;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // buat linked list 2->3->5->6
        NodeSLL_2511531014 head = new NodeSLL_2511531014(2);
        head.next_1014 = new NodeSLL_2511531014(3);
        head.next_1014.next_1014 = new NodeSLL_2511531014(5);
        head.next_1014.next_1014.next_1014 = new NodeSLL_2511531014(6);

        // cetak list asli
        System.out.print("Senarai berantai awal:");
        printList(head);

        // tambah node baru di depan
        System.out.print("tambah 1 simpul di depan: ");
        int data = 1;
        head = insertAtFront(head, data);
        printList(head);

        // tambahkan node baru di belakang
        System.out.print("tambah 1 simpul di belakang: ");
        int data2 = 7;
        head = insertAtEnd(head, data2);
        printList(head);

        System.out.print("tambah 1 simpul ke data 4: ");
        int data3 = 4;
        int pos = 4;
        head = insertPos(head, pos, data3);
        printList(head);
    }
}