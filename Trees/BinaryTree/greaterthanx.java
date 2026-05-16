package Trees.BinaryTree;

public class greaterthanx {
    public static int countNodesGreaterThanX(BinaryTreeNode<Integer> root, int x){
        if (root == null) {
            return 0;
        }
        int count = 0;
        if (root.data > x) {
            count = 1;
        }
        count += countNodesGreaterThanX(root.left, x);
        count += countNodesGreaterThanX(root.right, x);
        return count;
    }
}
