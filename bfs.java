import java.util.LinkedList;
import java.util.Queue;
public class bfs {
    static int[] visited;
    static int[][] graph;
    static int n;
    static int start;

    public static void bfs(int start) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(start);
        visited[start] = 1;
        while (!queue.isEmpty()) {
            int v = queue.poll();
            System.out.print(v + " ");
            for (int i = 1; i < n; i++) {
                if (graph[v][i] == 1 && visited[i] == 0) {
                    queue.add(i);
                    visited[i] = 1;
                }
            }
        }
    }

    public static void main(String[] args) {
        n = 1;
        graph = new int[][] {
            {5, 0},
            {2, 2}

        };
        start = 1;
        visited = new int[n + 1];
        bfs(start);
    }
}
