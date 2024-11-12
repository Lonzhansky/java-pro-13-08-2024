package ua.hillel.lessons.lesson20._03_search_traversing._01_DFS;

import javax.swing.*;
import java.util.LinkedList;

public class DfsGraph {

    int vertex;
    LinkedList<Integer>[] list;

    public static void main(String[] args) {
        int startVertex = 0;
        int numItems = 5;

        DfsGraph graph = new DfsGraph(numItems);
        graph.addEdge(0 , 1);
        graph.addEdge(0 , 2);

        graph.addEdge(1, 2);
        graph.addEdge(1, 3);

        graph.addEdge(2 , 3);
        graph.addEdge(2 , 4);

        graph.addEdge(4 , 3);


        System.out.println("DFS traversing from vertex " + startVertex + " : ");

        graph.doDfs(startVertex);

    }

    void dfsUtil(int v, boolean[] visited) {
        visited[v] = true;
        System.out.println(v + " ");

        for (Integer value : list[v]) {
            if (!visited[value]) {
                dfsUtil(value, visited);
            }
        }
    }


    public void doDfs(int v) {
        boolean[] visited = new boolean[vertex];
        dfsUtil(v, visited);
    }

    public DfsGraph(int vertex) {
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
}
