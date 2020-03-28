package datastructures.nonlinear.graph.dijkstra;

public class DijkstraGraphMain {

    public static void main(String args[]){
        DijkstraGraph graph = new DijkstraGraph();
        graph.addVertex("A");
        graph.addVertex("B");
        graph.addVertex("C");
        graph.addVertex("D");
        graph.addVertex("E");
        graph.addDirectedEdge("A","C",6);
        graph.addDirectedEdge("C","D",2);
        graph.addDirectedEdge("D","C",1);
        graph.addDirectedEdge("D","B",1);
        graph.addDirectedEdge("E","D",2);
        graph.addDirectedEdge("E","B",4);
        graph.addDirectedEdge("B","A",3);
        graph.addDirectedEdge("A","D",6);
        graph.findPathUsingDijkstra("E");
    }
}
