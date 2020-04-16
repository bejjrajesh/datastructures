package tree.binarytree.linkedlist;

import java.util.LinkedList;
import java.util.Queue;

/*
 Binary Tree Implementation using LinkedList.
 */
public class BinaryTreeWithQueue<T> {

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

    //Insert a node by doing level order traversal
    private void insertNode(Node<T> root, T data) {
        Node<T> node = new Node(data);
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            //If left child is null, insert new node as left chid.
            if (root.getLeft() == null) {
                root.setLeft(node);
                //If right child is null,insert new node as right child
            } else if (root.getRight() == null) {
                root.setRight(node);
                //if both left and right child are occupied, add left, right child to queue and move with the next on the same level as root.
            } else {
                queue.add(root.getLeft());
                queue.add(root.getRight());
            }
        }
    }

    public boolean searchNode(T data) {
        boolean isNodeFound = false;
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            Node<T> currentNode = queue.remove();
            if (currentNode.getData().equals(data)) {
                isNodeFound = true;
            } else if (currentNode.getLeft() != null) {
                queue.add(currentNode.getLeft());
            } else if (currentNode.getRight() != null) {
                queue.add(currentNode.getRight());
            }
        }
        return isNodeFound;
    }

    public void doPreOrderTraversal() {
        System.out.println("Traversing Tree in PreOrderTraversal");
        preOrderTraversal(root);
    }

    public void doInOrderTraversal() {
        System.out.println("Traversing Tree in InOrderTraversal");
        inOrderTraversal(root);
    }

    public void doPostOrderTraversal() {
        System.out.println("Traversing Tree in PostOrderTraversal");
        postOrderTraversal(root);
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

    private void inOrderTraversal(Node<T> currentNode) {
        if (currentNode == null) {
            return;
        } else {
            preOrderTraversal(currentNode.getLeft());
            System.out.println(currentNode.getData());
            preOrderTraversal(currentNode.getRight());
        }
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

    public void deleteValue(T data) {
        if (root == null) {
            System.out.println("Value Not Found");
        } else {
            deleteNode(root, data);
        }
    }

    public void deleteNode(Node currentNode, T data) {
        LinkedList<Node> queue = new LinkedList<>();
        queue.addFirst(currentNode);
        boolean isNodeExists = false;
        while (!queue.isEmpty()) {
            Node temp = queue.getFirst();
            if (temp.getData().equals(data)) {
                Node<T> deepestNode = getDeepestNode(temp);
                currentNode.setData(deepestNode.getData());
                deleteDeepestNode(temp, deepestNode.getData());
                isNodeExists = true;
            } else {
                queue.add(temp.getLeft());
                queue.add(temp.getRight());
            }
        }
        if (isNodeExists) {
            System.out.println("The Given value found in the Tree");
        } else {
            System.out.println("The Given value not found in the Tree");
        }
    }

    private void deleteDeepestNode(Node currentNode, T data) {
        LinkedList<Node> queue = new LinkedList<>();
        queue.addLast(currentNode);
        while (!queue.isEmpty()) {
            Node temp = queue.removeFirst();
            if (temp.getLeft() != null && temp.getLeft().getData().equals(data)) {
                temp.setLeft(null);
            } else if (temp.getRight() != null && temp.getRight().getData().equals(data)) {
                temp.setRight(null);
            } else {
                if (temp.getLeft() != null) {
                    queue.addLast(temp.getLeft());
                }
                if (temp.getRight() != null) {
                    queue.addLast(temp.getRight());
                }
            }
        }
    }

    private Node getDeepestNode(Node<T> root) {
        LinkedList<Node> queue = new LinkedList<>();
        queue.addLast(root);
        Node deepestNode = null;
        while (!queue.isEmpty()) {
            Node temp = queue.removeFirst();
            if (temp.getLeft() == null && temp.getRight() == null) {
                deepestNode = temp;
            } else {
                if (temp.getLeft() != null) {
                    queue.addLast(temp.getLeft());
                }
                if (temp.getRight() != null) {
                    queue.addLast(temp.getRight());
                }
            }
        }
        return deepestNode;
    }
}
