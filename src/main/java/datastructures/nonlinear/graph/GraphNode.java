package datastructures.nonlinear.graph;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class GraphNode<T> {

    private T value;
    private List<GraphNode<T>> edges;
    private boolean isVisited;

    public GraphNode(T value){
        this.value = value;
        this.isVisited = false;
        this.edges = new ArrayList<>();
    }
    public T getValue() {
        return value;
    }
    public void setValue(T value) {
        this.value = value;
    }
    public boolean isVisited() {
        return isVisited;
    }

    public List<GraphNode<T>> getEdges() {
        return edges;
    }

    public void setEdges(List<GraphNode<T>> edges) {
        this.edges = edges;
    }

    public void setVisited(boolean visited) {
        isVisited = visited;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GraphNode<?> graphNode = (GraphNode<?>) o;
        return value.equals(graphNode.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
