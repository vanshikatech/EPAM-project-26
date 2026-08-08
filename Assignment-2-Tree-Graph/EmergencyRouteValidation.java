import java.util.*;

public class EmergencyRouteValidation {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();
        int D = sc.nextInt();

        ArrayList<Integer>[] graph = new ArrayList[N + 1];

        for (int i = 1; i <= N; i++) {
            graph[i] = new ArrayList<>();
        }

        for (int i = 0; i < M; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();

            graph[u].add(v);
            graph[v].add(u);
        }

        int[] dist = new int[N + 1];
        Arrays.fill(dist, -1);

        Queue<Integer> q = new LinkedList<>();

        dist[1] = 0;
        q.offer(1);

        while (!q.isEmpty()) {
            int node = q.poll();

            for (int nei : graph[node]) {
                if (dist[nei] == -1) {
                    dist[nei] = dist[node] + 1;
                    q.offer(nei);
                }
            }
        }

        int count = 0;

        for (int i = 1; i <= N; i++) {
            if (dist[i] != -1 && dist[i] <= D) {
                count++;
            }
        }

        System.out.println(count);
    }
}
