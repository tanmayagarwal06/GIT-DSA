package Trees.Binarytree2;

import javax.swing.tree.TreeNode;

public class preandin {
    public TreeNode buildTree(int[] preorder, int[] inorder){
        
        return helper(preorder, 0,preorder.length - 1, inorder, 0, inorder.length - 1);

    }
    public TreeNode helper(int[] preorder, int prestart, int preend, int[] inorder, int instart, int inend){
        if (prestart > preend || instart > inend) {
            return null;
        }
        int rootvalue = preorder[prestart];
        TreeNode root = new TreeNode(rootvalue);

        int index = -1;

        for(int i = 0; i < inend; i++){
            if (inorder[i] == rootvalue) {
                index = i;
                break;
            }
        }
        int leftsize = index - instart;

        root.left = helper(preorder, prestart + 1, prestart + leftsize, inorder, instart, index - 1);

        root.right = helper(preorder, prestart + leftsize + 1, preend, inorder, index + 1, inend);

        return root;
    }
}
