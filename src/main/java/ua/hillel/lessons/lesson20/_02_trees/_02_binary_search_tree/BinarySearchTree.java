package ua.hillel.lessons.lesson20._02_trees._02_binary_search_tree;

public class BinarySearchTree {

    Node root;

    BinarySearchTree() {
        root = null;
    }

    void insert(int key) {
        root = insertKey(root, key);
    }

    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();
        tree.insert(8);
        tree.insert(3);
        tree.insert(1);
        tree.insert(6);
        tree.insert(7);
        tree.insert(10);
        tree.insert(14);
        tree.insert(4);

        System.out.print("Inorder traversal: ");
        tree.inorder();

        System.out.println("\n\nAfter deleting 10");
        tree.deleteKey(10);
        System.out.print("Inorder traversal: ");
        tree.inorder();
    }

    // Вставляємо ключ/вузол в дерево
    Node insertKey(Node root, int key) {
        // Повертаємо новий вузол, якщо дерево порожнє
        if (root == null) {
            root = new Node(key);
            return root;
        }

        // Переходимо в потрібне місце та вставляємо вузол
        if (key < root.key)
            root.left = insertKey(root.left, key);
        else if (key > root.key)
            root.right = insertKey(root.right, key);

        return root;
    }

    void inorder() {
        inorderRec(root);
    }

    // Неупорядкований обхід
    void inorderRec(Node root) {
        if (root != null) {
            inorderRec(root.left);
            System.out.print(root.key + " ");
            inorderRec(root.right);
        }
    }

    void deleteKey(int key) {
        root = deleteRec(root, key);
    }

    Node deleteRec(Node root, int key) {
        // Повернення, якщо дерево порожнє
        if (root == null)
            return root;

        // Знаходимо вузол, який потрібно видалити
        if (key < root.key)
            root.left = deleteRec(root.left, key);
        else if (key > root.key)
            root.right = deleteRec(root.right, key);
        else {
            // Якщо вузол тільки з одним нащадком
            // або без нащадка
            if (root.left == null)
                return root.right;
            else if (root.right == null)
                return root.left;

            // Якщо вузол має двох нащадків,
            // переміщуємо наступника за порядком
            // в позицію видаляємого вузла
            root.key = minValue(root.right);

            // Видаляємо наступника за порядком
            root.right = deleteRec(root.right, root.key);
        }

        return root;
    }

    // Знаходимо наступника за порядком
    int minValue(Node root) {
        int minv = root.key;
        while (root.left != null) {
            minv = root.left.key;
            root = root.left;
        }
        return minv;
    }

}
