package datastructures.nonlinear.graph;

public class GraphMain {

    public static void main(String[] args){
        Graph graph = new Graph();
        graph.addVertex("v2");
        graph.addVertex("v3");
        graph.addVertex("v5");
        graph.addVertex("v6");
        graph.addVertex("v8");
        graph.addVertex("v9");
        graph.addVertex("v10");
        graph.addUndirectedEdge("v2","v3");
        graph.addUndirectedEdge("v2","v5");
        graph.addUndirectedEdge("v5","v8");
        graph.addUndirectedEdge("v8","v9");
        graph.addUndirectedEdge("v9","v6");
        graph.addUndirectedEdge("v9","v10");
        graph.addUndirectedEdge("v6","v3");
        graph.addUndirectedEdge("v10","v3");
        graph.doBFSTraversal("v2");
        graph.resetGraph("v2");
        graph.doDFSTraversal("v2");

        //Topological Sorting Graph
        Graph topologicalSortingGraph = new Graph();
        topologicalSortingGraph.addVertex("A");
        topologicalSortingGraph.addVertex("B");
        topologicalSortingGraph.addVertex("C");
        topologicalSortingGraph.addVertex("D");
        topologicalSortingGraph.addVertex("E");
        topologicalSortingGraph.addVertex("F");
        topologicalSortingGraph.addVertex("G");
        topologicalSortingGraph.addVertex("H");

        topologicalSortingGraph.addDirectedEdge("A","C");
        topologicalSortingGraph.addDirectedEdge("B","C");
        topologicalSortingGraph.addDirectedEdge("B","D");
        topologicalSortingGraph.addDirectedEdge("C","E");
        topologicalSortingGraph.addDirectedEdge("D","F");
        topologicalSortingGraph.addDirectedEdge("E","F");
        topologicalSortingGraph.addDirectedEdge("F","G");
        topologicalSortingGraph.addDirectedEdge("E","H");
        topologicalSortingGraph.sortTopologically();
    }
}
