package DataStructures;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Graph {
    static class  Pair {
        int u, v;
        Pair (int u, int v) {
            this.u = u;
            this.v = v;
        }
    }

    static void printMat(int[][] mat) {
        int n = mat.length;
        for (int i=1; i<n; i++) {
            for (int j=1; j<n; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
    }

    static int[][] createMat(int n, int m, Pair[] edges) {
        int[][] adj = new int[n+1][n+1];

        for (int i=0; i<m; i++) {
            int u = edges[i].u;
            int v = edges[i].v;
            adj[u][v] = 1;
            adj[v][u] = 1;
        }

        return adj;
    }

    static void printAdjList(ArrayList<ArrayList<Integer>> adj) {
        int n = adj.size();
        for (int i=0; i<n; i++) {
            System.out.print(i + "->");
            for (int node : adj.get(i)) {
                System.out.print(node + " ");
            }
            System.out.println();
        }
    }

    static ArrayList<ArrayList<Integer>> listGraph(int n, int m, Pair[] edges) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

        for (int i=0; i<=n; i++) {
            adj.add(new ArrayList<>());
        }
        for (int i=0; i<m; i++) {
            int u = edges[i].u;
            int v = edges[i].v;
            adj.get(u).add(v);
            adj.get(v).add(u);
        }

        return adj;
    }

    static ArrayList<Integer> bfs(int v, ArrayList<ArrayList<Integer>> adj) {
        ArrayList<Integer> result = new ArrayList<>();
        int n = adj.size();
        boolean[] visited = new boolean[n];
        Queue<Integer> q = new LinkedList<>();

        q.add(v);
        visited[v] = true;

        while (!q.isEmpty()) {
            Integer node = q.poll();
            result.add(node);

            for (int neighbour: adj.get(node)) {
                if (!visited[neighbour]) {
                    visited[neighbour] = true;
                    q.add(neighbour);
                }
            }
        }

        return result;
    }

    static void dfsOfGraph(int node, boolean[] visited, ArrayList<ArrayList<Integer>> adj, ArrayList<Integer> ls) {
        visited[node] = true;
        ls.add(node);

        for (int curr : adj.get(node)) {
            if (!visited[curr]) {
                dfsOfGraph(curr, visited, adj, ls);
            }
        }
    }

    static ArrayList<Integer> dfs(int v, ArrayList<ArrayList<Integer>> adj) {
        int n = adj.size();
        boolean[] vis = new boolean[n];
        ArrayList<Integer> result = new ArrayList<>();
        dfsOfGraph(v, vis, adj, result);
        return result;
    }

    public static void main(String[] args) {
        int n = 5, m = 4;
        Pair[] edges = new Pair[m];
        edges[0] = new Pair(1, 2);
        edges[1] = new Pair(1, 3);
        edges[2] = new Pair(2, 4);
        edges[3] = new Pair(4, 5);

//        int[][] mat = createMat(n, m, edges);
//        printMat(mat);

        ArrayList<ArrayList<Integer>> graph = listGraph(n, m, edges);
//        printAdjList(graph);

        ArrayList<Integer> bfsList = bfs(4, graph);
//        System.out.println(bfsList);

        ArrayList<Integer> dfsList = dfs(1, graph);
        System.out.println(dfsList);
    }
}
