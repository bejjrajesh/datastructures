package datastructures.nonlinear.tree.binarysearchtree;

public class BinarySearchTreeMain {

    public static void main(String args[]){
        BinarySearchTree tree = new BinarySearchTree();
        tree.insertValue(100);
        tree.insertValue(400);
        tree.insertValue(80);
        tree.insertValue(60);
        tree.insertValue(90);
        tree.insertValue(85);
        tree.insertValue(88);
        tree.insertValue(95);
        tree.insertValue(110);
        tree.insertValue(120);
        tree.insertValue(130);
        System.out.println("Doing PreOrderTraversal");
        tree.doPreOrderTraversal();
        System.out.println("Doing InOrderTraversal");
        tree.doInOrderTraversal();
        System.out.println("Doing PostOrderTraversal");
        tree.doPostOrderTraversal();
        System.out.println(tree.doSearch(340));
        System.out.println(tree.doSearch(330));
        tree.doDelete(80);
        tree.doPreOrderTraversal();
        tree.doDelete(90);
        tree.doPreOrderTraversal();
    }
}
