package graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;

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

    public void addDirectedEdge(String sourceValue, String targetValue) {
        GraphNode<String> sourceNode = new GraphNode<>(sourceValue);
        GraphNode<String> targetNode = new GraphNode<>(targetValue);
        int sourceIndex = graph.indexOf(sourceNode);
        int targetIndex = graph.indexOf(targetNode);
        if (sourceIndex == -1 || targetIndex == -1) {
            System.out.println("Specified Node does not exists in the graph");
            return;
        }
        graph.get(sourceIndex).getEdges().add(graph.get(targetIndex));
    }

    public void doBFSTraversal(String value) {
        GraphNode<String> startingNode = new GraphNode<>(value);
        GraphNode startNode = graph.get(graph.indexOf(startingNode));
        System.out.println("BFS Traversal Of the Graph is : ");
        bfsTraversal(startNode);
    }

    public void doDFSTraversal(String value) {
        GraphNode<String> startingNode = new GraphNode<>(value);
        GraphNode startNode = graph.get(graph.indexOf(startingNode));
        System.out.println("\nDFS Traversal of the Graph is : ");
        dfsTraversal(startNode);
    }

    private void bfsTraversal(GraphNode node) {
        LinkedList<GraphNode<Integer>> queue = new LinkedList<>();
        queue.addFirst(node);
        while (!queue.isEmpty()) {
            GraphNode<Integer> currentNode = queue.removeFirst();
            currentNode.setVisited(true);
            System.out.print("\t" + currentNode.getValue());
            for (int i = 0; i < currentNode.getEdges().size(); i++) {
                GraphNode nNode = currentNode.getEdges().get(i);
                if (!nNode.isVisited()) {
                    queue.add(nNode);
                    nNode.setVisited(true);
                }
            }
        }
    }

    private void dfsTraversal(GraphNode node) {
        LinkedList<GraphNode<Integer>> queue = new LinkedList<>();
        queue.addLast(node);
        while (!queue.isEmpty()) {
            GraphNode<Integer> currentNode = queue.removeLast();
            currentNode.setVisited(true);
            System.out.print("\t" + currentNode.getValue());
            for (int i = 0; i < currentNode.getEdges().size(); i++) {
                GraphNode nNode = currentNode.getEdges().get(i);
                if (!nNode.isVisited()) {
                    nNode.setVisited(true);
                    queue.add(nNode);
                }
            }
        }
    }

    public void sortTopologically(){
        System.out.println("\nDoing Topological Sorting on the Graph");
        Stack<GraphNode> stack = new Stack<>();
        for(GraphNode node : graph) {
            if(!node.isVisited()) {
                topologicalSort(node, stack);
            }
        }
        while (!stack.isEmpty()) {
            System.out.print("\t" + stack.pop().getValue());
        }
    }

    private void topologicalSort(GraphNode<String> node, Stack<GraphNode> stack) {
        for( GraphNode currentNode : node.getEdges()){
            if(!currentNode.isVisited()) {
                topologicalSort(currentNode,stack);
            }
        }
        node.setVisited(true);
        stack.push(node);
    }

    public void resetGraph(String value) {
        GraphNode<String> node = new GraphNode<>(value);
        GraphNode<String> nodeFromGraph = graph.get(graph.indexOf(node));
        markUnvisited(nodeFromGraph);
    }

    private void markUnvisited(GraphNode<String> node) {
        if(node.isVisited()){
            node.setVisited(false);
            for(GraphNode currentNode : node.getEdges()){
                markUnvisited(currentNode);
            }
        }
    }
}
