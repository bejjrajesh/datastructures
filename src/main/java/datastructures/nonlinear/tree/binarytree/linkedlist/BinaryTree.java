package datastructures.nonlinear.tree.binarytree.linkedlist;

import datastructures.linear.queue.linkedlist.LinkedListQueue;

import java.util.LinkedList;

/*
 Binary Tree Implementation using LinkedList.
 */
public class BinaryTree<T> {

    //Represents Root of the Binary Tree.
    private Node<T> root;


    public void createNode(T data) {
        // If the Tree is empty, Create new Node and points root to new node.
        if (root == null) {
            root = new Node(data);
        } else {
            // If Tree is not Empty, Traverse Tree recursively up to leaf Node and insert new Node.
            insertNode(root, data);
        }
    }

    private void insertNode(Node<T> node, T data) {
        if (node.getLeft() == null) {            //If LeftNode is null, insert as Left Child
            node.setLeft(new Node(data));
        } else if (node.getRight() == null) {   // If RightNode is null, insert as Right Child.
            node.setRight(new Node(data));
        } else {
            //If Left subtree is incomplete, insert into the left subtree.
            if (!isNodeFull(node.getLeft()) && isNodeFull(node.getRight())) {
                insertNode(node.getLeft(), data);
            } //If Right subtree is incomplete , insert into the right subtree.
            else if (isNodeFull(node.getLeft()) && !isNodeFull(node.getRight())) {
                insertNode(node.getRight(), data);
            } // If both left and right subtree is complete, descend into left subtree.
            else {
                insertNode(node.getLeft(), data);
            }
        }
    }

    public boolean searchData(T data) {
        return searchForNode(root, data);
    }

    private boolean searchForNode(Node<T> root, T data) {
        if (root == null) {
            return false;
        } else if (root.getData().equals(data)) {
            return true;
        } else {
            boolean isValueFoundLeftSubTree = searchForNode(root.getLeft(), data);
            boolean isValueFoundRightSubTree = searchForNode(root.getRight(), data);
            return isValueFoundLeftSubTree || isValueFoundRightSubTree;
        }
    }

    public void doPreOrderTraversal() {
        System.out.println("Traversing Tree in PreOrderTraversal");
        preOrderTraversal(root);
    }

    // A Node is full when it has left and right child.
    private boolean isNodeFull(Node node) {
        return node.getLeft() != null && node.getRight() != null;
    }

    private void preOrderTraversal(Node<T> currentNode) {
        if (currentNode == null) {
            return;
        } else {
            System.out.println(currentNode.getData());
            preOrderTraversal(currentNode.getLeft());
            preOrderTraversal(currentNode.getRight());
        }
    }

    public void doInOrderTraversal() {
        System.out.println("Traversing Tree in InOrderTraversal");
        inOrderTraversal(root);
    }

    private void inOrderTraversal(Node<T> currentNode) {
        if (currentNode == null) {
            return;
        } else {
            preOrderTraversal(currentNode.getLeft());
            System.out.println(currentNode.getData());
            preOrderTraversal(currentNode.getRight());
        }
    }

    public void doPostOrderTraversal() {
        System.out.println("Traversing Tree in PostOrderTraversal");
        postOrderTraversal(root);
    }

    private void postOrderTraversal(Node<T> currentNode) {
        if (currentNode == null) {
            return;
        } else {
            preOrderTraversal(currentNode.getLeft());
            System.out.println(currentNode.getData());
            preOrderTraversal(currentNode.getRight());
        }
    }

    public void deleteValue(T data){
        if(root == null){
            System.out.println("Value Not Found");
        }else if(root.getData().equals(data)){
            root = null;
        }else{
            deleteNode(root,data);
        }
    }

    public void deleteNode(Node currentNode, T data) {
        LinkedList<Node> queue = new LinkedList<>();
        queue.addFirst(currentNode);
        boolean isNodeExists = false;
        while(!queue.isEmpty()){
            Node temp = queue.getFirst();
            if(temp.getData().equals(data)){
                Node deepestNode = getDeepestNode(temp);
                currentNode.setData(deepestNode.getData());
                isNodeExists = true;
            }else{
                queue.add(temp.getLeft());
                queue.add(temp.getRight());
            }
        }
        if(!isNodeExists){
            System.out.println("The Given value not found in the Tree");
        }
    }

    private void deleteDeepestNode(Node deepestNode) {
        LinkedListQueue<Node> queue = new LinkedListQueue<>();
        queue.enQueue(root);
        while (!queue.isQueueEmpty()) {
            Node temp = queue.deQueue();
            if (temp.getLeft() == deepestNode) {
                temp.setLeft(null);
            } else if (temp.getRight() == deepestNode) {
                temp.setRight(null);
            } else {
                if (temp.getLeft() != null) {
                    queue.enQueue(temp.getLeft());
                }
                if (temp.getRight() != null) {
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
            if (temp.getLeft() == null && temp.getRight() == null) {
                deepestNode = temp;
            } else {
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
