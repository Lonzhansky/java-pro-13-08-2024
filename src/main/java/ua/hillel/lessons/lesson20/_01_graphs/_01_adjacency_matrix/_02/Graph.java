package ua.hillel.lessons.lesson20._01_graphs._01_adjacency_matrix._02;

public class Graph {

    int vertex;
    boolean[][] matrix;

    public static void main(String[] args) {

        Graph graph = new Graph(4);

        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(0, 3);
        graph.addEdge(1, 2);

        graph.printGraph();

    }

    public Graph(int vertex) {
        this.vertex = vertex;
        matrix = new boolean[vertex][vertex];
    }

    public void addEdge(int start, int destination) {
        matrix[start][destination] = true;
        matrix[destination][start] = true;
    }

    public void printGraph() {
        System.out.println("Adjacency Matrix");

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < vertex; i++) {
            sb.append(i).append("|");
            for (boolean value : matrix[i]) {
                sb.append(value ? 1 : 0).append(" ");
            }
            sb.append("\n");
        }

        System.out.println("  0 1 2 3\n  - - - -");
        System.out.println(sb);
    }
}
