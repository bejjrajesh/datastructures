package datastructures.nonlinear.tree.binarytree.linkedlist;

public class BinaryTreeMain {

    public static void main(String args[]){
        BinaryTree<Integer> tree = new BinaryTree<>();
        tree.createNode(100);
        tree.createNode(200);
        tree.createNode(300);
        tree.createNode(400);
        tree.createNode(500);
        tree.createNode(600);
        tree.createNode(700);
        System.out.println(tree.searchData(400));
        System.out.println(tree.searchData(420));
        tree.doPreOrderTraversal();
        tree.doInOrderTraversal();
        tree.doPostOrderTraversal();
    }
}
