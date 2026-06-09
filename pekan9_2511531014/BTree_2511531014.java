package pekan9_2511531014;

public class BTree_2511531014 {

    private Node_2511531014 root_1014;
    private Node_2511531014 currentNode_1014;

    public BTree_2511531014() {
        root_1014 = null;
    }
    public boolean search_1014(int data_1014) {
        return search_1014(root_1014, data_1014);
    }
    private boolean search_1014(Node_2511531014 node_1014,
                                int data_1014) {
        if (node_1014.getData_1014() == data_1014)
            return true;
        if (node_1014.getLeft_1014() != null)
            if (search_1014(node_1014.getLeft_1014(), data_1014))
                return true;
        if (node_1014.getRight_1014() != null)
            if (search_1014(node_1014.getRight_1014(), data_1014))
                return true;

        return false;
    }
    public void printInorder_1014() {
        root_1014.printInorder_1014(root_1014);
    }
    public void printPreOrder_1014() {
        root_1014.printPreorder_1014(root_1014);
    }
    public void printPostOrder_1014() {
        root_1014.printPostorder_1014(root_1014);
    }
    public Node_2511531014 getRoot_1014() {
        return root_1014;
    }
    public boolean isEmpty_1014() {
        return root_1014 == null;
    }
    public int countNodes_1014() {
        return countNodes_1014(root_1014);
    }
    private int countNodes_1014(Node_2511531014 node_1014) {
        int count_1014 = 1;
        if (node_1014 == null) {
            return 0;
        } else {
            count_1014 += countNodes_1014(node_1014.getLeft_1014());
            count_1014 += countNodes_1014(node_1014.getRight_1014());
            return count_1014;
        }
    }
    public void print_1014() {
        root_1014.print_1014();
    }
    public Node_2511531014 getCurrent_1014() {
        return currentNode_1014;
    }
    public void setCurrent_1014(Node_2511531014 node_1014) {
        this.currentNode_1014 = node_1014;
    }
    public void setRoot_1014(Node_2511531014 root_1014) {
        this.root_1014 = root_1014;
    }
}