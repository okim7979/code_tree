import java.util.*;
import java.io.*;

class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static StringBuilder sb = new StringBuilder();
    static int N, M;
    static int[][] grid;
    static int[][] visited;
    static Queue<int[]> q = new ArrayDeque<>();

    public static void bfs() {
        int[] dx = { 1, 0, -1, 0 };
        int[] dy = { 0, -1, 0, 1 };
        while (!q.isEmpty()){
            int[] a = q.poll();
            int cx = a[0];
            int cy = a[1];

            for(int i = 0; i < dx.length; i++){
                int nx = cx + dx[i];
                int ny = cy + dy[i];
                if(canGo(nx, ny) && visited[nx][ny] == 0){
                    visited[nx][ny] = visited[cx][cy] + 1;
                    q.add(new int[]{nx, ny});
                }
            }
        }
    }
    public static boolean inRange(int i, int j){
        return i >= 0 && i < N && j >= 0 && j < N;
    }
    public static boolean canGo(int row, int col){
        if(!inRange(row,col)) return false;
        if(grid[row][col] == 0) return false;
        return true;
    }
    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        grid = new int[N][N];
        visited = new int[N][N];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < M; j++) {
                grid[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        q.add(new int[]{0,0});
        visited[0][0] = 1;
        bfs();
        if(visited[N-1][M-1] == 0){
            sb.append("-1");
        } else {
            sb.append(visited[N-1][M-1]-1);
        }
        System.out.println(sb);
    }
}