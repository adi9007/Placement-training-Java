
    // Definition for a binary tree node
    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

    TreeNode(int val) {
        this.val = val;
        this.left = null;
        this.right = null;
    }
}

// Class containing the DFS logic
class BinaryTreeDFS {

    // 1. Pre-Order DFS (Root -> Left -> Right)
    public void dfsPreOrder(TreeNode root) {
        if (root == null) {
            return;
        }
        System.out.print(root.val + " "); // Process current node
        dfsPreOrder(root.left);           // Recur on left
        dfsPreOrder(root.right);          // Recur on right
    }

    // 2. In-Order DFS (Left -> Root -> Right)
    public void dfsInOrder(TreeNode root) {
        if (root == null) {
            return;
        }
        dfsInOrder(root.left);            // Recur on left
        System.out.print(root.val + " "); // Process current node
        dfsInOrder(root.right);           // Recur on right
    }

    // 3. Post-Order DFS (Left -> Right -> Root)
    public void dfsPostOrder(TreeNode root) {
        if (root == null) {
            return;
        }
        dfsPostOrder(root.left);           // Recur on left
        dfsPostOrder(root.right);          // Recur on right
        System.out.print(root.val + " ");  // Process current node
    }
}

// Main class to execute the program
public class inprepostorder {
    public static void main(String[] args) {
        BinaryTreeDFS tree = new BinaryTreeDFS();
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        // Execute and print the variations of DFS
        System.out.println("Pre-order DFS (Root -> Left -> Right):");
        tree.dfsPreOrder(root); 
        System.out.println("\n");

        System.out.println("In-order DFS (Left -> Root -> Right):");
        tree.dfsInOrder(root);  
        System.out.println("\n");

        System.out.println("Post-order DFS (Left -> Right -> Root):");
        tree.dfsPostOrder(root); 
        System.out.println();
    }
}

