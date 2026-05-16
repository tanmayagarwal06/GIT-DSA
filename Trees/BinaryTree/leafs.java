package Trees.BinaryTree;

public class leafs {
    public static int numLeafs(BinaryTreeNode<Integer> root){
        if (root == null) {
            return 0;
        }
        if (root.left == null && root.right == null) {
            return 1;
        }
        return numLeafs(root.left) + numLeafs(root.right);
    }
}
