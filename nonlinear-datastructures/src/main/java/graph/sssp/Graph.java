package graph.sssp;

import java.util.ArrayList;
import java.util.LinkedList;

public class Graph {

    private ArrayList<GraphNode<String>> graph = new ArrayList<>();

    public void addVertex(String value) {
        GraphNode<String> node = new GraphNode<>(value);
        graph.add(node);
    }

    public void addUndirectedEdge(String sourceValue, String targetValue) {
        GraphNode<String> sourceNode = new GraphNode<>(sourceValue);
        GraphNode<String> targetNode = new GraphNode<>(targetValue);
        int sourceIndex = graph.indexOf(sourceNode);
        int targetIndex = graph.indexOf(targetNode);
        if (sourceIndex == -1 || targetIndex == -1) {
            System.out.println("Specified Node does not exists in the graph");
            return;
        }
        graph.get(sourceIndex).getEdges().add(graph.get(targetIndex));
        graph.get(targetIndex).getEdges().add(graph.get(sourceIndex));

    }

    public void singleSourceShortestPath(String value) {
        GraphNode node = new GraphNode(value);
        GraphNode graphNode = graph.get(graph.indexOf(node));
        LinkedList<GraphNode> queue = new LinkedList<>();
        queue.addFirst(graphNode);
        while (!queue.isEmpty()) {
            GraphNode<String> currentNode = queue.removeFirst();
            currentNode.setVisited(true);
            System.out.print("Printing path for node "+currentNode.getValue()+": ");
            printPath(currentNode);
            for (GraphNode edgeNode : currentNode.getEdges()) {
                if (!edgeNode.isVisited()) {
                    edgeNode.setVisited(true);
                    queue.addFirst(edgeNode);
                    edgeNode.getParents().add(currentNode);
                }
            }
        }
    }

    private void printPath(GraphNode<String> node) {
        if (node.getParents() != null && !node.getParents().isEmpty()) {
            for (GraphNode currentNode : node.getParents()) {
                printPath(currentNode);
            }
        }
        System.out.println("\t" + node.getValue());
    }
}
