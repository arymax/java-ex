import java.util.Random;
public class RBmain {
    public static void main(String[] args) {
        RBtree rbtree = new RBtree();

        // Insert some random keys into the tree
        int[] keysinsert={25,26,35,47,50,75};
        for (int key :keysinsert) {
            rbtree.insert(key);

            System.out.println("Inserted key: " + key);
        }

        // Delete a few keys from the tree
        int[] keysToDelete = { 25, 50, 75 };
        for (int key : keysToDelete) {
            rbtree.delete(key);
            System.out.println("Deleted key: " + key);
        }
        System.out.print(rbtree.search(35));
    }
}
class RBtree {
    private static final boolean RED = true;
    private static final boolean BLACK = false;
    private class Node {
        int key;
        Node left;
        Node right;
        boolean color;

        public Node(int key, boolean color) {
            this.key = key;
            this.color = color;
        }
    }
    private Node root;
    private boolean isRed(Node node) {
        if (node == null) {
            return false;
        }
        return node.color == RED;
    }
    private Node rotateLeft(Node node) {
        Node right = node.right;
        node.right = right.left;
        right.left = node;
        right.color = node.color;
        node.color = RED;
        return right;
    }
    private Node rotateRight(Node node) {
        Node left = node.left;
        node.left = left.right;
        left.right = node;
        left.color = node.color;
        node.color = RED;
        return left;
    }
    private void flipColors(Node node) {
        node.color = !node.color;
        node.left.color = !node.left.color;
        node.right.color = !node.right.color;
    }
    private Node findMin(Node node) {
        if (node.left == null) {
            return node;
        }
        return findMin(node.left);
    }
    private Node moveRedLeft(Node node) {
        node.color = !node.color;
        if (isRed(node.right.left)) {
            node.right = rotateRight(node.right);
            node = rotateLeft(node);
            flipColors(node);
        }else if (!isRed(node.right) && !isRed(node.left)) {
            node = rotateLeft(node);
            node.color = !node.color;
        }
        return node;
    }
    public void insert(int key) {
        root = insert(root, key);
        root.color = BLACK;
    }

    private Node insert(Node node, int key) {
        if (node == null) {
            return new Node(key, RED);
        }

        if (key < node.key) {
            node.left = insert(node.left, key);
        } else if (key > node.key) {
            node.right = insert(node.right, key);
        } else {
            // key already exists in the tree, do nothing
            return node;
        }

        if (isRed(node.right) && !isRed(node.left)) {
            node = rotateLeft(node);
        }
        if (isRed(node.left) && isRed(node.left.left)) {
            node = rotateRight(node);
        }
        if (isRed(node.left) && isRed(node.right)) {
            flipColors(node);
        }

        return node;
    }

    public void delete(int key) {
        root = delete(root, key);
        if (root != null) {
            root.color = BLACK;
        }
    }

    private Node delete(Node node, int key) {
        if (node == null) {
            return null;
        }
        if (node.left == null) {
            return node.right;
        } else if (node.right == null) {
            return node.left;
        }
        if (key < node.key) {
            node.left = delete(node.left, key);
        } else if (key > node.key) {
            node.right = delete(node.right, key);
        } else {
            // found the node to be deleted
            if (node.left == null && node.right == null) {
                return null;
            } else if (node.left == null) {
                return node.right;
            } else if (node.right == null) {
                return node.left;
            } else {
                // node has two children
                Node min = findMin(node.right);
                node.key = min.key;
                node.right = delete(node.right, min.key);
            }
        }

        if (!isRed(node.left) && !isRed(node.right)) {
            node = moveRedLeft(node);
        }

        if (isRed(node.right)) {
            node = rotateLeft(node);
        }

        if (isRed(node.left) && isRed(node.left.left)) {
            node = rotateRight(node);
        }

        if (isRed(node.left) && isRed(node.right)) {
            flipColors(node);
        }
        if (isRed(node)) {
            node.color = BLACK;
        }
        if (!isRed(node.left) && !isRed(node.right)) {
            node = moveRedLeft(node);
        }

        return node;
    }

    public boolean search(int key) {
        return search(root, key);
    }

    private boolean search(Node node, int key) {
        if (node == null) {
            return false;
        }

        if (key < node.key) {
            return search(node.left, key);
        } else if (key > node.key) {
            return search(node.right, key);
        } else {
            return true;
        }
    }
}
