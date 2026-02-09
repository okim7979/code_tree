import java.util.*;
import java.io.*;

class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static StringBuilder sb = new StringBuilder();

    static int N, M;

    static ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
    static int[] visited;
    static int ans = 0;

    public static void dfs(int u) {
        visited[u] = 1;
        for (int v : graph.get(u)) {
            if (visited[v] == 0) {
                ans++;
                dfs(v);
            }
        }
    }
    public static void main(String[] args) throws IOException{
        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        for(int i = 0; i <= N; i++){
            graph.add(new ArrayList<>());
        }

        for(int i = 0; i < M; i++){
            st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            graph.get(u).add(v);
            graph.get(v).add(u);
        }

        visited = new int[N+1];
        dfs(1);

        sb.append(ans).append("\n");
        System.out.println(sb);
    }
}