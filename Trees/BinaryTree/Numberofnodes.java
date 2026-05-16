package Trees.BinaryTree;

public class Numberofnodes {
    public static int numnodes(BinaryTreeNode<Integer> root){
        if (root == null) {
            return 0;
        }
        int leftnodecount = numnodes(root.left);
        int rightnodecount = numnodes(root.right);
        return  1 + leftnodecount + rightnodecount;
    }
}
