package ua.hillel.lessons.lesson20._01_graphs._02_adjacency_list._01;

import java.util.LinkedList;

public class AdjacencyList {

    int vertex;
    LinkedList<Integer>[] list;

    public static void main(String[] args) {
        AdjacencyList adjacencyList = new AdjacencyList(4);

        adjacencyList.addEdge(0, 1);
        adjacencyList.addEdge(1, 2);
        adjacencyList.addEdge(2, 3);
        adjacencyList.printGraph();
    }

    public AdjacencyList(int vertex) {
        this.vertex = vertex;
        list = new LinkedList[vertex];
        for (int i = 0; i < vertex; i++) {
            list[i] = new LinkedList<>();
        }
    }

    public void addEdge(int start, int destination) {
        list[start].addFirst(destination);
        list[destination].addFirst(start);
    }

    public void printGraph() {
        for (int i = 0; i < vertex; i++) {
            if (!list[i].isEmpty()) {
                System.out.print("Node " + i + " is connected to ");
                for (int j = 0; j < list[i].size(); j++) {
                    System.out.print(list[i].get(j) + " ");
                }
                System.out.println();
            }
        }
    }
}
