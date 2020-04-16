package tree.binarytree.linkedlist;

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

    //Insert a node by doing level order traversal
    private void insertNode(Node<T> root, T data) {

        if (root.getLeft() == null) {
            //If LeftNode is empty, insert as Left Child
            root.setLeft(new Node(data));
        } else if (root.getRight() == null) {
            // If RightNode is null, insert as Right Child.
            root.setRight(new Node(data));
        } else {
            //If Left subtree is incomplete, insert into the left subtree.
            if (!isNodeFull(root.getLeft()) && isNodeFull(root.getRight())) {
                insertNode(root.getLeft(), data);
            } //If Right subtree is incomplete , insert into the right subtree.
            else if (isNodeFull(root.getLeft()) && !isNodeFull(root.getRight())) {
                insertNode(root.getRight(), data);
            } // If both left and right subtree is complete, descend into left subtree.
            else {
                insertNode(root.getLeft(), data);
            }
        }
    }

    public boolean searchData(T data) {
        return searchForNode(root, data);
    }

    private boolean searchForNode(Node<T> root, T data) {
        if (root == null) {
            // if root is null return false
            return false;
        } else if (root.getData().equals(data)) {
            //if root value equals to data , then we found the node and return true.
            return true;
        } else {
            // If the root value not equals to data, then search in left subtree and right subtree.
            boolean isValueFoundLeftSubTree = searchForNode(root.getLeft(), data);
            boolean isValueFoundRightSubTree = searchForNode(root.getRight(), data);
            return isValueFoundLeftSubTree || isValueFoundRightSubTree;
        }
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

    // A Node is full when it has left and right child.
    private boolean isNodeFull(Node node) {

        return node.getLeft() != null && node.getRight() != null;
    }


    public void deleteValue(T data) {
        if (root == null) {
            System.out.println("Tree does not exists!!");
        } else if (root.getData().equals(data)) {
            root = null;
        } else {
            deleteNode(root, data);
        }
    }

    public void delete(Node<T> root, T data) {
        if (root == null) {
            return;
        } else if (root.getData().equals(data)) {
            Node<T> deepestNode = getDeepestNode(root);
            deleteDeepestNode(deepestNode);
        } else {
            delete(root.getLeft(), data);
            delete(root.getRight(), data);
        }
    }

    public void deleteNode(Node currentNode, T data) {
        LinkedList<Node> queue = new LinkedList<>();
        queue.addFirst(currentNode);
        boolean isNodeExists = false;
        while (!queue.isEmpty()) {
            Node temp = queue.getFirst();
            if (temp.getData().equals(data)) {
                Node deepestNode = getDeepestNode(temp);
                currentNode.setData(deepestNode.getData());
                isNodeExists = true;
            } else {
                queue.add(temp.getLeft());
                queue.add(temp.getRight());
            }
        }
        if (!isNodeExists) {
            System.out.println("The Given value not found in the Tree");
        }
    }

    private void deleteDeepestNode(Node deepestNode) {
        LinkedList<Node> queue = new LinkedList<>();
        queue.addLast(root);
        while (!queue.isEmpty()) {
            Node temp = queue.removeFirst();
            if (temp.getLeft() == deepestNode) {
                temp.setLeft(null);
            } else if (temp.getRight() == deepestNode) {
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

    private Node getDeepestNode(Node<T> currentNode) {
        if (currentNode.getLeft() != null) {
            return getDeepestNode(currentNode.getLeft());
        } else if (currentNode.getRight() != null) {
            return getDeepestNode(currentNode.getRight());
        } else {
            return currentNode;
        }
    }
}
