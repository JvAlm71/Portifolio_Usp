public class BinarySearchTree<T extends Comparable<T>> {
    private Node root;

    private class Node {
        T value;
        Node left;
        Node right;

        Node(T value) {
            this.value = value;
            left = null;
            right = null;
        }
    }

    public void insert(T value) {
        root = insert(root, value);
    }

    private Node insert(Node node, T value) {
        if (node == null) {
            return new Node(value);
        }

        int cmp = value.compareTo(node.value);
        if (cmp < 0) {
            node.left = insert(node.left, value);
        } else if (cmp > 0) {
            node.right = insert(node.right, value);
        }

        return node;
    }

    public void remove(T value) {
        root = remove(root, value);
    }

    private Node remove(Node node, T value) {
        if (node == null) return null;

        int cmp = value.compareTo(node.value);
        if (cmp < 0) {
            node.left = remove(node.left, value);
        } else if (cmp > 0) {
            node.right = remove(node.right, value);
        } else {
            if (node.left == null) return node.right;
            if (node.right == null) return node.left;

            Node temp = node;
            node = min(temp.right);
            node.right = removeMin(temp.right);
            node.left = temp.left;
        }
        return node;
    }

    private Node min(Node node) {
        if (node.left == null) return node;
        return min(node.left);
    }

    private Node removeMin(Node node) {
        if (node.left == null) return node.right;
        node.left = removeMin(node.left);
        return node;
    }

    public boolean search(T value) {
        return search(root, value);
    }

    private boolean search(Node node, T value) {
        if (node == null) return false;

        int cmp = value.compareTo(node.value);
        if (cmp < 0) {
            return search(node.left, value);
        } else if (cmp > 0) {
            return search(node.right, value);
        } else {
            return true;
        }
    }

    public void printInOrder() {
        printInOrder(root);
        System.out.println();
    }

    private void printInOrder(Node node) {
        if (node == null) return;
        printInOrder(node.left);
        System.out.print(node.value + " ");
        printInOrder(node.right);
    }

    public static void main(String[] args) {
        BinarySearchTree<Integer> bst = new BinarySearchTree<>();
        bst.insert(5);
        bst.insert(3);
        bst.insert(7);
        bst.insert(2);
        bst.insert(4);
        bst.insert(6);
        bst.insert(8);

        System.out.println("In-Order Traversal:");
        bst.printInOrder();

        System.out.println("Search 4: " + bst.search(4));
        System.out.println("Search 9: " + bst.search(9));

        bst.remove(4);
        bst.remove(7);

        System.out.println("In-Order Traversal after removals:");
        bst.printInOrder();
    }
}
