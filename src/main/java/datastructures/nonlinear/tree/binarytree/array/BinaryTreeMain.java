package datastructures.nonlinear.tree.binarytree.array;

public class BinaryTreeMain {

    public static void main(String args[]){
        BinaryTree binaryTree = new BinaryTree(10);
        binaryTree.insertValue(100);
        binaryTree.insertValue(200);
        binaryTree.insertValue(300);
        binaryTree.insertValue(400);
        binaryTree.insertValue(500);
        System.out.println(binaryTree.searchValue(300));
        System.out.println("Doing InOrder Traversal");
        binaryTree.inOrderTraversal(1);
        System.out.println("Doing PostOrder Traversal");
        binaryTree.preOrderTraversal(1);
        System.out.println("Doing PreOrder Traversal");
        binaryTree.postOrderTraversal(1);
        System.out.println("Level Order Traversal");
        binaryTree.levelOrderTraversal();
    }
}
