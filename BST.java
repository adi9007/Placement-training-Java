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

class insertBST {
    TreeNode root;

    public void insert(int val) {
        root = insertRec(root, val);
    }

    private TreeNode insertRec(TreeNode root, int val) {
        if (root == null) {
            root = new TreeNode(val);
            return root;
        }
        if (val < root.val) {
            root.left = insertRec(root.left, val);
        } else if (val > root.val) {
            root.right = insertRec(root.right, val);
        }
        return root;
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
public class BST {
    public static void main(String[] args) {
        insertBST bst = new insertBST();
        bst.insert(34);
        bst.insert(75);
        bst.insert(59);
        bst.insert(15);
        bst.insert(89);
        bst.insert(46);
        bst.insert(2);
        bst.insert(63);
        bst.insert(28);
        bst.insert(96);
        bst.insert(52);
        bst.insert(80);
        bst.insert(10);
        bst.insert(73);

        BinaryTreeDFS dfs = new BinaryTreeDFS();

        System.out.println("Pre-Order DFS:");
        dfs.dfsPreOrder(bst.root);

        System.out.println("\nIn-Order DFS:");
        dfs.dfsInOrder(bst.root);

        System.out.println("\nPost-Order DFS:");
        dfs.dfsPostOrder(bst.root); 
    }
}