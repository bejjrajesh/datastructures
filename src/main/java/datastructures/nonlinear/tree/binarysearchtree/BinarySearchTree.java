package datastructures.nonlinear.tree.binarysearchtree;

public class BinarySearchTree {

    private Node root;

    public void insertValue(int data) {
        root = createNode(root, data);
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
        deleteValue(root, value);
    }

    public void deleteValue(Node node, int value) {
        if(node == null){
            System.out.println("Value not found");
        }
        Node nodeToDelete = nodeToDelete(node, value);
        if (nodeToDelete == null) {
            System.out.println("Value not Found");
        } else if (nodeToDelete.getLeft() != null && nodeToDelete.getRight() != null) {
            Node minNode = findRightMinimum(nodeToDelete.getRight());
            deleteValue(nodeToDelete.getRight(),minNode.getData());
            nodeToDelete.setData(minNode.getData());
        } else if (nodeToDelete.getLeft() != null) {
            nodeToDelete.setData(nodeToDelete.getLeft().getData());
            nodeToDelete.setLeft(nodeToDelete.getLeft().getLeft());
        } else if (nodeToDelete.getRight() != null) {
            nodeToDelete.setData(nodeToDelete.getRight().getData());
            nodeToDelete.setRight(nodeToDelete.getRight().getRight());
        } else{

        }
    }

    private Node findRightMinimum(Node node) {
        if (node.getLeft() == null) {
            return node;
        } else {
            return findRightMinimum(node.getLeft());
        }
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

    public Node nodeToDelete(Node currentNode, int value) {
        if (currentNode == null) {
            return null;
        } else if (currentNode.getData() == value) {
            return currentNode;
        } else if (value < currentNode.getData()) {
            return nodeToDelete(currentNode.getLeft(), value);
        } else {
            return nodeToDelete(currentNode.getRight(), value);
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
}
