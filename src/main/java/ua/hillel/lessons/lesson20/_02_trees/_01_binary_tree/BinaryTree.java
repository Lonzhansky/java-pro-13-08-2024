package ua.hillel.lessons.lesson20._02_trees._01_binary_tree;

public class BinaryTree {

    Node root;

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.root.right.left = new Node(7);
        tree.root.right.right = new Node(8);

        System.out.println("Preorder traversal");
        tree.traversalPreorder(tree.root);
        System.out.println("Inorder traversal");
        tree.traversaInorder(tree.root);
        System.out.println("Postorder traversal");
        tree.traversaPostorder(tree.root);

    }

    public void traversalPreorder(Node node) {
        if (node != null) {
            System.out.println(" " + node.key);
            traversalPreorder(node.left);
            traversalPreorder(node.right);
        }
    }

    public void traversaInorder(Node node) {
        if (node != null) {
            traversaInorder(node.left);
            System.out.println(" " + node.key);
            traversaInorder(node.right);
        }
    }

    public void traversaPostorder(Node node) {
        if (node != null) {
            traversaPostorder(node.left);
            traversaPostorder(node.right);
            System.out.println(" " + node.key);
        }
    }


}
