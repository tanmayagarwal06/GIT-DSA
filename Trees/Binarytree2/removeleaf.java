package Trees.Binarytree2;

import Trees.BinaryTree.BinaryTreeNode;

public class removeleaf {
    public static BinaryTreeNode<Integer> removeLeaf(BinaryTreeNode<Integer> root){
        if (root == null) {
            return null;
        }
        if (root.left == null && root.right == null) {
            return null;
        }
        root.left = removeLeaf(root.left);
        root.right = removeLeaf(root.right);
        return root;
    }
}
