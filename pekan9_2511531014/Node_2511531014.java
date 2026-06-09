package pekan9_2511531014;

public class Node_2511531014 {

    int data_1014;
    Node_2511531014 left_1014;
    Node_2511531014 right_1014;

    public Node_2511531014(int data_1014) {
        this.data_1014 = data_1014;
        left_1014 = null;
        right_1014 = null;
    }
    public void setLeft_1014(Node_2511531014 node_1014) {
        if (left_1014 == null)
            left_1014 = node_1014;
    }
    public void setRight_1014(Node_2511531014 node_1014) {
        if (right_1014 == null)
            right_1014 = node_1014;
    }
    public Node_2511531014 getLeft_1014() {
        return left_1014;
    }
    public Node_2511531014 getRight_1014() {
        return right_1014;
    }
    public int getData_1014() {
        return data_1014;
    }
    public void setData_1014(int data_1014) {
        this.data_1014 = data_1014;
    }
    void printPreorder_1014(Node_2511531014 node_1014) {
        if (node_1014 == null)
            return;
        System.out.print(node_1014.data_1014 + " ");
        printPreorder_1014(node_1014.left_1014);
        printPreorder_1014(node_1014.right_1014);
    }
    void printPostorder_1014(Node_2511531014 node_1014) {
        if (node_1014 == null)
            return;
        printPostorder_1014(node_1014.left_1014);
        printPostorder_1014(node_1014.right_1014);
        System.out.print(node_1014.data_1014 + " ");
    }
    void printInorder_1014(Node_2511531014 node_1014) {
        if (node_1014 == null)
            return;
        printInorder_1014(node_1014.left_1014);
        System.out.print(node_1014.data_1014 + " ");
        printInorder_1014(node_1014.right_1014);
    }
    public String print_1014() {
        return this.print_1014("", true, "");
    }
    public String print_1014(String prefix_1014, boolean isTail_1014, String sb_1014) {
        if (right_1014 != null) {
            right_1014.print_1014( prefix_1014 + (isTail_1014 ? "|   " : "    "), false,sb_1014);
        }
        System.out.println( prefix_1014 + (isTail_1014 ? "\\-- " : "/-- ") +data_1014);
        if (left_1014 != null) {
            left_1014.print_1014( prefix_1014 + (isTail_1014 ? "    " : "|   "), true,sb_1014);
        }
        return sb_1014;
    }
}