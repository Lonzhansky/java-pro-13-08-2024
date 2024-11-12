package ua.hillel.lessons.lesson20._01_graphs._02_adjacency_list._02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class Graph {

    int vertex;
    ArrayList<ArrayList<Integer>> list;

    public static void main(String[] args) {
        Graph adjacencyList = new Graph(4);

        adjacencyList.addEdge(0, 1);
        adjacencyList.addEdge(0, 2);
        adjacencyList.addEdge(0, 3);
        adjacencyList.addEdge(1, 2);

        adjacencyList.printGraph();
    }

    public Graph(int vertex) {
        this.vertex = vertex;
        list = new ArrayList<>();
        for (int i = 0; i < vertex; i++) {
            list.add(new ArrayList<>());
        }
    }

    public void addEdge(int start, int destination) {
        list.get(start).add(destination);
        list.get(destination).add(start);
    }

    public void printGraph() {
        for (int i = 0; i < vertex; i++) {
            System.out.print("Vertex " + i + ": ");
            for (int j = 0; j < list.get(i).size(); j++) {
                System.out.print(" -> " + list.get(i).get(j));
            }
            System.out.println();
        }
    }
}
