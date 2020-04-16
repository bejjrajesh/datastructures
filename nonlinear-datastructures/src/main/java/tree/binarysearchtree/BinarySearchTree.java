package tree.binarysearchtree;

import java.util.LinkedHashMap;
import java.util.LinkedList;

public class BinarySearchTree {

    private Node root;

    public void insertValue(int data) {
        root = createNode(root, data);
    }

    private Node createNode(Node currentNode, int data) {
        if (currentNode == null) {
            currentNode = new Node(data);
        } else if (data < currentNode.getData()) {
            Node node = createNode(currentNode.getLeft(), data);
            currentNode.setLeft(node);
        } else if (data > currentNode.getData()) {
            Node node = createNode(currentNode.getRight(), data);
            currentNode.setRight(node);
        }
        return currentNode;
    }

    public boolean doSearch(int value) {
        return searchValue(root, value);
    }

    public void doPreOrderTraversal() {
        preOrderTraversal(root);
    }

    public void doInOrderTraversal() {
        inOrderTraversal(root);
    }

    public void doPostOrderTraversal() {
        postOrderTraversal(root);
    }

    public void doDelete(int value) {
        deleteNode(root, value);
    }

    public Node deleteNode(Node root, int value) {
        if (root == null) {
            System.out.println("Value not found");
            return null;
        }
        if (value < root.getData()) {
            root.setLeft(deleteNode(root.getLeft(), value));
        } else if (value > root.getData()) {
            root.setRight(deleteNode(root.getRight(), value));
        } else {
            if (root.getLeft() != null && root.getRight() != null) {
                Node minNode = findRightMinimum(root.getRight());
                root.setRight(deleteNode(root.getRight(), minNode.getData()));
                root.setData(minNode.getData());
            } else if (root.getLeft() != null) {
                root = root.getLeft();
            } else if (root.getRight() != null) {
                root = root.getRight();
            } else {
                root = null;
            }
        }
        return root;
    }

    private Node findRightMinimum(Node node) {
        if (node.getLeft() == null) {
            return node;
        } else {
            return findRightMinimum(node.getLeft());
        }
    }

    public boolean searchValue(Node node, int value) {
        if (node == null) {
            return false;
        } else if (node.getData() == value) {
            return true;
        } else if (value < node.getData()) {
            return searchValue(node.getLeft(), value);
        } else {
            return searchValue(node.getRight(), value);
        }
    }

    public void preOrderTraversal(Node root) {
        if (root == null) {
            return;
        } else {
            System.out.println(root.getData());
            preOrderTraversal(root.getLeft());
            preOrderTraversal(root.getRight());
        }
    }

    public void inOrderTraversal(Node root) {
        if (root == null) {
            return;
        } else {
            inOrderTraversal(root.getLeft());
            System.out.println(root.getData());
            inOrderTraversal(root.getRight());
        }
    }

    public void postOrderTraversal(Node root) {
        if (root == null) {
            return;
        } else {
            postOrderTraversal(root.getLeft());
            postOrderTraversal(root.getRight());
            System.out.println(root.getData());
        }
    }


    public void doLevelOrderTraversal(){
        System.out.println("Level Order Traversal of the Tree : ");
        LinkedList<Node> queue = new LinkedList<>();
        queue.addLast(root);
        while(!queue.isEmpty()){
            Node tempNode = queue.removeFirst();
            System.out.println(tempNode.getData());
            if(tempNode.getLeft() != null){
                queue.addLast(tempNode.getLeft());
            }
            if(tempNode.getRight() != null){
                queue.addLast(tempNode.getRight());
            }
        }
    }
}
