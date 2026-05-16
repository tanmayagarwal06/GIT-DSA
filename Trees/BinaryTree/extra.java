package Trees.BinaryTree;

public class extra {
    public static void changeToDepthTree(BinaryTreeNode<Integer> root){
        helper(root, 0);
    }

    public static void helper(BinaryTreeNode<Integer> root, int depth ){
        if (root == null) {
            return;
        }
        root.data= depth;
        helper(root.left, depth+1);
        helper(root.right, depth+1);
    }
    
}
