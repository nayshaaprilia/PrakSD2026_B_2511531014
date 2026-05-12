package pekan6_2511531014;

public class InsertDLL_2511531014 {

    // menambahkan node pada awal DLL
    static NodeDLL_2511531014 insertBegin(NodeDLL_2511531014 head_1014, int data_1014) {
        // buat node baru
        NodeDLL_2511531014 new_node = new NodeDLL_2511531014(data_1014);
        // jadikan pointer next nya head
        new_node.next_1014 = head_1014;
        // jadikan pointer prev head ke new node
        if (head_1014 != null) {
            head_1014.prev_1014 = new_node;
        }
        return new_node;
    }

    // fungsi menambah node di akhir
    public static NodeDLL_2511531014 insertEnd(NodeDLL_2511531014 head_1014, int newData_1014) {
        // buat node baru
        NodeDLL_2511531014 newNode = new NodeDLL_2511531014(newData_1014);
        // jika DLL kosong
        if (head_1014 == null) {
            head_1014 = newNode;
            
        } 
        else {
            NodeDLL_2511531014 curr_1014 = head_1014;
            while (curr_1014.next_1014 != null) {
                curr_1014 = curr_1014.next_1014;
            }
            curr_1014.next_1014 = newNode;
            newNode.prev_1014 = curr_1014;
        }
        return head_1014;
    }

    // fungsi menambahkan node ke posisi tertentu
    public static NodeDLL_2511531014 insertAtPosition(NodeDLL_2511531014 head_1014, int pos, int new_data) {
        // buat node baru
        NodeDLL_2511531014 new_node = new NodeDLL_2511531014(new_data);
        if (pos == 1) {
            new_node.next_1014 = head_1014;
            if (head_1014 != null) {
                head_1014.prev_1014 = new_node;}
            head_1014 = new_node;
            return head_1014;}
        
        NodeDLL_2511531014 curr_1014 = head_1014;
        for (int i = 1; i < pos - 1 && curr_1014 != null; ++i) {
            curr_1014 = curr_1014.next_1014; }
        if (curr_1014 == null) {
            System.out.println("Posisi tidak ada");
            return head_1014;}
        
        new_node.prev_1014 = curr_1014;
        new_node.next_1014 = curr_1014.next_1014;
        curr_1014.next_1014 = new_node;
        if (new_node.next_1014 != null) {
            new_node.next_1014.prev_1014 = new_node; }
        return head_1014;
    }
    public static void printList(NodeDLL_2511531014 head_1014) {
        NodeDLL_2511531014 curr_1014 = head_1014;
        while (curr_1014 != null) {
            System.out.print(curr_1014.data_1014 + " <-> ");
            curr_1014 = curr_1014.next_1014;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // membuat dll 2 <-> 3 <-> 5
        NodeDLL_2511531014 head_1014 = new NodeDLL_2511531014(2);
        head_1014.next_1014 = new NodeDLL_2511531014(3);
        head_1014.next_1014.prev_1014 = head_1014;
        head_1014.next_1014.next_1014 = new NodeDLL_2511531014(5);
        head_1014.next_1014.next_1014.prev_1014 = head_1014.next_1014;

        // cetak DLL awal
        System.out.print("DLL Awal 2511531014 : ");
        printList(head_1014);

        // tambah 1 di awal
        head_1014 = insertBegin(head_1014, 1);
        System.out.print(
        		"Simpul 1 ditambah di awal 2511531014 : ");
        printList(head_1014);

        // tambah 6 di akhir
        System.out.print(
        		"Simpul 6 ditambah di akhir 2511531014 : ");
        int data_1014 = 6;
        head_1014 = insertEnd(head_1014, data_1014);
        printList(head_1014);

        // menambah node 4 di posisi 4
        System.out.print("Tambah node 4 di posisi 4 2511531014 : ");
        int data2_1014 = 4;
        int pos_1014 = 4;
        head_1014 = insertAtPosition(head_1014, pos_1014, data2_1014);
        printList(head_1014);
    }
}