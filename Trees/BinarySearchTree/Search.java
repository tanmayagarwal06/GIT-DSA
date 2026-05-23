package Trees.BinarySearchTree;

import Trees.BinarySearchTree.basic.BinaryTreeNode;

public class Search {
    public static boolean searchInBST(BinaryTreeNode<Integer> root, int k){
        if (root == null) {
            return false;
        }
        if (k < root.data) {
            return searchInBST(root.left, k);
        }
        return searchInBST(root.right, k);
    }
}
