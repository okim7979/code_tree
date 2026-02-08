import java.util.*;
import java.io.*;

class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static StringBuilder sb = new StringBuilder();

    static int N, M;
    static int[][] grid;
    static int[][] visited;

    static int[] dx = {1, 0};
    static int[] dy = {0, 1};

    public static void dfs(int i, int j) {
        visited[i][j] = 1;

        for(int k = 0; k < 2; k++){
            int nx = i + dx[k];
            int ny = j + dy[k];
            
            if(canGo(nx, ny)){
                dfs(nx, ny);
            }
        }
    }

    public static boolean inRange(int i, int j) {
        return i >= 0 && i < N && j >= 0 && j < M;
    }

    public static boolean canGo(int i, int j) {
        if(!inRange(i, j)) return false;
        if(visited[i][j] != 0 || grid[i][j] == 0) return false;
        return true;
    }
    public static void main(String[] args) throws IOException {
        st= new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        grid = new int[N][M];
        visited = new int[N][M];

        for(int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j < M; j++) {
                grid[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        dfs(0, 0);
        int ans = visited[N-1][M-1];

        if(ans == 0){
            System.out.println("0");
        } else {
            System.out.println("1");
        }
    }
}