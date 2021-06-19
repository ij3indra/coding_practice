package me.jatindra.practice.datastructure;

import java.util.Iterator;
import java.util.LinkedList;

public class GraphDfs {

    private LinkedList<Integer> adj[];

    GraphDfs(int v) {

        adj = new LinkedList[v];
        for (int i = 0; i < v; i++) {
            adj[i] = new LinkedList<>();
        }

    }

    private void addEdge(int v, int e) {
        adj[v].add(e);
    }

    private void dfs(int v, boolean visited[]) {
        visited[v] = true;

        System.out.println(v + " ");

        Iterator<Integer> iterator = adj[v].listIterator();
        while (iterator.hasNext()) {
            int n = iterator.next();
            if (!visited[n]) {
                dfs(n, visited);
            }
        }

    }

    public static void main(String aa[]) {
        GraphDfs g = new GraphDfs(4);
        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
        g.addEdge(3, 3);

        System.out.println("Starting traversal from the 2");
        boolean visited[] = new boolean[4];
        g.dfs(2, visited);
    }

}
