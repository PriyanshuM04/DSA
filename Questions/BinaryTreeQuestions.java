package Questions;

public class BinaryTreeQuestions {
    static class Node {
        int data;
        Node left;
        Node right;
        Node (int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    static class Tree {
        static int idx = -1;
        public static Node buildTree(int[] nodes) {
            idx++;
            if (nodes[idx]==-1) return null;
            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);
            return newNode;
        }
    }
    static class TreeInfo {
        int ht;
        int diam;
        TreeInfo(int ht, int diam) {
            this.ht = ht;
            this.diam = diam;
        }
    }


    // 1. Count Nodes
    public static int countNodes(Node root) {
        if (root==null) return 0;
        int leftCount = countNodes(root.left);
        int rightCount = countNodes(root.right);
        int count = leftCount + rightCount +1;
        return count;
    }

    // 2. Sum of Nodes
    public static int sumOfNodes(Node root) {
        if (root==null) return 0;
        int leftSum = sumOfNodes(root.left);
        int rightSum = sumOfNodes(root.right);
        int sum = leftSum + rightSum + root.data;
        return sum;
    }

    // 3. Height of a Tree
    public static int heightOfTree(Node root) {
        if (root==null) return 0;
        int leftHeight = heightOfTree(root.left);
        int rightHeight = heightOfTree(root.right);
        return 1 + Math.max(leftHeight, rightHeight);
    }

    // 4. Diameter of Tree
    public static int diameter(Node root) {
        // Using O(n^2)
        if (root==null) return 0;
        int leftDiam = diameter(root.left);
        int rightDiam = diameter(root.right);
        int ht = heightOfTree(root.left) + heightOfTree(root.right) + 1;
        return Math.max(ht, Math.max(leftDiam, rightDiam));
    }
    public static TreeInfo diameter2(Node root) {
        // Using O(n)
        if (root==null) {
            return new TreeInfo(0, 0);
        }
        TreeInfo left = diameter2(root.left);
        TreeInfo right = diameter2(root.right);
        int myHeight = Math.max(left.ht, right.ht) + 1;
        int diam1 = left.diam;
        int diam2 = right.diam;
        int diam3 = left.ht + right.ht + 1;
        int myDiam = Math.max(Math.max(diam1, diam2), diam3);
        TreeInfo myInfo = new TreeInfo(myHeight, myDiam);
        return myInfo;
    }

    public static void main(String[] args) {
        int[] nodes = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        Tree tree = new Tree();
        Node root = tree.buildTree(nodes);

//        System.out.println("Total Nodes = " + countNodes(root));
//        System.out.println("Sum of Nodes = " + sumOfNodes(root));
//        System.out.println("Height of Tree = " + heightOfTree(root));
//        System.out.println("Diameter of Tree = " + diameter(root));       // O(n^2)
//        System.out.println("Diameter of Tree = " + diameter2(root).diam);       // O(n)
    }
}
