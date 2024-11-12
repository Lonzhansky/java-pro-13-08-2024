package ua.hillel.lessons.lesson20._03_search_traversing._02_BFS;

import java.util.LinkedList;

// Breadth First Search (Обхід в ширину).
// Неорієнтований граф.
public class BfsGraphA {

    // Число вершин
    private final int numVerts;
    // Списки суміжності
    private final LinkedList<Integer>[] adjs;


    public static void main(String[] args) {
        // Стартова вершина
        int startVert = 0;
        // Число вершин повинно бути не менше
        // числа елементів в списку.
        // Наприклад, елементи: 0 1 2 3 4.
        // То число вершин - 5.
        // Інакше, помилка ArrayIndexOutOfBoundsException.
        int numItems = 5;

        BfsGraphA graph = new BfsGraphA(numItems);
        // Неорієнтований граф (визначення ребер)
        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 2);
        graph.addEdge(2, 3);
        graph.addEdge(2, 4);
        graph.addEdge(4, 3);
        graph.addEdge(1, 3);
        graph.addEdge(2, 0);

        System.out.println("BFS traversing from vertex " +
                startVert + " :");

        graph.doBfs(startVert);
    }

    BfsGraphA(int v) {
        numVerts = v;
        adjs = new LinkedList[v];
        for (int i = 0; i < v; ++i)
            adjs[i] = new LinkedList<>();
    }

    // Додавання ребра в граф
    void addEdge(int v, int w) {
        adjs[v].add(w);
    }

    // Виводить BFS проходження з заданого джерела
    void doBfs(int s) {
        // Позначає всі вершини як невідвідані (false)
        boolean[] visited = new boolean[numVerts];
        // Створюється черга для BFS
        LinkedList<Integer> queue = new LinkedList<>();

        // Позначає поточний вузол (вершину)
        // як відвіданий та ставить його в чергу
        visited[s] = true;
        queue.add(s);

        while (!queue.isEmpty()) {
            // Видаляє вершину з черги та виводить її
            s = queue.poll();
            System.out.print(s + " ");

            // Отримання всіх суміжних вершин
            // у видаленій вершині s.
            // Якщо сусідній об'єкт не відвідувався,
            // позначається як відвіданий та
            // ставиться у чергу
            for (int n : adjs[s]) {
                if (!visited[n]) {
                    visited[n] = true;
                    queue.add(n);
                }
            }
        }
    }
}
