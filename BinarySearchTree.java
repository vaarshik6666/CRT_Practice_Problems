class BinarySearchTree {
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.root = tree.insertNode(tree.root, 50);
        tree.root = tree.insertNode(tree.root, 30);
        tree.root = tree.insertNode(tree.root, 70);
        tree.root = tree.insertNode(tree.root, 20);
        tree.root = tree.insertNode(tree.root, 40);
        tree.root = tree.insertNode(tree.root, 60);
        tree.root = tree.insertNode(tree.root, 80);
        tree.inorder(tree.root);
        tree.preorder(tree.root);
        tree.postorder(tree.root);
        tree.search(tree.root, 40);
        tree.delete(tree.root, 30);
        tree.inorder(tree.root);
    }
}

class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
        this.right = null;
        this.left = null;
    }
}

class BinaryTree {
    Node root;

    BinaryTree() {
        this.root = null;
    }

    public static Node newNode(int data) {
        return new Node(data);
    }

    public Node insertNode(Node root, int data) {
        if (root == null)
            return newNode(data);
        if (data > root.data)
            root.right = insertNode(root.right, data);
        else if (data < root.data)
            root.left = insertNode(root.left, data);
        return root;
    }

    public void inorder(Node root) {
        if (root != null) {
            inorder(root.left);
            System.out.print(root.data + " ");
            inorder(root.right);
        }
    }

    public void preorder(Node root) {
        if (root != null) {
            System.out.print(root.data + " ");
            preorder(root.left);
            preorder(root.right);
        }
    }

    public void postorder(Node root) {
        if (root != null) {
            postorder(root.left);
            postorder(root.right);
            System.out.print(root.data + " ");
        }
    }

    public Node search(Node root, int data) {
        if (root == null || root.data == data)
            return root;
        if (data < root.data)
            return search(root.left, data);
        return search(root.right, data);
    }

    public Node delete(Node root, int data) {
        if (root == null)
            return root;
        if (data < root.data)
            root.left = delete(root.left, data);
        else if (data > root.data)
            root.right = delete(root.right, data);
        else {
            if (root.left == null)
                return root.right;
            else if (root.right == null)
                return root.left;
            root.data = minValue(root.right);
            root.right = delete(root.right, root.data);
        }
        return root;
    }

    public int minValue(Node root) {
        int min = root.data;
        while (root.left != null) {
            min = root.left.data;
            root = root.left;
        }
        return min;
    }
}