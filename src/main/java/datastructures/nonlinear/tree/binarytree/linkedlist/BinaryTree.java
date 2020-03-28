package datastructures.nonlinear.tree.binarytree.linkedlist;

import datastructures.linear.queue.linkedlist.LinkedListQueue;

public class BinaryTree<T> {

    private Node<T> root;

    public void createNode(T data){
       if(root == null){
           root = new Node(data);
       }else{
           insertNode(root,data);
       }
    }

    public boolean searchData(T data){
        return searchForNode(root,data);
    }

    private boolean searchForNode(Node<T> root, T data) {
        if(root == null){
            return false;
        }else if(root.getData().equals(data)){
            return true;
        }else{
            boolean isValueFoundLeftSubTree =  searchForNode(root.getLeft(),data);
            boolean isValueFoundRightSubTree = searchForNode(root.getRight(),data);
            return isValueFoundLeftSubTree || isValueFoundRightSubTree;
        }
    }

    public void doPreOrderTraversal(){
        preOrderTraversal(root);
    }

    private void insertNode(Node<T> node, T data) {
        if(node.getLeft()!=null && node.getRight()!= null){
            if(isNodeFull(node.getRight()) && isNodeFull(node.getLeft())){
                insertNode(node.getLeft(),data);
            }else if(isNodeFull(node.getLeft())&&!isNodeFull(node.getRight())){
                insertNode(node.getRight(),data);
            }else{
                insertNode(node.getLeft(),data);
            }
        }else{
            if(node.getLeft()==null){
                node.setLeft(new Node(data));
            }else{
                node.setRight(new Node(data));
            }
        }
    }

    private boolean isNodeFull(Node node){
        return node.getLeft()!=null && node.getRight()!=null;
    }

    private void preOrderTraversal(Node<T> currentNode) {
        if(currentNode ==null){
            return;
        }else {
            System.out.println(currentNode.getData());
            preOrderTraversal(currentNode.getLeft());
            preOrderTraversal(currentNode.getRight());
        }
    }

    public void doInOrderTraversal(){
        inOrderTraversal(root);
    }

    private void inOrderTraversal(Node<T> currentNode) {
        if(currentNode ==null){
            return;
        }else {
            preOrderTraversal(currentNode.getLeft());
            System.out.println(currentNode.getData());
            preOrderTraversal(currentNode.getRight());
        }
    }

    public void doPostOrderTraversal(){
        postOrderTraversal(root);
    }

    private void postOrderTraversal(Node<T> currentNode) {
        if(currentNode ==null){
            return;
        }else {
            preOrderTraversal(currentNode.getLeft());
            System.out.println(currentNode.getData());
            preOrderTraversal(currentNode.getRight());
        }
    }

    public void deleteNode(T data) {

    }

    private void deleteDeepestNode(Node deepestNode) {
        LinkedListQueue<Node> queue = new LinkedListQueue<>();
        queue.enQueue(root);
        while(!queue.isQueueEmpty()){
            Node temp = queue.deQueue();
            if(temp.getLeft() == deepestNode){
                temp.setLeft(null);
            }else if (temp.getRight() == deepestNode){
                temp.setRight(null);
            }else{
                if(temp.getLeft()!=null){
                    queue.enQueue(temp.getLeft());
                }
                if(temp.getRight()!=null){
                    queue.enQueue(temp.getRight());
                }
            }
        }
    }

    private Node getDeepestNode(Node<T> root) {
        LinkedListQueue<Node> queue = new LinkedListQueue<>();
        queue.enQueue(root);
        Node deepestNode = null;
        while (!queue.isQueueEmpty()) {
            Node temp = queue.deQueue();
            if(temp.getLeft() == null && temp.getRight() == null){
                deepestNode = temp;
            }
            else {
                if (temp.getLeft() != null) {
                    queue.enQueue(temp.getLeft());
                }
                if (temp.getRight() != null) {
                    queue.enQueue(temp.getRight());
                }
            }
        }
        return deepestNode;
    }
}
