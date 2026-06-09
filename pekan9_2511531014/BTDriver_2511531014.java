package pekan9_2511531014;

public class BTDriver_2511531014 {
	public static void main(String[] args) {
		//Membuat Pohon
		BTree_2511531014 tree_1014 = new BTree_2511531014 ();
		System.out.print("Jumlah Simpul awal pohon: ");
		System.out.println(tree_1014.countNodes_1014());
		//Menambahkan simpul data 1
		Node_2511531014 root_1014 = new Node_2511531014 (1);
		//menjadikan simpul 1 sebagai root
		tree_1014. setRoot_1014(root_1014);
		System.out.println("Jumlah simpul jika hanya ada root");
		System.out.println(tree_1014.countNodes_1014());
		Node_2511531014 node2_1014 = new Node_2511531014(2);
		Node_2511531014 node3_1014 = new Node_2511531014(3);
		Node_2511531014 node4_1014 = new Node_2511531014(4);
		Node_2511531014 node5_1014 = new Node_2511531014(5);
		Node_2511531014 node6_1014 = new Node_2511531014(6);
		Node_2511531014 node7_1014 = new Node_2511531014(7);
		Node_2511531014 node8_1014 = new Node_2511531014(8);
		Node_2511531014 node9_1014 = new Node_2511531014(9);
		root_1014.setLeft_1014(node2_1014);
		node2_1014.setLeft_1014(node4_1014);
		node2_1014.setRight_1014(node5_1014);
		node4_1014.setRight_1014(node8_1014);
		root_1014.setRight_1014(node3_1014);
		node3_1014.setLeft_1014(node6_1014);
		node3_1014.setRight_1014(node7_1014);
		node6_1014.setLeft_1014(node9_1014); 
		//set root
		tree_1014.setCurrent_1014(tree_1014.getRoot_1014());
		System.out.println("menampilkan simpul terakhir:");
		System.out.println(tree_1014.getCurrent_1014().getData_1014());
		System.out.println("Jumlah simpul; setelah simpul 7 ditambahakan");
		System.out.println(tree_1014.countNodes_1014());
		System.out.println("InOrder:");
		tree_1014.printInorder_1014();
		System.out.println("\nPreorder: ");
		tree_1014.printInorder_1014();
		System.out.println("\nPostorder: ");
		tree_1014.printInorder_1014();
		System.out.println("\nDmenampilkan simpul dalam bentuk pohon ");
		tree_1014.print_1014();
		
	}

}
