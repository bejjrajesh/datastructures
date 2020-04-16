package tree.binarytree.array;

public class BinaryTreeMain {

    public static void main(String[] args) {
        BinaryTree binaryTree = new BinaryTree(10);
        binaryTree.insertValue(100);
        binaryTree.insertValue(200);
        binaryTree.insertValue(300);
        binaryTree.insertValue(400);
        binaryTree.insertValue(500);
        boolean isFound = binaryTree.searchValue(300);
        if (isFound) {
            System.out.println("Value Found in the Tree");
        } else {
            System.out.println("Value Not Found in the Tree.");
        }
        binaryTree.doInOrderTraversal();
        binaryTree.doPreOrderTraversal();
        binaryTree.doPostOrderTraversal();
        binaryTree.levelOrderTraversal();
    }
}
