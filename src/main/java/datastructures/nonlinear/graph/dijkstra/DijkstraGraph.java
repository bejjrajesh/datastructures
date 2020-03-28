package datastructures.nonlinear.graph.dijkstra;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class DijkstraGraph {

    private List<WeightedNode<String>> graph = new ArrayList<>();

    public void findPathUsingDijkstra(String nodeValue) {
        WeightedNode currentNode = getNodeFromGraph(nodeValue);
        currentNode.setDistance(0);
        PriorityQueue<WeightedNode> queue = new PriorityQueue<>(WeightedNode::compareTo);
        queue.addAll(graph);
        while (!queue.isEmpty()) {
            WeightedNode<String> presentNode = queue.remove();
            for (WeightedNode neighbor : presentNode.getEdges()) {
                if (neighbor.getDistance() > (presentNode.getDistance() + (int) presentNode.getWeightMap().get(neighbor))) {
                    neighbor.setDistance(presentNode.getDistance() + (int) presentNode.getWeightMap().get(neighbor));
                    neighbor.setParent(presentNode);
                    queue.remove(neighbor);
                    queue.add(neighbor);
                }
            }
        }
        for (WeightedNode nodeToCheck : graph) {
            System.out.println("Node " + nodeToCheck.getValue() + " distance : " + nodeToCheck.getDistance() + " Path: ");
            printPath(nodeToCheck);
            System.out.println();
        }
    }

    private void printPath(WeightedNode<String> nodeToCheck) {
        if (nodeToCheck.getParent() != null) {
            System.out.println(nodeToCheck.getParent().getValue());
        }
    }

    public void addVertex(String value) {
        WeightedNode node = new WeightedNode(value);
        graph.add(node);
    }

    public void addDirectedEdge(String source, String target, int weight) {
        WeightedNode sourceNode = graph.get(graph.indexOf(new WeightedNode<>(source)));
        WeightedNode targetNode = graph.get(graph.indexOf(new WeightedNode<>(target)));
        sourceNode.getEdges().add(targetNode);
        sourceNode.getWeightMap().put(targetNode, weight);
    }

    private WeightedNode getNodeFromGraph(String value) {
        WeightedNode temp = new WeightedNode(value);
        int index = graph.indexOf(temp);
        return graph.get(index);
    }
}
