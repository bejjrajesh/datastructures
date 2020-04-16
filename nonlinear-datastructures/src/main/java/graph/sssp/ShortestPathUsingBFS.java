package graph.sssp;

public class ShortestPathUsingBFS {

    public static void main(String[] args) {
        Graph graph = new Graph();
        graph.addVertex("v2");
        graph.addVertex("v3");
        graph.addVertex("v5");
        graph.addVertex("v6");
        graph.addVertex("v8");
        graph.addVertex("v9");
        graph.addVertex("v10");
        graph.addUndirectedEdge("v2", "v3");
        graph.addUndirectedEdge("v2", "v5");
        graph.addUndirectedEdge("v5", "v8");
        graph.addUndirectedEdge("v8", "v9");
        graph.addUndirectedEdge("v9", "v6");
        graph.addUndirectedEdge("v9", "v10");
        graph.addUndirectedEdge("v6", "v3");
        graph.addUndirectedEdge("v10", "v3");
        graph.singleSourceShortestPath("v2");
    }
}
