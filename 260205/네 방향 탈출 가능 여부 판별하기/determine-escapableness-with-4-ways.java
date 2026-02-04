import java.util.*;
import java.io.*;

class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static StringBuilder sb = new StringBuilder();
    static int n;
    static int m;
    static int[][] grid;
    static int[][] visited;
    static boolean fin = false;
    static Queue<int[]> q = new LinkedList<>();

    public static void bfs(){
        int[] dx = {1, 0, -1, 0};
        int[] dy = {0, -1, 0, 1};
        while(!q.isEmpty()){
            int[] cur = q.poll();
            int cx = cur[0];
            int cy = cur[1];

            for(int i = 0; i < 4; i++){
                int nx = cx + dx[i];
                int ny = cy + dy[i];
                if(canGo(nx,ny) && visited[nx][ny] == 0){
                    visited[nx][ny] = 1;
                    q.add(new int[]{nx, ny});
                    if(nx == (n-1) && ny == (m-1)){

                        fin = true;
                        return;
                    }
                }
            }
        }
    }

    public static boolean inRange(int x, int y){
        return x >= 0 && x < n && y >= 0 && y < m;
    }

    public static boolean canGo(int x, int y){
        if(!inRange(x, y)) return false;
        if(grid[x][y] != 1) return false;
        return true;
    }

    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine().trim());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        grid = new int[n][m];
        visited = new int[n][m];

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine().trim());
            for(int j = 0; j < m; j++) {
                grid[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        q.add(new int[]{0,0});
        visited[0][0] = 1;
        bfs();

        if(fin){
            sb.append("1");
        } else {
            sb.append("0");
        }
        System.out.println(sb);

    }
}