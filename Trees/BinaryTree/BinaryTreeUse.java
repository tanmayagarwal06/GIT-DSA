package Trees.BinaryTree;

public class BinaryTreeUse {

    public static void printTree1(BinaryTreeNode<Integer> root){
        if (root == null) {
            return;
        }
        System.out.println(root.data);
        printTree1(root.left);
        printTree1(root.right);
        
        
    }

    public static void printTree(BinaryTreeNode<Integer> root){
         if (root == null) {
            return;
        }
        System.out.print(root.data + ":");
        if (root.left != null) {
            System.out.print("L" + root.left.data + ", ");
        }
        if (root.right != null) {
            System.out.print("R" + root.right.data);
        }
        System.out.println();

        printTree(root.left);
        printTree(root.right);

    }
    public static void main(String[] args) {
        BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(1);

        BinaryTreeNode<Integer> rootLeft = new BinaryTreeNode<Integer>(2);
        BinaryTreeNode<Integer> rootRight = new BinaryTreeNode<Integer>(3);

        root.left = rootLeft;
        root.right = rootRight;

        BinaryTreeNode<Integer> twosright = new BinaryTreeNode<Integer>(4);
        BinaryTreeNode<Integer> threesleft = new BinaryTreeNode<Integer>(5);

        rootLeft.right = twosright;
        rootRight.left = threesleft;

        printTree(root);
    }
}
