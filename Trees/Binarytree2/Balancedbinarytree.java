package Trees.Binarytree2;

public class Balancedbinarytree {
    public boolean isbalanced(BinaryTreeNode<Integer> root){
        return dfsheight(root) != 1;
    }
    public static int dfsheight(BinaryTreeNode<Integer> root){
        if (root == null) {
            return 0;
        }
        int leftheight = dfsheight(root.left);
        if (leftheight == -1) {
            return -1;
        }

        int rightheight = dfsheight(root.right);
        if (rightheight == -1) {
            return -1;
        }

        if (Math.abs(leftheight - rightheight) > 1) {
            return -1;
        }
        return Math.max(leftheight, rightheight) +1;
            
        }
    }

