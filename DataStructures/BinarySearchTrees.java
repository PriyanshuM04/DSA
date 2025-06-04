package DataStructures;

public class BinarySearchTrees {
    static class Node {
        int data;
        Node left = null;
        Node right = null;
        Node(int data) {
            this.data = data;
        }
    }

    public static void inOrder(Node root) {
        if (root==null) return;
        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);
    }

    public static Node insert(Node root, int val) {
        if (root==null) {
            root = new Node(val);
            return root;
        }
        if (root.data > val) {
            // Left subtree
            root.left = insert(root.left, val);
        }
        else {
            root.right = insert(root.right, val);
        }
        return root;
    }

    // Searching in a BST
    public static boolean search(Node root, int val) {
        if (root==null) return false;
        if (root.data==val) return true;
        if (val>root.data) {
            // right subtree
            return search(root.right, val);
        }
        else {
            // left subtree
            return search(root.left, val);
        }
    }

    // Deleting a Node
    public static Node inOrderSuccessor (Node root) {
        while (root.left!=null) {
            root = root.left;
        }
        return root;
    }
    public static Node delete(Node root, int val) {
        if (root.data>val) {
            root.left = delete(root.left, val);
        }
        else if (root.data<val) {
            root.right = delete(root.right, val);
        }
        else {
            // root.data==val
            // Case 1 : Leaf Node
            if (root.left==null && root.right==null) return null;
            // Case 2 : Has single child
            if (root.left==null) return root.right;
            else if (root.right==null) return root.left;
            // Case 3 : Have two children
            Node iS = inOrderSuccessor(root.right);
            root.data = iS.data;
            root.right = delete(root.right, iS.data);
        }
        return root;
    }

    public static void main(String[] args) {
//        int[] values = {5,1,3,4,2,7};
        int[] values = {8,5,3,1,4,6,10,11,14};
        Node root = null;

        for (int i : values) {
            root = insert(root, i);
        }
        inOrder(root);
        System.out.println();

        System.out.println(search(root, 11));
        delete(root, 5);
        inOrder(root);
        System.out.println();
    }
}
