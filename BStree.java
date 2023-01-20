class Node {
    int key;
    Node left, right;

    public Node(int item) {
        key = item;
        left = right = null;
    }
}

class BinarySearchTree {
    Node root;
    BinarySearchTree() {
        root = null;
    }


    void insert(int key) {
       root = insertRec(root, key);
    }


    Node insertRec(Node root, int key) {
        if (root == null) {
            root = new Node(key);
            return root;
        }
        if (key < root.key)
            root.left = insertRec(root.left, key);
        else if (key > root.key)
            root.right = insertRec(root.right, key);


        return root;
    }


    void inorder()  {
       inorderRec(root);
    }
    void inorderRec(Node root) {
        if (root != null) {
            inorderRec(root.left);
            System.out.print(root.key + " ");
            inorderRec(root.right);
        }
    }
    void postorder() {
        postorderRec(root);
    }

    void postorderRec(Node root) {
        if (root != null) {
            postorderRec(root.left);
            postorderRec(root.right);
            System.out.print(root.key + " ");
        }
    }
    void preorder() {
        preorderRec(root);
    }

    void preorderRec(Node root) {
        if (root != null) {
            System.out.print(root.key + " ");
            preorderRec(root.left);
            preorderRec(root.right);
        }
    }
    void searchnode(int key) {
        search(root,key);
    }
    Node search(Node root, int key) {
        if (root == null || root.key == key)
            return root;

        if (root.key > key)
            return search(root.left, key);


        return search(root.right, key);
    }
    void minvalue() {
        minValueNode(root);
    }
    Node minValueNode(Node root) {
        Node current = root;

        while (current.left != null) {
            current = current.left;
        }
        System.out.println("min="+current.key);
        return current;
    }
    void delete(int key) {
        deleteNode(root,key);
    }
    Node deleteNode(Node root, int key) {
        if (root == null)
            return root;

        if (key < root.key)
            root.left = deleteNode(root.left, key);

        else if (key > root.key)
            root.right = deleteNode(root.right, key);

        else {
            if (root.left == null)
                return root.right;
            else if (root.right == null)
                return root.left;

            root.key = minValueNode(root.right).key;
            root.right = deleteNode(root.right, root.key);

        }
        return root;
    }
    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();
        tree.insert(50);
        tree.insert(30);
        tree.insert(20);
        tree.insert(40);
        tree.insert(70);
        tree.insert(60);
        tree.insert(80);
        tree.preorder();
        tree.delete(80);
        tree.preorder();
        tree.minvalue();

    }
}