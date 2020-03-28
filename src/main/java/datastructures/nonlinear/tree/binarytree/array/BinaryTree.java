package datastructures.nonlinear.tree.binarytree.array;

public class BinaryTree {

    private int[] binaryTree;
    int lastUsedCellIndex = 0;

    public BinaryTree(int size) {
        binaryTree = new int[size];
        for (int i = 0; i < binaryTree.length; i++) {
            binaryTree[i] = -1;
        }
    }

    public void insertValue(int value) {
        lastUsedCellIndex+=1;
        binaryTree[lastUsedCellIndex] = value;

    }

    public boolean searchValue(int value){
        boolean isValueFound = false;
        for(int i=1; i<lastUsedCellIndex;i++){
            if(binaryTree[i]==value){
                isValueFound = true;
                break;
            }
        }
        return isValueFound;
    }

    public void inOrderTraversal(int index){
        if(index > lastUsedCellIndex){
            return;
        }else {
            inOrderTraversal(2 * index);
            System.out.println(binaryTree[index]);
            inOrderTraversal(2*index+1);
        }
    }

    public void preOrderTraversal(int index){
        if(index > lastUsedCellIndex){
            return;
        }else {
            System.out.println(binaryTree[index]);
            preOrderTraversal(2 * index);
            preOrderTraversal(2*index+1);
        }
    }

    public void postOrderTraversal(int index){
        if(index > lastUsedCellIndex){
            return;
        }else {
            System.out.println(binaryTree[index]);
            postOrderTraversal(2*index+1);
            postOrderTraversal(2 * index);
        }
    }

    public void levelOrderTraversal(){
        for(int i=1;i<=lastUsedCellIndex;i++){
            System.out.println(binaryTree[i]);
        }
    }
}
