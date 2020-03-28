package datastructures.nonlinear.graph.dijkstra;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class WeightedNode<T> implements Comparable<WeightedNode>{

    private T value;
    private List<WeightedNode<T>> edges = new ArrayList<>();
    private int distance = Integer.MAX_VALUE;
    private boolean isVisited;
    private HashMap<WeightedNode,Integer> weightMap = new HashMap<>();
    private WeightedNode<T> parent;

    public WeightedNode<T> getParent() {
        return parent;
    }

    public void setParent(WeightedNode<T> parent) {
        this.parent = parent;
    }

    public WeightedNode(T value){
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public List<WeightedNode<T>> getEdges() {
        return edges;
    }

    public void setEdges(List<WeightedNode<T>> edges) {
        this.edges = edges;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public boolean isVisited() {
        return isVisited;
    }

    public void setVisited(boolean visited) {
        isVisited = visited;
    }

    public HashMap<WeightedNode, Integer> getWeightMap() {
        return weightMap;
    }

    public void setWeightMap(HashMap<WeightedNode, Integer> weightMap) {
        this.weightMap = weightMap;
    }

    @Override
    public boolean equals(Object obj) {
        return this.value == ((WeightedNode)obj).getValue();
    }

    @Override
    public int compareTo(WeightedNode o) {
        return this.distance - o.getDistance();
    }
}
