package ua.goit.practice.firstpractice.BinarySearchTree;

public class BinarySearchTree {
    private TreeNode root;

    public TreeNode getRoot() {
        return root;
    }

    public class TreeNode {
        private int value;
        private TreeNode left;
        private TreeNode right;

        public TreeNode(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }

        public void setValue(int value) {
            this.value = value;
        }

        public TreeNode getLeft() {
            return left;
        }

        public TreeNode getRight() {
            return right;
        }

        public void setLeft(TreeNode left) {
            this.left = left;
        }

        public void setRight(TreeNode right) {
            this.right = right;
        }
    }

    public void buildTree(int[] array) {
        root = new TreeNode(array[0]);
        for (int i = 1; i < array.length; i++) {
            TreeNode currentNode = root;
            boolean positionFound = false;
            while (!positionFound) {
                if (array[i] > currentNode.getValue()) {
                    if (currentNode.getRight() == null) {
                        currentNode.setRight(new TreeNode(array[i]));
                        positionFound = true;
                    } else {
                        currentNode = currentNode.getRight();
                    }
                } else {
                    if (currentNode.getLeft() == null) {
                        currentNode.setLeft(new TreeNode(array[i]));
                        positionFound = true;
                    } else {
                        currentNode = currentNode.getLeft();
                    }
                }
            }
        }
    }

    public boolean exist(TreeNode root, int target) {
        TreeNode current = root;
        while (current != null) {
            if (target == current.getValue()) {
                return true;
            }
            if (target > current.getValue()) {
                current = current.getRight();
            } else current = current.getLeft();
        }
        return false;
    }

    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();

        int[] array = {19, 25, 2, 13, 8, 5, 11, 14};
        tree.buildTree(array);
        boolean result = tree.exist(tree.getRoot(), 3);

        System.out.println(result);
    }
}
