package tree.binarytree.array;

/*
 BinaryTree Implementation using Array. Every Element x left child is at 2x + 1 and right child is at 2x + 2.
 Since root is at index =0 , its left child 2*0+1 = 1(index) and its right child is at 2*0+2 = 2(index).
 Same logic goes with all other elements.
 */

public class BinaryTree {

    //Array representing the Binary Tree.
    private int[] binaryTree;

    //Keeps track of next unused slot in the array.
    int lastUsedCellIndex = 0;

    //Initialize Tree with given size and fill all slots with -1. Cell value -1 means unused cell.
    public BinaryTree(int size) {
        binaryTree = new int[size];
        for (int i = 0; i < binaryTree.length; i++) {
            binaryTree[i] = -1;
        }
    }

    //Inserting in Tree is simply inserting at unused cell index.
    public void insertValue(int value) {
        binaryTree[lastUsedCellIndex] = value;
        lastUsedCellIndex++;
    }

    //Searching Binary Tree is simple searching the Array.
    public boolean searchValue(int value) {
        boolean isValueFound = false;
        for (int i = 0; i < lastUsedCellIndex; i++) {
            if (binaryTree[i] == value) {
                isValueFound = true;
                break;
            }
        }
        return isValueFound;
    }

    //Driver Method for InOrderTraversal of the Tree.
    public void doInOrderTraversal() {
        System.out.println("InOder Traversal of the Tree");
        inOrderTraversal(0);
    }

    //InOrder Traversal of the Tree from root (index=0)
    private void inOrderTraversal(int index) {
        if (index > lastUsedCellIndex) {
            return;
        } else {
            inOrderTraversal(2 * index + 1);
            System.out.println(binaryTree[index]);
            inOrderTraversal(2 * index + 2);
        }
    }

    //Driver Method for PreOderTraversal of the Tree.
    public void doPreOrderTraversal() {
        System.out.println("PreOrder Traversal of the Tree");
        preOrderTraversal(0);
    }

    //PreOrderTraversal Of the Tree from root( index = 0).
    private void preOrderTraversal(int index) {
        if (index > lastUsedCellIndex) {
            return;
        } else {
            System.out.println(binaryTree[index]);
            preOrderTraversal(2 * index + 1);
            preOrderTraversal(2 * index + 2);
        }
    }

    //Driver method for PostOderTraversal of the Tree.
    public void doPostOrderTraversal() {
        System.out.println("PostOder Traversal of the Tree");
        postOrderTraversal(0);
    }

    //PostOrderTraversal of the Tree from root (index=0)
    private void postOrderTraversal(int index) {
        if (index > lastUsedCellIndex) {
            return;
        } else {
            System.out.println(binaryTree[index]);
            postOrderTraversal(2 * index + 1);
            postOrderTraversal(2 * index + 2);
        }
    }

    //LevelOrder Traversal of the Tree. Simple Traverse the array. Elements are stored in the array as per level order only.
    public void levelOrderTraversal() {
        System.out.println("LevelOrder Traversal of the Tree");
        for (int i = 1; i <= lastUsedCellIndex; i++) {
            System.out.println(binaryTree[i]);
        }
    }
}
