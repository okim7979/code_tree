import java.util.*;
import java.io.*;

class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static StringBuilder sb = new StringBuilder();
    static int N, r1, r2, c1, c2;

    static Queue<int[]> q = new LinkedList<>();
    static int[][] visited;

    public static void bfs(){
        int[] dx = {2, 1, -1, -2, -2, -1, 1, 2};
        int[] dy = {-1, -2, -2, -1, 1, 2, 2, 1};

        while(!q.isEmpty()){
            int[] a = q.poll();
            int x = a[0];
            int y = a[1];

            for(int i = 0; i < dx.length; i++){
                int nx = x + dx[i];
                int ny = y + dy[i];

                if(canGo(nx, ny) && visited[nx][ny] == 0){
                    visited[nx][ny] += visited[x][y]+1;
                    q.add(new int[]{nx, ny});
                }
            }
        }
    }

    public static boolean inRange(int x, int y){
        return x >= 0 && x < N && y >= 0 && y < N;
    }

    public static boolean canGo(int x, int y){
        if(!inRange(x,y)) return false;
        return true;
    }

    public static void main(String[] args) throws IOException {
        N = Integer.parseInt(br.readLine().trim());
        st = new StringTokenizer(br.readLine());
        r1 = Integer.parseInt(st.nextToken())-1;
        c1 = Integer.parseInt(st.nextToken())-1;
        r2 = Integer.parseInt(st.nextToken())-1;
        c2 = Integer.parseInt(st.nextToken())-1;

        visited = new int[N][N];
        visited[r1][c1] = 1;
        q.add(new int[]{r1, c1});
        bfs();
        if(visited[r2][c2] == 0){
            System.out.println("-1");
        } else {
            System.out.println(visited[r2][c2] - 1);
        }
    }
}